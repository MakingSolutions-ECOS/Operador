/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.emisor.EmisorDto;
import com.making.cp.cliente.emisor.EmisorService;
import com.making.cp.cliente.emisor.EmisorService_Service;
import com.making.cp.cliente.RespuestaEmisor;
import java.util.List;

/**
 *
 * @author Camilo Marroquin
 */
public class TramiteServiceBean implements ITramiteServiceLocal{

    @Override
    public List<EmisorDto> obtenerEmisores() {
        
        try {
            EmisorService_Service service = new EmisorService_Service();
        
            EmisorService port = service.getEmisorServicePort();

            RespuestaEmisor respuestaEmisor = port.obtenerEmisores();
            
            return respuestaEmisor.getEmisores();          
            
            
        } catch (Exception e) {
            //Error de invocación
            
        }
        return null;
    }  
}
