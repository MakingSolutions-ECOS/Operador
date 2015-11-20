
package com.making.cp.cliente.metadata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.making.cp.cliente.metadata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerMetadataTiposDocumentos_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerMetadataTiposDocumentos");
    private final static QName _ObtenerMetadataTiposDocumentosResponse_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerMetadataTiposDocumentosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.making.cp.cliente.metadata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerMetadataTiposDocumentosResponse }
     * 
     */
    public ObtenerMetadataTiposDocumentosResponse createObtenerMetadataTiposDocumentosResponse() {
        return new ObtenerMetadataTiposDocumentosResponse();
    }

    /**
     * Create an instance of {@link ObtenerMetadataTiposDocumentos }
     * 
     */
    public ObtenerMetadataTiposDocumentos createObtenerMetadataTiposDocumentos() {
        return new ObtenerMetadataTiposDocumentos();
    }

    /**
     * Create an instance of {@link RespuestaMetadata }
     * 
     */
    public RespuestaMetadata createRespuestaMetadata() {
        return new RespuestaMetadata();
    }

    /**
     * Create an instance of {@link RespuestaService }
     * 
     */
    public RespuestaService createRespuestaService() {
        return new RespuestaService();
    }

    /**
     * Create an instance of {@link MetadataTipoDocumentoDto }
     * 
     */
    public MetadataTipoDocumentoDto createMetadataTipoDocumentoDto() {
        return new MetadataTipoDocumentoDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMetadataTiposDocumentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerMetadataTiposDocumentos")
    public JAXBElement<ObtenerMetadataTiposDocumentos> createObtenerMetadataTiposDocumentos(ObtenerMetadataTiposDocumentos value) {
        return new JAXBElement<ObtenerMetadataTiposDocumentos>(_ObtenerMetadataTiposDocumentos_QNAME, ObtenerMetadataTiposDocumentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMetadataTiposDocumentosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerMetadataTiposDocumentosResponse")
    public JAXBElement<ObtenerMetadataTiposDocumentosResponse> createObtenerMetadataTiposDocumentosResponse(ObtenerMetadataTiposDocumentosResponse value) {
        return new JAXBElement<ObtenerMetadataTiposDocumentosResponse>(_ObtenerMetadataTiposDocumentosResponse_QNAME, ObtenerMetadataTiposDocumentosResponse.class, null, value);
    }

}
