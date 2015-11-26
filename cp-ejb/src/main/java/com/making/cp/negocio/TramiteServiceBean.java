/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.tramite.TramiteDefinicionDto;
import com.making.cp.cliente.tramite.TramiteDto;
import com.making.cp.dto.CiudadanoDto;
import com.making.cp.entidad.Documento;
import com.making.cp.negocio.Helper.ConstantesOperador;
import com.making.cp.negocio.Helper.NotificacionHelper;
import com.making.cp.negocio.Helper.TramiteHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camilo Marroquin
 */
@Stateless(mappedName = "TramiteServiceBean")
public class TramiteServiceBean implements ITramiteServiceLocal {

//    @Resource(mappedName = "jms/tramiteQueueFactory")
//    private QueueConnectionFactory queueConnectionFactory;
//    /**
//     * Cola de los correos creada en el servidor
//     */
//    @Resource(mappedName = "jms/ejecucionTramiteQueue")
//    private Queue queue;
//
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

//    public void publicarMensajeTramite(CiudadanoDto ciudadanoDto) {
//        
//        QueueConnection connection = null;
//        QueueSession session = null;
//        MessageProducer sender = null;
//        SolicitudTramiteDto solicitudTramiteDto = new SolicitudTramiteDto();
//        solicitudTramiteDto.setCiudadano(ciudadanoDto);
//
//      
//        try {
//            connection = queueConnectionFactory.createQueueConnection();
//        } catch (JMSException ex) {
//            Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
//        } catch (JMSException ex) {
//            Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            
//                     
//
//    }

    
    @Override
    public List<TramiteDefinicionDto> obtenerTramiteDefinicion() throws Exception {
        TramiteHelper tramiteHelper = new TramiteHelper();
        return tramiteHelper.obtenerTramitesDefinicion();
    }
    
    /**
     * 
     * @param codigoCiudadano
     * @param estado 
     */
    @Override
    public void consultarEstadosTramite( Integer estado){
        System.out.println("Inicia consulta de  trámite");
        TramiteHelper tramiteHelper = new TramiteHelper();
        NotificacionHelper notificacionHelper = new NotificacionHelper();
        List<TramiteDto> tramitesDto=null;
        try {
             tramitesDto= tramiteHelper.obtenerTramitesEstado(estado);
        } catch (Exception ex) {
            System.out.println("Error en la consulta de tramites por estado");
            Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(TramiteDto tramiteDto:tramitesDto){
            try {
                //Actualización de estados de trámite
                //Se actualiza estado del trámite y se descarga el documento respuesta relacionado con el trámite para
                //alojarlo en la carpeta ciudadano.
                System.out.println("Tramite en estado FINALIZADO: " + tramiteDto.getCodigoTramite() + " - Entidad Emisora: " + tramiteDto.getCodigoTramiteDefinicion().getCodigoEntidadEmisora());
                tramiteHelper.cambiarEstadoTramiteProceso(tramiteDto.getCodigoTramite(),tramiteDto.getCodigoTramiteDefinicion().getCodigoEntidadEmisora().getCodigoEntidadEmisora(),ConstantesOperador.ESTADO_TRAMITE_NOTIFICADO);
            } catch (Exception ex) {
                Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            //Invocación de servicio de notificación
            //Notifica al usuario la respuesta de su trámite
           // notificacionHelper.notificarRespuestaTramite(codigoCiudadano);
        } catch (Exception ex) {
            Logger.getLogger(TramiteServiceBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
