/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.tramite.TramiteDefinicionDto;
import com.making.cp.dto.CiudadanoDto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Camilo Marroquin
 */
@Local
public interface ITramiteServiceLocal {

    public List<Integer> getDocumentosFaltantes(List<Integer> ids, Integer codigoUsuario, CiudadanoDto ciudadanoDto);

    public List<TramiteDefinicionDto> obtenerTramiteDefinicion() throws Exception;

    public void consultarEstadosTramite(Integer estado);

}
