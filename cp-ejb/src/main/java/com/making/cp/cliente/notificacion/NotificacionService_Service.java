
package com.making.cp.cliente.notificacion;

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
@WebServiceClient(name = "NotificacionService", targetNamespace = "http://services.ecos.edu.uniandes.co/", wsdlLocation = "http://localhost:8080/projectCentralizador-web/NotificacionService?wsdl")
public class NotificacionService_Service
    extends Service
{

    private final static URL NOTIFICACIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException NOTIFICACIONSERVICE_EXCEPTION;
    private final static QName NOTIFICACIONSERVICE_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "NotificacionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/projectCentralizador-web/NotificacionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NOTIFICACIONSERVICE_WSDL_LOCATION = url;
        NOTIFICACIONSERVICE_EXCEPTION = e;
    }

    public NotificacionService_Service() {
        super(__getWsdlLocation(), NOTIFICACIONSERVICE_QNAME);
    }

    public NotificacionService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NOTIFICACIONSERVICE_QNAME, features);
    }

    public NotificacionService_Service(URL wsdlLocation) {
        super(wsdlLocation, NOTIFICACIONSERVICE_QNAME);
    }

    public NotificacionService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NOTIFICACIONSERVICE_QNAME, features);
    }

    public NotificacionService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NotificacionService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NotificacionService
     */
    @WebEndpoint(name = "NotificacionServicePort")
    public NotificacionService getNotificacionServicePort() {
        return super.getPort(new QName("http://services.ecos.edu.uniandes.co/", "NotificacionServicePort"), NotificacionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NotificacionService
     */
    @WebEndpoint(name = "NotificacionServicePort")
    public NotificacionService getNotificacionServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.ecos.edu.uniandes.co/", "NotificacionServicePort"), NotificacionService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NOTIFICACIONSERVICE_EXCEPTION!= null) {
            throw NOTIFICACIONSERVICE_EXCEPTION;
        }
        return NOTIFICACIONSERVICE_WSDL_LOCATION;
    }

}
