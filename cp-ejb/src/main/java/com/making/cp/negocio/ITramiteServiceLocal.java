/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import javax.ejb.Local;

/**
 *
 * @author Camilo Marroquin
 */
@Local
public interface ITramiteServiceLocal {
    
    public void obtenerEmisores();
}