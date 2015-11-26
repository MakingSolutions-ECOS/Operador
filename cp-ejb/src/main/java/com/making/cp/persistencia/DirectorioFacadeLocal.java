/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidad.Directorio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sergio Forero
 */
@Local
public interface DirectorioFacadeLocal {

    void create(Directorio directorio);

    void edit(Directorio directorio);

    void remove(Directorio directorio);

    Directorio find(Object id);

    List<Directorio> findAll();

    List<Directorio> findRange(int[] range);

    int count();
    
}
