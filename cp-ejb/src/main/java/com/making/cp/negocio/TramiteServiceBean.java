/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;


import com.making.cp.cliente.tramite.TramiteDefinicionDto;
import com.making.cp.dto.TramiteDto;
import com.making.cp.entidad.Documento;
import com.making.cp.negocio.Helper.TramiteHelper;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camilo Marroquin
 */
@Stateless(mappedName = "TramiteServiceBean")
public class TramiteServiceBean implements ITramiteServiceLocal {

    @PersistenceContext
    EntityManager em;

    /**
     * Obtiene los documentos faltantes del tramite a realizar
     *
     * @param ids
     * @param codigoUsuario
     * @return
     */
    @Override
    public List<Documento>   getDocumentosFaltantes(List<Integer> ids, String codigoUsuario) {
        List<Documento> lista = em.createNamedQuery("Documento.findDocumentoByUsuario").setParameter("codigoUsuario", codigoUsuario).getResultList(); 
        for (int i=0; i<lista.size();i++) {
            for (Integer id : ids) {
                if (lista.get(i).equals(id)){                     
                    lista.remove(i);
                }
            }
        }        
        return lista;
    }
    public  List<TramiteDefinicionDto> obtenerTramiteDefinicion() throws Exception{
        TramiteHelper tramiteHelper = new TramiteHelper();
        return tramiteHelper.obtenerTramitesDefinicion();        
    }
}
