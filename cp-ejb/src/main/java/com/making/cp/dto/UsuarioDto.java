/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsuarioDto {

    private Integer codigoUsuario;
    private String claveUsuario;
    private String nombres;
    private String identificacion;
    private RolDto codigoRol;
    private List<LogActividadDto> logActividadList;

    public UsuarioDto() {
    }

    public UsuarioDto(Integer codigoUsuario, String claveUsuario, String nombres, String identificacion, RolDto codigoRol, List<LogActividadDto> logActividadList) {
        this.codigoUsuario = codigoUsuario;
        this.claveUsuario = claveUsuario;
        this.nombres = nombres;
        this.identificacion = identificacion;
        this.codigoRol = codigoRol;
        this.logActividadList = logActividadList;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public RolDto getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(RolDto codigoRol) {
        this.codigoRol = codigoRol;
    }

    public List<LogActividadDto> getLogActividadList() {
        return logActividadList;
    }

    public void setLogActividadList(List<LogActividadDto> logActividadList) {
        this.logActividadList = logActividadList;
    }

}
