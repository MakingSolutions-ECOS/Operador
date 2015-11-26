/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.co.cliente.ciudadano.CiudadanoDto;
import javax.ejb.Local;

/**
 *
 * @author Camilo Marroquin
 */
@Local
public interface ICiudadanoServiceBean {
   CiudadanoDto obtenerCiudadanoPorCodigo(String codigoOperador, Integer codigoCiudadano) throws Exception;
}
