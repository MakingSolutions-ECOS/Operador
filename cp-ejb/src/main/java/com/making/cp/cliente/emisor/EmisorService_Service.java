
package com.making.cp.cliente.emisor;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "EmisorService", targetNamespace = "http://services.ecos.edu.uniandes.co/", wsdlLocation = "http://macbook-pro-de-camilo.local:8080/projectCentralizador-web/EmisorService?wsdl")
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
            url = new URL("http://macbook-pro-de-camilo.local:8080/projectCentralizador-web/EmisorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMISORSERVICE_WSDL_LOCATION = url;
        EMISORSERVICE_EXCEPTION = e;
    }

    public EmisorService_Service() {
        super(__getWsdlLocation(), EMISORSERVICE_QNAME);
    }

    public EmisorService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
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

    private static URL __getWsdlLocation() {
        if (EMISORSERVICE_EXCEPTION!= null) {
            throw EMISORSERVICE_EXCEPTION;
        }
        return EMISORSERVICE_WSDL_LOCATION;
    }

}