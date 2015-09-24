/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.EmisorService;
import com.making.cp.cliente.EmisorService_Service;
import com.making.cp.cliente.RespuestaEmisor;

/**
 *
 * @author Camilo Marroquin
 */
public class TramiteServiceBean implements ITramiteServiceLocal{

    @Override
    public void obtenerEmisores() {
        
        try {
            EmisorService_Service service = new EmisorService_Service();
        
            EmisorService port = service.getEmisorServicePort();

            RespuestaEmisor respuestaEmisor = port.obtenerEmisores();
            
            respuestaEmisor = port.obtenerEmisores();
            
            
            
        } catch (Exception e) {
            //Error de invocación
            
        }
        
    }  
}
