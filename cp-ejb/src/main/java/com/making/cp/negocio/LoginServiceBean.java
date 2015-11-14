/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;


import com.making.cp.dto.CiudadanoDto;
import com.making.cp.dto.UsuarioDto;

import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author Your Name
 */
@Stateless
public class LoginServiceBean implements LoginServiceBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public UsuarioDto getUsuarioSesion() {
        CiudadanoDto ciudadanoDto = new CiudadanoDto(1, new Date(), "edmundo@gmail.com", "edmu");
        UsuarioDto usuarioDto = new UsuarioDto(Integer.MIN_VALUE, null, null, null,  ciudadanoDto);
        usuarioDto.setCiudadanoDto(ciudadanoDto);
        return usuarioDto;
    }
}
