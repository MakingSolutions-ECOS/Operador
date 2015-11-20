package com.making.cp.controladores;

import com.making.cp.cliente.metadata.MetadataTipoDocumentoDto;
import com.making.cp.negocio.IMetadataServiceLocal;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author John Dany
 */
@Named(value = "metadataManagedBean")
@Dependent
public class MetadataManagedBean implements Serializable {

    @EJB(beanName = "MetadataServiceBean")
    private IMetadataServiceLocal metadataServiceLocal;

    private List<MetadataTipoDocumentoDto> metadataTipoDocumentoDtos;

    /**
     * Creates a new instance of MetadataManagedBean
     */
    public MetadataManagedBean() {
    }

    @PostConstruct
    public void init() {
        this.getMetadataTipoDocumentoDtos();
    }

    /**
     * Método obtiene todos los metadata tipo de docuementos del servicio web de
     * centralizador y se establece en una variable privada.
     */
    public void getMetadataTipoDocumentoDtos() {
        try {
            this.metadataTipoDocumentoDtos = metadataServiceLocal.obtenerMetadataTipoDocuementos();
        } catch (Exception ex) {
            Logger.getLogger(MetadataManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Establece una colección de MetadataTipoDocumentoDto.
     *
     * @param metadataTipoDocumentoDtos
     */
    public void setMetadataTipoDocumentoDtos(List<MetadataTipoDocumentoDto> metadataTipoDocumentoDtos) {
        this.metadataTipoDocumentoDtos = metadataTipoDocumentoDtos;
    }
}
