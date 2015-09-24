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
class TipoCiudadanoDto {

    private String nombreTipoCiudadano;
    private Integer codigoTipoCiudadano;
    private List<CiudadanoDto> ciudadanoList;

    public TipoCiudadanoDto() {
    }

    public TipoCiudadanoDto(String nombreTipoCiudadano, Integer codigoTipoCiudadano, List<CiudadanoDto> ciudadanoList) {
        this.nombreTipoCiudadano = nombreTipoCiudadano;
        this.codigoTipoCiudadano = codigoTipoCiudadano;
        this.ciudadanoList = ciudadanoList;
    }

    public String getNombreTipoCiudadano() {
        return nombreTipoCiudadano;
    }

    public void setNombreTipoCiudadano(String nombreTipoCiudadano) {
        this.nombreTipoCiudadano = nombreTipoCiudadano;
    }

    public Integer getCodigoTipoCiudadano() {
        return codigoTipoCiudadano;
    }

    public void setCodigoTipoCiudadano(Integer codigoTipoCiudadano) {
        this.codigoTipoCiudadano = codigoTipoCiudadano;
    }

    public List<CiudadanoDto> getCiudadanoList() {
        return ciudadanoList;
    }

    public void setCiudadanoList(List<CiudadanoDto> ciudadanoList) {
        this.ciudadanoList = ciudadanoList;
    }

}
