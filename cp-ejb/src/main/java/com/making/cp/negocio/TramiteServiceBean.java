/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.entidad.Directorio;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camilo Marroquin
 */
public class TramiteServiceBean implements ITramiteServiceLocal{

    @PersistenceContext 
    EntityManager em;
    
    /**
     * Obtiene los documentos faltantes del tramite a realizar
     * @param ids
     * @param codigoUsuario
     * @return 
     */
    @Override
    public List<String> GetDocumentosFaltante(List<String> ids, String codigoUsuario) {
        List<String> DocumentosFaltantes = new ArrayList<>();
        List<Directorio> lista = em.createNamedQuery("Directorio.findByUsuario").setParameter("codigoUsuario", codigoUsuario).getResultList();
        
//        for (Directorio documento : lista){
//            if (documento.getcodi) {
//                
//            }
//        }
        return DocumentosFaltantes;
    }
    
}
