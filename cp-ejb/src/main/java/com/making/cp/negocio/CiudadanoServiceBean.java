/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.co.cliente.ciudadano.CiudadanoDto;
import com.making.co.cliente.ciudadano.CiudadanoService;
import com.making.co.cliente.ciudadano.CiudadanoService_Service;
import com.making.co.cliente.ciudadano.RespuestaCiudadano;

import javax.ejb.Stateless;

/**
 *
 * @author Camilo Marroquin
 */
@Stateless
public class CiudadanoServiceBean implements ICiudadanoServiceBean {

    @Override
    public CiudadanoDto obtenerCiudadanoPorCodigo(String codigoOperador, Integer codigoCiudadano) throws Exception{
        CiudadanoDto ciudadano = null;
    
        CiudadanoService_Service servicio = new CiudadanoService_Service();
        CiudadanoService ciudadanoService = servicio.getCiudadanoServicePort();
        RespuestaCiudadano respuesta =  ciudadanoService.obtenerCiudadanoPorCodigoIdentificador(codigoOperador, codigoCiudadano);
         if (respuesta != null) {
            if (respuesta.isSePresentoError()) {
                throw new Exception(respuesta.getErrorMensaje() + " *** " + respuesta.getErrorOriginal() + "***");
            }
            ciudadano = respuesta.getCiudadanoDto();
        
    }
         return ciudadano;
    }
    
    
}
