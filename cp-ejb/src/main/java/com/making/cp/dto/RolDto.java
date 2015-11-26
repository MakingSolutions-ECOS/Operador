/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

import java.util.List;

/**
 *
 * @author Sergio Forero
 */
class RolDto {

    private Integer codigoRol;
    private String nombreRol;
    private List<UsuarioDto> usuarioList;
    private List<RolRecursoPermitidoDto> rolRecursoPermitidoList;

    public RolDto() {
    }

    public RolDto(Integer codigoRol, String nombreRol, List<UsuarioDto> usuarioList, List<RolRecursoPermitidoDto> rolRecursoPermitidoList) {
        this.codigoRol = codigoRol;
        this.nombreRol = nombreRol;
        this.usuarioList = usuarioList;
        this.rolRecursoPermitidoList = rolRecursoPermitidoList;
    }

    public Integer getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(Integer codigoRol) {
        this.codigoRol = codigoRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public List<UsuarioDto> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<UsuarioDto> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public List<RolRecursoPermitidoDto> getRolRecursoPermitidoList() {
        return rolRecursoPermitidoList;
    }

    public void setRolRecursoPermitidoList(List<RolRecursoPermitidoDto> rolRecursoPermitidoList) {
        this.rolRecursoPermitidoList = rolRecursoPermitidoList;
    }

}
