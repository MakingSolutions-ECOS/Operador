package com.making.cp.controladores;

import com.making.cp.dto.CiudadanoDto;
import com.making.cp.dto.DirectorioDocumentoDto;
import com.making.cp.dto.DocumentoDto;
import com.making.cp.dto.GrupoDocumentoDto;
import com.making.cp.entidad.Documento;
import com.making.cp.persistencia.DocumentoFacadeLocal;
import com.making.cp.utilidad.Mapper;
import entidades.util.JsfUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.primefaces.event.FileUploadEvent;

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

    private DocumentoDto documentoASubir;

    private List<DocumentoDto> documentoDtos;

    /**
     * Creates a new instance of DocumentoManagedBean
     */
    public DocumentoManagedBean() {
    }

    @PostConstruct
    public void init() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        Integer codCiudadano = (Integer) session.getAttribute("codCiudadano");
        try {
            findByCiudadano(codCiudadano);
        } catch (Exception e) {
        }

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

    public void handleFileUpload(FileUploadEvent event) throws IOException {
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
        String rutaServidor = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");

        if (rutaServidor != null) {
            rutaServidor = rutaServidor + "CarpetaCiudadana\\";
            File directorio = new File(rutaServidor);
            if (!directorio.isDirectory()) {
                directorio.mkdir();
            }

            this.guardarArchivo(rutaServidor, event.getFile().getFileName(), event.getFile().getInputstream());
            FacesContext context = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            Integer codCiudadano = (Integer) session.getAttribute("codCiudadano");
            this.documentoASubir = new DocumentoDto();
            this.documentoASubir.setCodigoDocumento(9);
            this.documentoASubir.setCodigoDirectorioDocuento(new DirectorioDocumentoDto(1));
            this.documentoASubir.setCodigoCiudadano(new CiudadanoDto(codCiudadano));
            this.documentoASubir.setCodigoTipoMetadataCentralizador(1);
            this.documentoASubir.setFechaCreacionDirectorio(new Date());
            this.documentoASubir.setFechaModificacion(new Date());
            this.documentoASubir.setNombreDocumento(event.getFile().getFileName());
            this.documentoASubir.setRutaFisicaDirectorio(rutaServidor);
            this.documentoASubir.setRutaLogicaDocumento(rutaServidor);
            this.documentoASubir.setCodigoGrupoDocumento(new GrupoDocumentoDto(1));
            try {
                this.create();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DocumentoManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void guardarArchivo(String directorio, String fileName, InputStream in) throws FileNotFoundException, IOException {
        OutputStream out = new FileOutputStream(new File(directorio + fileName));
        int read = 0;
        byte[] bytes = new byte[1024];
        while ((read = in.read(bytes)) != -1) {
            out.write(bytes, 0, read);
        }
        in.close();
        out.flush();
        out.close();
        System.out.println("New file created!");
    }

    public void findByCiudadano(Integer id) throws ClassNotFoundException {
        documentoDtos = this.getFacade().findByCiudadano(id);
        for (DocumentoDto documentoDto : documentoDtos) {
            documentoDto.setIcono("ui-icon-document");
        }
    }

    public void create() throws ClassNotFoundException {
        Documento doc = Mapper.copyCompleto(documentoASubir, Documento.class, false);
        getFacade().create(doc);
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

    public DocumentoFacadeLocal getEjbDocFacade() {
        return ejbDocFacade;
    }

    public void setEjbDocFacade(DocumentoFacadeLocal ejbDocFacade) {
        this.ejbDocFacade = ejbDocFacade;
    }

    public List<DocumentoDto> getDocumentoDtos() {
        return documentoDtos;
    }

    public void setDocumentoDtos(List<DocumentoDto> documentoDtos) {
        this.documentoDtos = documentoDtos;
    }

}
