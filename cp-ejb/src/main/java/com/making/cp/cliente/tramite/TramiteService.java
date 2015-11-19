
package com.making.cp.cliente.tramite;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TramiteService", targetNamespace = "http://services.ecos.edu.uniandes.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TramiteService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.making.cp.cliente.tramite.RespuestaTramiteDefinicion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTramitesDefinicionPorCategoria", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesDefinicionPorCategoria")
    @ResponseWrapper(localName = "obtenerTramitesDefinicionPorCategoriaResponse", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesDefinicionPorCategoriaResponse")
    @Action(input = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesDefinicionPorCategoriaRequest", output = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesDefinicionPorCategoriaResponse")
    public RespuestaTramiteDefinicion obtenerTramitesDefinicionPorCategoria(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.making.cp.cliente.tramite.RespuestaTramiteDefinicion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTramitesDefinicionPorEntidad", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesDefinicionPorEntidad")
    @ResponseWrapper(localName = "obtenerTramitesDefinicionPorEntidadResponse", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesDefinicionPorEntidadResponse")
    @Action(input = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesDefinicionPorEntidadRequest", output = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesDefinicionPorEntidadResponse")
    public RespuestaTramiteDefinicion obtenerTramitesDefinicionPorEntidad(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns com.making.cp.cliente.tramite.RespuestaTramiteDefinicion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTramitesDefinicion", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesDefinicion")
    @ResponseWrapper(localName = "obtenerTramitesDefinicionResponse", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesDefinicionResponse")
    @Action(input = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesDefinicionRequest", output = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesDefinicionResponse")
    public RespuestaTramiteDefinicion obtenerTramitesDefinicion();

    /**
     * 
     * @param codigoCiudadano
     * @return
     *     returns com.making.cp.cliente.tramite.RespuestaTramite
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTramitesPorCiudadano", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesPorCiudadano")
    @ResponseWrapper(localName = "obtenerTramitesPorCiudadanoResponse", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesPorCiudadanoResponse")
    @Action(input = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesPorCiudadanoRequest", output = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesPorCiudadanoResponse")
    public RespuestaTramite obtenerTramitesPorCiudadano(
        @WebParam(name = "codigoCiudadano", targetNamespace = "")
        Integer codigoCiudadano);

    /**
     * 
     * @param codigoEntidadEmisora
     * @return
     *     returns com.making.cp.cliente.tramite.RespuestaTramite
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTramitePorEntidad", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitePorEntidad")
    @ResponseWrapper(localName = "obtenerTramitePorEntidadResponse", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitePorEntidadResponse")
    @Action(input = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitePorEntidadRequest", output = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitePorEntidadResponse")
    public RespuestaTramite obtenerTramitePorEntidad(
        @WebParam(name = "codigoEntidadEmisora", targetNamespace = "")
        Integer codigoEntidadEmisora);

    /**
     * 
     * @param codigoTramiteEstado
     * @return
     *     returns com.making.cp.cliente.tramite.RespuestaTramite
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTramitesPorEstado", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesPorEstado")
    @ResponseWrapper(localName = "obtenerTramitesPorEstadoResponse", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesPorEstadoResponse")
    @Action(input = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesPorEstadoRequest", output = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesPorEstadoResponse")
    public RespuestaTramite obtenerTramitesPorEstado(
        @WebParam(name = "codigoTramiteEstado", targetNamespace = "")
        Integer codigoTramiteEstado);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.making.cp.cliente.tramite.RespuestaService
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "iniciarTramite", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.IniciarTramite")
    @ResponseWrapper(localName = "iniciarTramiteResponse", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.IniciarTramiteResponse")
    @Action(input = "http://services.ecos.edu.uniandes.co/TramiteService/iniciarTramiteRequest", output = "http://services.ecos.edu.uniandes.co/TramiteService/iniciarTramiteResponse")
    public RespuestaService iniciarTramite(
        @WebParam(name = "arg0", targetNamespace = "")
        SolicitudTramiteDto arg0);

    /**
     * 
     * @return
     *     returns com.making.cp.cliente.tramite.RespuestaTramite
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTramites", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramites")
    @ResponseWrapper(localName = "obtenerTramitesResponse", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.ObtenerTramitesResponse")
    @Action(input = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesRequest", output = "http://services.ecos.edu.uniandes.co/TramiteService/obtenerTramitesResponse")
    public RespuestaTramite obtenerTramites();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.making.cp.cliente.tramite.RespuestaService
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cambiarEstadoTramiteProceso", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.CambiarEstadoTramiteProceso")
    @ResponseWrapper(localName = "cambiarEstadoTramiteProcesoResponse", targetNamespace = "http://services.ecos.edu.uniandes.co/", className = "com.making.cp.cliente.tramite.CambiarEstadoTramiteProcesoResponse")
    @Action(input = "http://services.ecos.edu.uniandes.co/TramiteService/cambiarEstadoTramiteProcesoRequest", output = "http://services.ecos.edu.uniandes.co/TramiteService/cambiarEstadoTramiteProcesoResponse")
    public RespuestaService cambiarEstadoTramiteProceso(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

}
