/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidades.MarcaDirectorio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface MarcaDirectorioFacadeLocal {

    void create(MarcaDirectorio marcaDirectorio);

    void edit(MarcaDirectorio marcaDirectorio);

    void remove(MarcaDirectorio marcaDirectorio);

    MarcaDirectorio find(Object id);

    List<MarcaDirectorio> findAll();

    List<MarcaDirectorio> findRange(int[] range);

    int count();
    
}
