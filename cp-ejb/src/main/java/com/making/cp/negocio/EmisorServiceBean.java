/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.emisor.RespuestaEmisor;
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
public class EmisorServiceBean implements IEmisorServiceLocal{
     @Override
    public List<EmisorDto> obtenerEmisores() {
        
      
        return null;
    }  
}
