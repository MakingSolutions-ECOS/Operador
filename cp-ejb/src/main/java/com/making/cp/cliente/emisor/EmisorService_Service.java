
package com.making.cp.cliente.emisor;

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
@WebServiceClient(name = "EmisorService", targetNamespace = "http://services.ecos.edu.uniandes.co/", wsdlLocation = "http://localhost:8080/projectCentralizador-web/EmisorService?wsdl")
public class EmisorService_Service
    extends Service
{

    private final static URL EMISORSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMISORSERVICE_EXCEPTION;
    private final static QName EMISORSERVICE_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "EmisorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/projectCentralizador-web/EmisorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMISORSERVICE_WSDL_LOCATION = url;
        EMISORSERVICE_EXCEPTION = e;
    }

    public EmisorService_Service() {
        super(__getWsdlLocation(), EMISORSERVICE_QNAME);
    }

    public EmisorService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMISORSERVICE_QNAME, features);
    }

    public EmisorService_Service(URL wsdlLocation) {
        super(wsdlLocation, EMISORSERVICE_QNAME);
    }

    public EmisorService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMISORSERVICE_QNAME, features);
    }

    public EmisorService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmisorService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmisorService
     */
    @WebEndpoint(name = "EmisorServicePort")
    public EmisorService getEmisorServicePort() {
        return super.getPort(new QName("http://services.ecos.edu.uniandes.co/", "EmisorServicePort"), EmisorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmisorService
     */
    @WebEndpoint(name = "EmisorServicePort")
    public EmisorService getEmisorServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.ecos.edu.uniandes.co/", "EmisorServicePort"), EmisorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMISORSERVICE_EXCEPTION!= null) {
            throw EMISORSERVICE_EXCEPTION;
        }
        return EMISORSERVICE_WSDL_LOCATION;
    }

}
