/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.tramite.TramiteDefinicionDto;
import com.making.cp.dto.CiudadanoDto;
import com.making.cp.dto.SolicitudTramiteDto;
import com.making.cp.entidad.Documento;
import com.making.cp.negocio.Helper.TramiteHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
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
    
    @Override
    public void consultarEstadosTramite(){
        System.out.println("Consulto trámite");
    }

}
