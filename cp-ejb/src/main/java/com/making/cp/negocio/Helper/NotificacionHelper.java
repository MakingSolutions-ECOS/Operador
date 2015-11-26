/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio.Helper;

import com.making.cp.cliente.notificacion.NotificacionService;
import com.making.cp.cliente.notificacion.NotificacionService_Service;
import com.making.cp.cliente.notificacion.RespuestaService;

/**
 *
 * @author Sergio Forero
 */
public class NotificacionHelper {
    
    /**
     * Obtiene los trámites por estado. Este método es  llamado luego de la ejecución de la tarea programada
     * encargada de verificar qué tramites cuentan con el estado FINALIZADO.     * 
     * @param estado
     * @return
     * @throws Exception 
     */
    
     public RespuestaService notificarRespuestaTramite(Integer codigoCiudadano)throws Exception{
        RespuestaService respuestaService = null;

        try {
            NotificacionService_Service service = new NotificacionService_Service();

            NotificacionService port = service.getNotificacionServicePort();

            respuestaService= port.obtenerNotificacionCiudadano(codigoCiudadano);
        } catch (Exception e) {           
            throw e;
        }
        return respuestaService;
    }
    
}
