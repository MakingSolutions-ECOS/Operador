/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.entidad.Directorio;
import com.making.cp.entidad.Documento;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camilo Marroquin
 */
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
    public HashMap <Integer,Documento>  getDocumentosValidados(List<Integer> ids, String codigoUsuario) {
        List<Documento> lista = em.createNamedQuery("Documento.findDocumentoByUsuario").setParameter("codigoUsuario", codigoUsuario).getResultList();        
        HashMap <Integer,Documento> encontrados= new HashMap<>();
        for (Documento documento : lista) {
            for (Integer id : ids) {
                if (documento.getCodigoDocumento().equals(id)){                     
                    encontrados.put(documento.getCodigoDocumento(), documento);                    
                }
            }
        }        
        return encontrados;
    }

}
