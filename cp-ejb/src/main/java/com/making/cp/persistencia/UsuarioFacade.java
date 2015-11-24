/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidad.Ciudadano;
import com.making.cp.entidad.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
@Stateless(mappedName = "UsuarioFacade")
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "com.making.cp_cp-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public Integer validarUsuario(String usuario, String contrasenia) {
        Query q = em.createQuery("SELECT u FROM Usuario u where u.claveUsuario = :claveUsuario AND u.identificacion = :identificacion");
        q.setParameter("claveUsuario", contrasenia);
        q.setParameter("identificacion", usuario);
        List<Usuario> respuesta = q.getResultList();
        if (!respuesta.isEmpty()) {
            Query q2 = em.createQuery("SELECT c FROM Ciudadano c WHERE c.numeroIdentificacion = :numeroIdentificacion");
            q2.setParameter("numeroIdentificacion", usuario);
            List<Ciudadano> ciudadano = q2.getResultList();
            return ciudadano.get(0).getCodigoCiudadano();
        } else {
            return -1;
        }
    }

}
