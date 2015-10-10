/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidades.Publicidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface PublicidadFacadeLocal {

    void create(Publicidad publicidad);

    void edit(Publicidad publicidad);

    void remove(Publicidad publicidad);

    Publicidad find(Object id);

    List<Publicidad> findAll();

    List<Publicidad> findRange(int[] range);

    int count();
    
}
