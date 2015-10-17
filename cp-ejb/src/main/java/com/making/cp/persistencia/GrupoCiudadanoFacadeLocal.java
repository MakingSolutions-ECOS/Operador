/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidad.GrupoCiudadano;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface GrupoCiudadanoFacadeLocal {

    void create(GrupoCiudadano grupoCiudadano);

    void edit(GrupoCiudadano grupoCiudadano);

    void remove(GrupoCiudadano grupoCiudadano);

    GrupoCiudadano find(Object id);

    List<GrupoCiudadano> findAll();

    List<GrupoCiudadano> findRange(int[] range);

    int count();
    
}
