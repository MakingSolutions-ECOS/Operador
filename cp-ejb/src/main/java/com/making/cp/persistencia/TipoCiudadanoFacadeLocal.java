/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidad.TipoCiudadano;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sergio Forero
 */
@Local
public interface TipoCiudadanoFacadeLocal {

    void create(TipoCiudadano tipoCiudadano);

    void edit(TipoCiudadano tipoCiudadano);

    void remove(TipoCiudadano tipoCiudadano);

    TipoCiudadano find(Object id);

    List<TipoCiudadano> findAll();

    List<TipoCiudadano> findRange(int[] range);

    int count();
    
}
