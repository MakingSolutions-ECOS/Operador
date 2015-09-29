/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.RespuestaEmisor;
import com.making.cp.cliente.emisor.EmisorDto;
import com.making.cp.cliente.emisor.EmisorService;
import com.making.cp.cliente.emisor.EmisorService_Service;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Camilo Marroquin
 */
@Stateless
public class EmisorServiceBean implements IEmisorServiceBean{
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
