/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.notificacion.NotificacionDto;
import com.making.cp.cliente.tramite.SolicitudTramiteDto;
import com.making.cp.cliente.tramite.TramiteDefinicionDto;
import com.making.cp.cliente.tramite.TramiteDto;
import com.making.cp.dto.CiudadanoDto;
import com.making.cp.entidad.Documento;
import com.making.cp.negocio.Helper.ConstantesOperador;
import com.making.cp.negocio.Helper.NotificacionHelper;
import com.making.cp.negocio.Helper.TramiteHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camilo Marroquin
 */
@Stateless(mappedName = "TramiteServiceBean")
public class TramiteServiceBean implements ITramiteServiceLocal {

 @Resource(mappedName = "jms/tramiteQueueFactory")
    private QueueConnectionFactory queueConnectionFactory;
    /**
     * Cola de los correos creada en el servidor
     */
    @Resource(mappedName = "jms/ejecucionTramiteQueue")
    private Queue queue;

    @PersistenceContext
    EntityManager em;

    /**
     * Obtiene los documentos faltantes del tramite a realizar
     *
     * @param ids
     * @param codigoUsuario
     * @return
     */
    @Override
    public List<Integer> getDocumentosFaltantes(List<Integer> ids, Integer codigoUsuario, CiudadanoDto ciudadanoDto) {
        List<Documento> lista = em.createNamedQuery("Documento.findDocumentoByUsuario").setParameter("codigoCiudadano", codigoUsuario).getResultList();
        List<Integer> listaFaltante = new ArrayList<>();
        listaFaltante = new ArrayList(ids);
        for (int i = 0; i < ids.size(); i++) {
            for (Documento documento : lista) {
                if (lista.get(i).getCodigoDocumento().equals(documento.getCodigoDocumento())) {
                    listaFaltante.remove(i);
                    break;
                }
            }
        }
        if (listaFaltante.isEmpty()) {
//            publicarMensajeTramite(ciudadanoDto);
        }
        return listaFaltante;
    }

public String publicarMensajeTramite(Integer ciudadanoDto, TramiteDto dto) {
        Calendar calendario = Calendar.getInstance();
        System.out.println("INFO: Inicia publicación de mensaje trámite en cola hacia TramiteServiceMDBean.: " + calendario.get(Calendar.HOUR_OF_DAY) + " " + calendario.get(Calendar.MINUTE) + calendario.get(Calendar.SECOND));
        QueueConnection connection = null;
        QueueSession session = null;
        MessageProducer sender = null;

        try {
            connection = queueConnectionFactory.createQueueConnection();

        } catch (JMSException ex) {
            Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            sender = session.createProducer(queue);

            ObjectMessage message = session.createObjectMessage();
            message.setIntProperty("codigoCiudadano", ciudadanoDto);
            sender.send(message);

        } catch (JMSException ex) {
            Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Su trámite inició el procesamiento exitosamente";
    }

    
   @Override
    public void enviarSolicitudTramite(SolicitudTramiteDto solicitudTramiteDto) {
        TramiteHelper tramiteHelper = new TramiteHelper();
        try {
            tramiteHelper.iniciarTramite(solicitudTramiteDto);
            Calendar calendario = Calendar.getInstance();
            System.out.println("INFO: Se consumió servicio de Tramite Servicio exitosamente.: Operación.: Iniciar Trámite" + calendario.get(Calendar.HOUR_OF_DAY) + " " + calendario.get(Calendar.MINUTE) + calendario.get(Calendar.SECOND));
        } catch (Exception ex) {
            Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<TramiteDefinicionDto> obtenerTramiteDefinicion() throws Exception {
        TramiteHelper tramiteHelper = new TramiteHelper();
        return tramiteHelper.obtenerTramitesDefinicion();
    }
    
    /**
     * Método que invoca el servicio Trámite Service para obtener los estados y
     * actualizar el estado de los trámites Consume el servicio de notificación
     * para informar al ciudadano sobre el estado del trámite
     *
     * @param
     * @param estado
     */
    @Override
    public void consultarEstadosTramite(Integer estado) {
        System.out.println("Inicia consulta de  trámite");
        TramiteHelper tramiteHelper = new TramiteHelper();
        NotificacionHelper notificacionHelper = new NotificacionHelper();
        List<TramiteDto> tramitesDto = null;
        try {
            tramitesDto = tramiteHelper.obtenerTramitesEstado(estado);
        } catch (Exception ex) {
            System.out.println("Error en la consulta de tramites por estado");
            Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (TramiteDto tramiteDto : tramitesDto) {
            try {
                //Actualización de estados de trámite
                //Se actualiza estado del trámite y se descarga el documento respuesta relacionado con el trámite para
                //alojarlo en la carpeta ciudadano.
                System.out.println("Tramite en estado FINALIZADO: Código Trámite" + tramiteDto.getCodigoTramite() + " - Entidad Emisora: " + tramiteDto.getCodigoTramiteDefinicion().getCodigoEntidadEmisora().getNombreEntidadEmisora());
                tramiteHelper.cambiarEstadoTramiteProceso(tramiteDto.getCodigoTramite(), tramiteDto.getCodigoTramiteDefinicion().getCodigoEntidadEmisora().getCodigoEntidadEmisora(), ConstantesOperador.ESTADO_TRAMITE_NOTIFICADO);
                try {
                    //Invocación de servicio de notificación
                    //Notifica al usuario la respuesta de su trámite
                    NotificacionDto notificacionDto = new NotificacionDto();
                    notificacionDto.setUrlAdjunto("urlRepositorio");
                    notificacionDto.setRemitente(tramiteDto.getCodigoTramiteDefinicion().getCodigoEntidadEmisora().getNombreEntidadEmisora());
                    notificacionDto.setMensaje("Su trámite fué respondido por la entidad emisora, consulte sus documentos en la ubicación: Documentos recibidos de su carpeta ciudadana");
                    com.making.cp.cliente.notificacion.CiudadanoDto ciudadanoDto  = new com.making.cp.cliente.notificacion.CiudadanoDto();
                    ciudadanoDto.setCodigoCiudadano(tramiteDto.getCodigoCiudadano().getCodigoCiudadano());
                    notificacionDto.setCodigoCiudadano(ciudadanoDto);
                    notificacionHelper.notificarRespuestaTramite(notificacionDto);
                } catch (Exception ex) {
                    Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (Exception ex) {
                Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 @Override
    public void obtenerTramitesCiudadano(Integer codigoCiudadano){
    TramiteHelper tramiteHelper = new TramiteHelper();
        try {
            tramiteHelper.obtenerTramites(codigoCiudadano);
        } catch (Exception ex) {
            Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
