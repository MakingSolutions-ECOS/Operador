package com.making.cp.persistencia;

import com.making.cp.dto.DocumentoDto;
import com.making.cp.entidad.Documento;
import com.making.cp.utilidad.Mapper;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author John Dany
 */
@Stateless
public class DocumentoFacade extends AbstractFacade<Documento> implements DocumentoFacadeLocal {
    @PersistenceContext(unitName = "com.making.cp_cp-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocumentoFacade() {
        super(Documento.class);
    }

    @Override
    public List<DocumentoDto> findByCiudadano(Object id) {
        List<Documento> documentosPorCiudadano = em.createNamedQuery("findDocumentoByUsuario", Documento.class).setParameter("codigoCiudadano", id).getResultList();
        List<DocumentoDto> documentoDtos = new ArrayList<DocumentoDto>();
        if (documentosPorCiudadano != null && documentosPorCiudadano.size() > 0) {
            for (Documento doc : documentosPorCiudadano) {
                try {
                    documentoDtos.add(Mapper.copyCompleto(doc, DocumentoDto.class, false));
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DocumentoFacade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return  documentoDtos;
    }
    
}
