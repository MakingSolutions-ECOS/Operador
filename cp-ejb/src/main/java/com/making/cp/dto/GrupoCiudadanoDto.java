/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

/**
 *
 * @author Usuario
 */
class GrupoCiudadanoDto {

    private Integer codigoGrupoCiudadano;
    private Integer codigoPermiso;
    private PermisoDto codigoGrupo;
    private GrupoDto codigoGrupo1;

    public GrupoCiudadanoDto() {
    }

    public GrupoCiudadanoDto(Integer codigoGrupoCiudadano, Integer codigoPermiso, PermisoDto codigoGrupo, GrupoDto codigoGrupo1) {
        this.codigoGrupoCiudadano = codigoGrupoCiudadano;
        this.codigoPermiso = codigoPermiso;
        this.codigoGrupo = codigoGrupo;
        this.codigoGrupo1 = codigoGrupo1;
    }

    public Integer getCodigoGrupoCiudadano() {
        return codigoGrupoCiudadano;
    }

    public void setCodigoGrupoCiudadano(Integer codigoGrupoCiudadano) {
        this.codigoGrupoCiudadano = codigoGrupoCiudadano;
    }

    public Integer getCodigoPermiso() {
        return codigoPermiso;
    }

    public void setCodigoPermiso(Integer codigoPermiso) {
        this.codigoPermiso = codigoPermiso;
    }

    public PermisoDto getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(PermisoDto codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public GrupoDto getCodigoGrupo1() {
        return codigoGrupo1;
    }

    public void setCodigoGrupo1(GrupoDto codigoGrupo1) {
        this.codigoGrupo1 = codigoGrupo1;
    }

}
