/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio.Helper;

import com.making.cp.cliente.tramite.RespuestaTramite;
import com.making.cp.cliente.tramite.RespuestaTramiteDefinicion;
import com.making.cp.cliente.tramite.TramiteDefinicionDto;
import com.making.cp.cliente.tramite.TramiteDto;
import com.making.cp.cliente.tramite.TramiteService;
import com.making.cp.cliente.tramite.TramiteService_Service;
import java.util.List;

/**
 *
 * @author Your Name
 */
public class TramiteHelper {
    public List<TramiteDefinicionDto> obtenerTramitesDefinicion()throws Exception{
        RespuestaTramiteDefinicion respuestaTramiteDefinicion = null;

        try {
            TramiteService_Service service = new TramiteService_Service();

            TramiteService port = service.getTramiteServicePort();

            respuestaTramiteDefinicion = port.obtenerTramitesDefinicion();
        } catch (Exception e) {           
            throw e;
        }
        return respuestaTramiteDefinicion.getTramiteDefinicionDtos();
    }
    /**
     * Obtiene los trámites por estado. Este método es  llamado luego de la ejecución de la tarea programada
     * encargada de verificar qué tramites cuentan con el estado FINALIZADO.     * 
     * @param estado
     * @return
     * @throws Exception 
     */
    
     public List<TramiteDto> obtenerTramitesEstado(Integer estado)throws Exception{
        RespuestaTramite respuestaTramite = null;

        try {
            TramiteService_Service service = new TramiteService_Service();

            TramiteService port = service.getTramiteServicePort();

            respuestaTramite= port.obtenerTramitesPorEstado(estado);
        } catch (Exception e) {           
            throw e;
        }
        return respuestaTramite.getTramiteDtos();
    }

}
