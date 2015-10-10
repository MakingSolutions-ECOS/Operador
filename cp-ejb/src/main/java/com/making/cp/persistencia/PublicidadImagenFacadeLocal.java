/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidades.PublicidadImagen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface PublicidadImagenFacadeLocal {

    void create(PublicidadImagen publicidadImagen);

    void edit(PublicidadImagen publicidadImagen);

    void remove(PublicidadImagen publicidadImagen);

    PublicidadImagen find(Object id);

    List<PublicidadImagen> findAll();

    List<PublicidadImagen> findRange(int[] range);

    int count();
    
}
