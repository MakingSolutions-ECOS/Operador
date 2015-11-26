/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidad.PublicidadImagen;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sergio Forero
 */
@Stateless
public class PublicidadImagenFacade extends AbstractFacade<PublicidadImagen> implements PublicidadImagenFacadeLocal {
    @PersistenceContext(unitName = "com.making.cp_cp-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PublicidadImagenFacade() {
        super(PublicidadImagen.class);
    }
    
}
