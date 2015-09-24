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
 * @author Usuario
 */
public class CiudadanoDto {

    private Integer codigoCiudadano;
    private Date fechaAfiliacion;
    private String email;
    private String aliasCiudadano;
    private TipoCiudadanoDto codigoTipoCiudadano;
    private CapacidadAlmacenamientoDto codigoCapacidadAlmacenamiento;
    private List<DirectorioDto> directorioList;
    private List<PublicidadDto> publicidadList;

    public CiudadanoDto() {
    }

    public CiudadanoDto(Integer codigoCiudadano, Date fechaAfiliacion, String email, String aliasCiudadano, TipoCiudadanoDto codigoTipoCiudadano, CapacidadAlmacenamientoDto codigoCapacidadAlmacenamiento, List<DirectorioDto> directorioList, List<PublicidadDto> publicidadList) {
        this.codigoCiudadano = codigoCiudadano;
        this.fechaAfiliacion = fechaAfiliacion;
        this.email = email;
        this.aliasCiudadano = aliasCiudadano;
        this.codigoTipoCiudadano = codigoTipoCiudadano;
        this.codigoCapacidadAlmacenamiento = codigoCapacidadAlmacenamiento;
        this.directorioList = directorioList;
        this.publicidadList = publicidadList;
    }

    public Integer getCodigoCiudadano() {
        return codigoCiudadano;
    }

    public void setCodigoCiudadano(Integer codigoCiudadano) {
        this.codigoCiudadano = codigoCiudadano;
    }

    public Date getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAliasCiudadano() {
        return aliasCiudadano;
    }

    public void setAliasCiudadano(String aliasCiudadano) {
        this.aliasCiudadano = aliasCiudadano;
    }

    public TipoCiudadanoDto getCodigoTipoCiudadano() {
        return codigoTipoCiudadano;
    }

    public void setCodigoTipoCiudadano(TipoCiudadanoDto codigoTipoCiudadano) {
        this.codigoTipoCiudadano = codigoTipoCiudadano;
    }

    public CapacidadAlmacenamientoDto getCodigoCapacidadAlmacenamiento() {
        return codigoCapacidadAlmacenamiento;
    }

    public void setCodigoCapacidadAlmacenamiento(CapacidadAlmacenamientoDto codigoCapacidadAlmacenamiento) {
        this.codigoCapacidadAlmacenamiento = codigoCapacidadAlmacenamiento;
    }

    public List<DirectorioDto> getDirectorioList() {
        return directorioList;
    }

    public void setDirectorioList(List<DirectorioDto> directorioList) {
        this.directorioList = directorioList;
    }

    public List<PublicidadDto> getPublicidadList() {
        return publicidadList;
    }

    public void setPublicidadList(List<PublicidadDto> publicidadList) {
        this.publicidadList = publicidadList;
    }

}
