package com.making.cp.controladores;

import com.making.cp.dto.DocumentoDto;
import com.making.cp.entidad.Documento;
import com.making.cp.persistencia.DocumentoFacadeLocal;
import com.making.cp.utilidad.Mapper;
import entidades.util.JsfUtil;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;

/**
 *
 * @author John Dany
 */
@Named(value = "documentoManagedBean")
@SessionScoped
public class DocumentoManagedBean implements Serializable {

    @EJB(beanName = "DocumentoFacade")
    private DocumentoFacadeLocal ejbDocFacade;

    private DocumentoDto selected;

    private List<DocumentoDto> documentoDtos;

    /**
     * Creates a new instance of DocumentoManagedBean
     */
    public DocumentoManagedBean() {
    }

    public DocumentoDto getSelected() {
        return selected;
    }

    public void setSelected(DocumentoDto selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private DocumentoFacadeLocal getFacade() {
        return ejbDocFacade;
    }

    public DocumentoDto prepareCreate() {
        selected = new DocumentoDto();
        initializeEmbeddableKey();
        return selected;
    }

    public void findByCiudadano(Integer id) throws ClassNotFoundException {
        documentoDtos = this.getFacade().findByCiudadano(id);       
    }

    public void create() {
        persist(JsfUtil.PersistAction.CREATE, "Documento creado exitosamente");
        if (!JsfUtil.isValidationFailed()) {
        }
    }

    public void update() {
        persist(JsfUtil.PersistAction.UPDATE, "Documento modificado exitosamente");
    }

    public void destroy() {
        persist(JsfUtil.PersistAction.DELETE, "Documento eliminado exitosamentes");
        if (!JsfUtil.isValidationFailed()) {
            selected = null;
        }
    }

    private void persist(JsfUtil.PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != JsfUtil.PersistAction.DELETE) {
                    getFacade().edit(Mapper.copyCompleto(selected, Documento.class, false));
                } else {
                    getFacade().remove(Mapper.copyCompleto(selected, Documento.class, false));
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, "Error: " + ex.getMessage());
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, "Error: " + ex.getMessage());
            }
        }
    }
}
