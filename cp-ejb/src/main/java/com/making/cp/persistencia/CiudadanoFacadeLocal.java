/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidad.Ciudadano;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sergio Forero
 */
@Local
public interface CiudadanoFacadeLocal {

    void create(Ciudadano ciudadano);

    void edit(Ciudadano ciudadano);

    void remove(Ciudadano ciudadano);

    Ciudadano find(Object id);

    List<Ciudadano> findAll();

    List<Ciudadano> findRange(int[] range);

    int count();
    
}
