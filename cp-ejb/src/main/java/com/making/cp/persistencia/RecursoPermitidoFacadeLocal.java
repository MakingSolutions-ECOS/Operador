/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidades.RecursoPermitido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface RecursoPermitidoFacadeLocal {

    void create(RecursoPermitido recursoPermitido);

    void edit(RecursoPermitido recursoPermitido);

    void remove(RecursoPermitido recursoPermitido);

    RecursoPermitido find(Object id);

    List<RecursoPermitido> findAll();

    List<RecursoPermitido> findRange(int[] range);

    int count();
    
}
