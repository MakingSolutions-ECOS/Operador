/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio.Helper;

import com.making.cp.cliente.emisor.EmisorDto;
import com.making.cp.cliente.emisor.EmisorService;
import com.making.cp.cliente.emisor.EmisorService_Service;
import com.making.cp.cliente.emisor.RespuestaEmisor;
import java.util.List;

/**
 *
 * @author Camilo Marroquin
 */
public class EmisorHelper {

    public List<EmisorDto> obtenerEmisores() {
        RespuestaEmisor respuestaEmisor = null;

        try {
            EmisorService_Service service = new EmisorService_Service() ;

            EmisorService port = service.getEmisorServicePort();

            respuestaEmisor = port.obtenerEmisores();
        } catch (Exception e) {           
            throw e;
        }
        return respuestaEmisor.getEmisores();
    }
}
