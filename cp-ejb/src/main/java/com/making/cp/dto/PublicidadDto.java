/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Sergio Forero
 */
class PublicidadDto {

    private Integer codigoPublicidad;
    private Date fechaCreacionPublicidad;
    private Date fechaInicioPublicacion;
    private int duracionPublicacionMinutos;
    private short habilitada;
    private List<PublicidadImagenDto> publicidadImagenList;
    private CiudadanoDto codigoCiudadano;

    public PublicidadDto() {
    }

    public PublicidadDto(Integer codigoPublicidad, Date fechaCreacionPublicidad, Date fechaInicioPublicacion, int duracionPublicacionMinutos, short habilitada, List<PublicidadImagenDto> publicidadImagenList, CiudadanoDto codigoCiudadano) {
        this.codigoPublicidad = codigoPublicidad;
        this.fechaCreacionPublicidad = fechaCreacionPublicidad;
        this.fechaInicioPublicacion = fechaInicioPublicacion;
        this.duracionPublicacionMinutos = duracionPublicacionMinutos;
        this.habilitada = habilitada;
        this.publicidadImagenList = publicidadImagenList;
        this.codigoCiudadano = codigoCiudadano;
    }

    public Integer getCodigoPublicidad() {
        return codigoPublicidad;
    }

    public void setCodigoPublicidad(Integer codigoPublicidad) {
        this.codigoPublicidad = codigoPublicidad;
    }

    public Date getFechaCreacionPublicidad() {
        return fechaCreacionPublicidad;
    }

    public void setFechaCreacionPublicidad(Date fechaCreacionPublicidad) {
        this.fechaCreacionPublicidad = fechaCreacionPublicidad;
    }

    public Date getFechaInicioPublicacion() {
        return fechaInicioPublicacion;
    }

    public void setFechaInicioPublicacion(Date fechaInicioPublicacion) {
        this.fechaInicioPublicacion = fechaInicioPublicacion;
    }

    public int getDuracionPublicacionMinutos() {
        return duracionPublicacionMinutos;
    }

    public void setDuracionPublicacionMinutos(int duracionPublicacionMinutos) {
        this.duracionPublicacionMinutos = duracionPublicacionMinutos;
    }

    public short getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(short habilitada) {
        this.habilitada = habilitada;
    }

    public List<PublicidadImagenDto> getPublicidadImagenList() {
        return publicidadImagenList;
    }

    public void setPublicidadImagenList(List<PublicidadImagenDto> publicidadImagenList) {
        this.publicidadImagenList = publicidadImagenList;
    }

    public CiudadanoDto getCodigoCiudadano() {
        return codigoCiudadano;
    }

    public void setCodigoCiudadano(CiudadanoDto codigoCiudadano) {
        this.codigoCiudadano = codigoCiudadano;
    }

}
