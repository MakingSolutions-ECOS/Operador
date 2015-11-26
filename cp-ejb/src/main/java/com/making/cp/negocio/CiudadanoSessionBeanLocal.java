/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import javax.ejb.Local;

/**
 *
 * @author Sergio Forero
 */
@Local
public interface CiudadanoSessionBeanLocal {
    
    public Integer getCodigoCiudadano();

    public void setCodigoCiudadano(Integer codigoCiudadano) ;
}
