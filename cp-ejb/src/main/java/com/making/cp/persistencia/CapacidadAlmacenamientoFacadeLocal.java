/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidades.CapacidadAlmacenamiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface CapacidadAlmacenamientoFacadeLocal {

    void create(CapacidadAlmacenamiento capacidadAlmacenamiento);

    void edit(CapacidadAlmacenamiento capacidadAlmacenamiento);

    void remove(CapacidadAlmacenamiento capacidadAlmacenamiento);

    CapacidadAlmacenamiento find(Object id);

    List<CapacidadAlmacenamiento> findAll();

    List<CapacidadAlmacenamiento> findRange(int[] range);

    int count();
    
}
