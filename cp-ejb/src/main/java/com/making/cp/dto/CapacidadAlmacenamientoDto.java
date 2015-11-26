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
public class CapacidadAlmacenamientoDto {

    private Integer codigoCapacidadAlmacenamiento;
    private Integer codigoCiudadano;
    private int capacidadGibabytes;
    private List<CiudadanoDto> ciudadanoList;

    public CapacidadAlmacenamientoDto() {
    }

    public CapacidadAlmacenamientoDto(Integer codigoCapacidadAlmacenamiento, Integer codigoCiudadano, int capacidadGibabytes, List<CiudadanoDto> ciudadanoList) {
        this.codigoCapacidadAlmacenamiento = codigoCapacidadAlmacenamiento;
        this.codigoCiudadano = codigoCiudadano;
        this.capacidadGibabytes = capacidadGibabytes;
        this.ciudadanoList = ciudadanoList;
    }

    public Integer getCodigoCapacidadAlmacenamiento() {
        return codigoCapacidadAlmacenamiento;
    }

    public void setCodigoCapacidadAlmacenamiento(Integer codigoCapacidadAlmacenamiento) {
        this.codigoCapacidadAlmacenamiento = codigoCapacidadAlmacenamiento;
    }

    public Integer getCodigoCiudadano() {
        return codigoCiudadano;
    }

    public void setCodigoCiudadano(Integer codigoCiudadano) {
        this.codigoCiudadano = codigoCiudadano;
    }

    public int getCapacidadGibabytes() {
        return capacidadGibabytes;
    }

    public void setCapacidadGibabytes(int capacidadGibabytes) {
        this.capacidadGibabytes = capacidadGibabytes;
    }

    public List<CiudadanoDto> getCiudadanoList() {
        return ciudadanoList;
    }

    public void setCiudadanoList(List<CiudadanoDto> ciudadanoList) {
        this.ciudadanoList = ciudadanoList;
    }

}
