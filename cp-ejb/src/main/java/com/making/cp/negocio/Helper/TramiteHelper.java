/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio.Helper;

import com.making.cp.cliente.tramite.RespuestaService;
import com.making.cp.cliente.tramite.RespuestaTramite;
import com.making.cp.cliente.tramite.RespuestaTramiteDefinicion;
import com.making.cp.cliente.tramite.SolicitudTramiteDto;
import com.making.cp.cliente.tramite.TramiteDefinicionDto;
import com.making.cp.cliente.tramite.TramiteDto;
import com.making.cp.cliente.tramite.TramiteService;
import com.making.cp.cliente.tramite.TramiteService_Service;
import java.util.List;

/**
 *
 * @author Sergio Forero
 */
public class TramiteHelper {

    /**
     * Obtiene la descripción de trámites actuales disponibles por entidad
     *
     * @author Your Name
     */
    public List<TramiteDefinicionDto> obtenerTramitesDefinicion() throws Exception {
        RespuestaTramiteDefinicion respuestaTramiteDefinicion = null;

        try {
            TramiteService_Service service = new TramiteService_Service();

            TramiteService port = service.getTramiteServicePort();

            respuestaTramiteDefinicion = port.obtenerTramitesDefinicion();
        } catch (Exception e) {
            throw e;
        }
        return respuestaTramiteDefinicion.getTramiteDefinicionDtos();
    }

    /**
     * Obtiene los trámites por estado. Este método es llamado luego de la
     * ejecución de la tarea programada encargada de verificar qué tramites
     * cuentan con el estado FINALIZADO.
     *
     *
     * @param estado
     * @return
     * @throws Exception
     */

    public List<TramiteDto> obtenerTramitesEstado(Integer estado) throws Exception {
        RespuestaTramite respuestaTramite = null;

        try {
            TramiteService_Service service = new TramiteService_Service();

            TramiteService port = service.getTramiteServicePort();

            respuestaTramite = port.obtenerTramitesPorEstado(estado);
        } catch (Exception e) {
            throw e;
        }
        return respuestaTramite.getTramiteDtos();
    }
         /**
      * Invoca servicio que modifica el estado de un trámite determinado
      * @param idTramite
      * @param idEntidadEmisora
      * @param idEstado
      * @return
      * @throws Exception 
      */

    public RespuestaService cambiarEstadoTramiteProceso(Integer idTramite, Integer idEntidadEmisora, Integer idEstado) throws Exception {
        RespuestaService respuestaTramite = null;

        try {
            TramiteService_Service service = new TramiteService_Service();

            TramiteService port = service.getTramiteServicePort();

            respuestaTramite = port.cambiarEstadoTramiteProceso(idTramite, idEntidadEmisora, idEstado);
        } catch (Exception e) {
            throw e;
        }
        return respuestaTramite;
    }
    
    /**
      * Invoca servicio que da inicio a un trámite en la plataforma centralizadora
      * @param solicitudTramiteDto
      * @return
      * @throws Exception 
      */
     
       public RespuestaService iniciarTramite(SolicitudTramiteDto solicitudTramiteDto)throws Exception{
         RespuestaService respuestaTramite = null;

        try {
            TramiteService_Service service = new TramiteService_Service();

            TramiteService port = service.getTramiteServicePort();

            respuestaTramite= port.iniciarTramite(solicitudTramiteDto);
        } catch (Exception e) {           
            throw e;
        }
        return respuestaTramite;
    }
       
       /**
     * Invoca servicio que da retorna desde plataforma centralizadora los tramites por ciudadano
     * @param codigoCiudadano
     * @return
     * @throws Exception
     */
    public RespuestaService obtenerTramites(Integer codigoCiudadano)throws Exception{
         RespuestaService respuestaTramite = null;

        try {
            TramiteService_Service service = new TramiteService_Service();

            TramiteService port = service.getTramiteServicePort();

            respuestaTramite= port.obtenerTramitesPorCiudadano(codigoCiudadano);
        } catch (Exception e) {           
            throw e;
        }
        return respuestaTramite;
    }


}
