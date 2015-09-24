/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

import java.util.Date;

/**
 *
 * @author Usuario
 */
class LogActividadDto {

    private Integer codigoLogActividad;
    private Date fecha;
    private String descripcionLog;
    private UsuarioDto codigoUsuario;

    public LogActividadDto() {
    }

    public LogActividadDto(Integer codigoLogActividad, Date fecha, String descripcionLog, UsuarioDto codigoUsuario) {
        this.codigoLogActividad = codigoLogActividad;
        this.fecha = fecha;
        this.descripcionLog = descripcionLog;
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getCodigoLogActividad() {
        return codigoLogActividad;
    }

    public void setCodigoLogActividad(Integer codigoLogActividad) {
        this.codigoLogActividad = codigoLogActividad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcionLog() {
        return descripcionLog;
    }

    public void setDescripcionLog(String descripcionLog) {
        this.descripcionLog = descripcionLog;
    }

    public UsuarioDto getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(UsuarioDto codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

}
