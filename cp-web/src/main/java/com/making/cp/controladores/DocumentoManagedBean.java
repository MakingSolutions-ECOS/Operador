package com.making.cp.controladores;

import com.making.cp.cliente.metadata.MetaDataService;
import com.making.cp.cliente.metadata.MetaDataService_Service;
import com.making.cp.cliente.metadata.MetadataTipoDocumentoDto;
import com.making.cp.dto.CiudadanoDto;
import com.making.cp.dto.DirectorioDocumentoDto;
import com.making.cp.dto.DocumentoDto;
import com.making.cp.dto.GrupoDocumentoDto;
import com.making.cp.entidad.Documento;
import com.making.cp.negocio.CiudadanoSessionBeanLocal;
import com.making.cp.persistencia.DocumentoFacadeLocal;
import com.making.cp.utilidad.Mapper;
import entidades.util.JsfUtil;
import java.io.File;
import java.io.FileInputStream;
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
import javax.servlet.http.HttpServletResponse;
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
    private List<MetadataTipoDocumentoDto> tipoDocumentoDtos;
    private MetadataTipoDocumentoDto tipoDocumentoDto;

    private MetaDataService_Service service;
    private MetaDataService metaDataService;
    @EJB
    private CiudadanoSessionBeanLocal ciudadanoSessionBeanLocal;

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
            e.printStackTrace();
        }
        tipoDocumentoDto = new MetadataTipoDocumentoDto();
        service = new MetaDataService_Service();
        metaDataService = service.getMetaDataServicePort();
        tipoDocumentoDtos = metaDataService.obtenerMetadataTiposDocumentos().getTiposDocumentoMetaData();
        ciudadanoSessionBeanLocal.setCodigoCiudadano(codCiudadano);
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

    public void eliminarDocumento(DocumentoDto doucmentoDto) throws ClassNotFoundException {
        File archivo = new File(doucmentoDto.getRutaFisicaDirectorio()+doucmentoDto.getNombreDocumento());
        boolean delete = archivo.delete();
        if (delete) {
            getFacade().remove(Mapper.copyCompleto(doucmentoDto, Documento.class, false));
            this.init();
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                        FacesMessage.SEVERITY_INFO, "INFO:", "Se elimino el documento exitosamente."));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                        FacesMessage.SEVERITY_ERROR, "INFO:", "No se pudo eliminar el documento."));
            System.out.println("No se pudo Eliminar el archivo");
        }

    }

    public void descargarDocumento(DocumentoDto doucmentoDto) throws FileNotFoundException {
        File ficheroPDF = new File(doucmentoDto.getRutaFisicaDirectorio()+doucmentoDto.getNombreDocumento());
        FacesContext ctx = FacesContext.getCurrentInstance();
        FileInputStream fis = new FileInputStream(ficheroPDF);
        byte[] bytes = new byte[1000];
        if (!ctx.getResponseComplete()) {
            try {
                String fileName2 = ficheroPDF.getName();
                String contentType = "text/xml";
                HttpServletResponse response = (HttpServletResponse) ctx.getExternalContext().getResponse();
                response.setContentType(contentType);
                response.setHeader("Content-Disposition", "attachment;filename=\"" + fileName2 + "\"");
                OutputStream out = response.getOutputStream();
                int read2 = fis.read(bytes);
                while (read2 >= 0) {
                    if (read2 > 0) {
                        out.write(bytes, 0, read2);
                    }
                    read2 = fis.read(bytes);
                }

                out.flush();
                out.close();
                fis.close();
                ctx.responseComplete();
            } catch (IOException ex) {
                Logger.getLogger(DocumentoManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
            this.documentoASubir.setCodigoTipoMetadataCentralizador(tipoDocumentoDto.getCodigoMetadataTipoDocumento());
            this.documentoASubir.setFechaCreacionDirectorio(new Date());
            this.documentoASubir.setFechaModificacion(new Date());
            this.documentoASubir.setNombreDocumento(event.getFile().getFileName());
            this.documentoASubir.setRutaFisicaDirectorio(rutaServidor);
            this.documentoASubir.setRutaLogicaDocumento(rutaServidor);
            this.documentoASubir.setCodigoGrupoDocumento(new GrupoDocumentoDto(1));
            try {
                this.create();
                this.init();
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                        FacesMessage.SEVERITY_INFO, "INFO:", "Se guardo el documento exitosamente."));
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

    public DocumentoDto getDocumentoASubir() {
        return documentoASubir;
    }

    public void setDocumentoASubir(DocumentoDto documentoASubir) {
        this.documentoASubir = documentoASubir;
    }

    public List<MetadataTipoDocumentoDto> getTipoDocumentoDtos() {
        return tipoDocumentoDtos;
    }

    public void setTipoDocumentoDtos(List<MetadataTipoDocumentoDto> tipoDocumentoDtos) {
        this.tipoDocumentoDtos = tipoDocumentoDtos;
    }

    public MetadataTipoDocumentoDto getTipoDocumentoDto() {
        return tipoDocumentoDto;
    }

    public void setTipoDocumentoDto(MetadataTipoDocumentoDto tipoDocumentoDto) {
        this.tipoDocumentoDto = tipoDocumentoDto;
    }

}
