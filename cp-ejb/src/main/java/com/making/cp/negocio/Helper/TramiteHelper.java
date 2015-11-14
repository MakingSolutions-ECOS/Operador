/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio.Helper;

import com.making.cp.cliente.tramite.RespuestaTramiteDefinicion;
import com.making.cp.cliente.tramite.TramiteDefinicionDto;
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

}
