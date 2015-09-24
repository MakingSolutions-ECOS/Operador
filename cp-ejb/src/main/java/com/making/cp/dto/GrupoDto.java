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
class GrupoDto {

    private Integer codigoGrupo;
    private String nombreGrupo;
    private List<GrupoDirectorioDto> grupoDirectorioList;
    private List<GrupoCiudadanoDto> grupoCiudadanoList;

    public GrupoDto() {
    }

    public GrupoDto(Integer codigoGrupo, String nombreGrupo, List<GrupoDirectorioDto> grupoDirectorioList, List<GrupoCiudadanoDto> grupoCiudadanoList) {
        this.codigoGrupo = codigoGrupo;
        this.nombreGrupo = nombreGrupo;
        this.grupoDirectorioList = grupoDirectorioList;
        this.grupoCiudadanoList = grupoCiudadanoList;
    }

    public Integer getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(Integer codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public List<GrupoDirectorioDto> getGrupoDirectorioList() {
        return grupoDirectorioList;
    }

    public void setGrupoDirectorioList(List<GrupoDirectorioDto> grupoDirectorioList) {
        this.grupoDirectorioList = grupoDirectorioList;
    }

    public List<GrupoCiudadanoDto> getGrupoCiudadanoList() {
        return grupoCiudadanoList;
    }

    public void setGrupoCiudadanoList(List<GrupoCiudadanoDto> grupoCiudadanoList) {
        this.grupoCiudadanoList = grupoCiudadanoList;
    }

}
