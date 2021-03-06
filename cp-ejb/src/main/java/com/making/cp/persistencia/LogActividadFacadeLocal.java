/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidad.LogActividad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sergio Forero
 */
@Local
public interface LogActividadFacadeLocal {

    void create(LogActividad logActividad);

    void edit(LogActividad logActividad);

    void remove(LogActividad logActividad);

    LogActividad find(Object id);

    List<LogActividad> findAll();

    List<LogActividad> findRange(int[] range);

    int count();
    
}
