/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidades.RolRecursoPermitido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface RolRecursoPermitidoFacadeLocal {

    void create(RolRecursoPermitido rolRecursoPermitido);

    void edit(RolRecursoPermitido rolRecursoPermitido);

    void remove(RolRecursoPermitido rolRecursoPermitido);

    RolRecursoPermitido find(Object id);

    List<RolRecursoPermitido> findAll();

    List<RolRecursoPermitido> findRange(int[] range);

    int count();
    
}
