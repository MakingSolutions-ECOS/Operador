/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 *
 * @author Your Name
 */
@Stateful
public class CiudadanoSessionBean implements CiudadanoSessionBeanLocal {

    private Integer codigoCiudadano;
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public Integer getCodigoCiudadano() {
        return codigoCiudadano;
    }

    public void setCodigoCiudadano(Integer codigoCiudadano) {
        this.codigoCiudadano = codigoCiudadano;
    }
    
    
}
