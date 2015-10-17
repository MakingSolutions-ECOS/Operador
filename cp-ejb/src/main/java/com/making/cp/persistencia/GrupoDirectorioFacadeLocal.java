/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidades.GrupoDirectorio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface GrupoDirectorioFacadeLocal {

    void create(GrupoDirectorio grupoDirectorio);

    void edit(GrupoDirectorio grupoDirectorio);

    void remove(GrupoDirectorio grupoDirectorio);

    GrupoDirectorio find(Object id);

    List<GrupoDirectorio> findAll();

    List<GrupoDirectorio> findRange(int[] range);

    int count();
    
}
