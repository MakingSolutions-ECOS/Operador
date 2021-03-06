
package com.making.cp.cliente.tramite;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TramiteService", targetNamespace = "http://services.ecos.edu.uniandes.co/", wsdlLocation = "http://localhost:8080/projectCentralizador-web/TramiteService?wsdl")
public class TramiteService_Service
    extends Service
{

    private final static URL TRAMITESERVICE_WSDL_LOCATION;
    private final static WebServiceException TRAMITESERVICE_EXCEPTION;
    private final static QName TRAMITESERVICE_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "TramiteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/projectCentralizador-web/TramiteService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRAMITESERVICE_WSDL_LOCATION = url;
        TRAMITESERVICE_EXCEPTION = e;
    }

    public TramiteService_Service() {
        super(__getWsdlLocation(), TRAMITESERVICE_QNAME);
    }

    public TramiteService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRAMITESERVICE_QNAME, features);
    }

    public TramiteService_Service(URL wsdlLocation) {
        super(wsdlLocation, TRAMITESERVICE_QNAME);
    }

    public TramiteService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRAMITESERVICE_QNAME, features);
    }

    public TramiteService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TramiteService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TramiteService
     */
    @WebEndpoint(name = "TramiteServicePort")
    public TramiteService getTramiteServicePort() {
        return super.getPort(new QName("http://services.ecos.edu.uniandes.co/", "TramiteServicePort"), TramiteService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TramiteService
     */
    @WebEndpoint(name = "TramiteServicePort")
    public TramiteService getTramiteServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.ecos.edu.uniandes.co/", "TramiteServicePort"), TramiteService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRAMITESERVICE_EXCEPTION!= null) {
            throw TRAMITESERVICE_EXCEPTION;
        }
        return TRAMITESERVICE_WSDL_LOCATION;
    }

}
