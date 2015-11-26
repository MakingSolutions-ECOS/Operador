/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio.Helper;

import com.making.cp.cliente.notificacion.NotificacionDto;
import com.making.cp.cliente.notificacion.NotificacionService;
import com.making.cp.cliente.notificacion.NotificacionService_Service;
import com.making.cp.cliente.notificacion.RespuestaService;

/**
 *
 * @author Sergio Forero
 */
public class NotificacionHelper {
    
    /**
     * Notifica sobre trámite a ciudadano    * 
     * @param notificacionDto
     * @return
     * @throws Exception 
     */
    
     public RespuestaService notificarRespuestaTramite(NotificacionDto notificacionDto)throws Exception{
        RespuestaService respuestaService = null;

        try {
            NotificacionService_Service service = new NotificacionService_Service();

            NotificacionService port = service.getNotificacionServicePort();

            respuestaService= port.asignarNotificacion(notificacionDto);
        } catch (Exception e) {           
            throw e;
        }
        return respuestaService;
    }
    
}
