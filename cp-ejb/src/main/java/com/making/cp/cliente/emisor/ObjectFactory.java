
package com.making.cp.cliente.emisor;

import com.making.cp.cliente.emisor.EmisorDto;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.making.cp.cliente package. 
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

    private final static QName _ObtenerEmisores_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerEmisores");
    private final static QName _ObtenerEmisoresResponse_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerEmisoresResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.making.cp.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerEmisoresResponse }
     * 
     */
    public ObtenerEmisoresResponse createObtenerEmisoresResponse() {
        return new ObtenerEmisoresResponse();
    }

    /**
     * Create an instance of {@link ObtenerEmisores }
     * 
     */
    public ObtenerEmisores createObtenerEmisores() {
        return new ObtenerEmisores();
    }

    /**
     * Create an instance of {@link RespuestaService }
     * 
     */
    public RespuestaService createRespuestaService() {
        return new RespuestaService();
    }

    /**
     * Create an instance of {@link EmisorDto }
     * 
     */
    public EmisorDto createEmisorDto() {
        return new EmisorDto();
    }

    /**
     * Create an instance of {@link RespuestaEmisor }
     * 
     */
    public RespuestaEmisor createRespuestaEmisor() {
        return new RespuestaEmisor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEmisores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerEmisores")
    public JAXBElement<ObtenerEmisores> createObtenerEmisores(ObtenerEmisores value) {
        return new JAXBElement<ObtenerEmisores>(_ObtenerEmisores_QNAME, ObtenerEmisores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEmisoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerEmisoresResponse")
    public JAXBElement<ObtenerEmisoresResponse> createObtenerEmisoresResponse(ObtenerEmisoresResponse value) {
        return new JAXBElement<ObtenerEmisoresResponse>(_ObtenerEmisoresResponse_QNAME, ObtenerEmisoresResponse.class, null, value);
    }

}
