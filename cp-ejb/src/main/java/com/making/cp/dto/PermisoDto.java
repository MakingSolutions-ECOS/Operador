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
class PermisoDto {

    private Integer codigoPermiso;
    private Integer codigoGrupoUsuario;
    private String nombrePermiso;
    private List<GrupoCiudadanoDto> grupoCiudadanoList;

    public PermisoDto() {
    }

    public PermisoDto(Integer codigoPermiso, Integer codigoGrupoUsuario, String nombrePermiso, List<GrupoCiudadanoDto> grupoCiudadanoList) {
        this.codigoPermiso = codigoPermiso;
        this.codigoGrupoUsuario = codigoGrupoUsuario;
        this.nombrePermiso = nombrePermiso;
        this.grupoCiudadanoList = grupoCiudadanoList;
    }

    public Integer getCodigoPermiso() {
        return codigoPermiso;
    }

    public void setCodigoPermiso(Integer codigoPermiso) {
        this.codigoPermiso = codigoPermiso;
    }

    public Integer getCodigoGrupoUsuario() {
        return codigoGrupoUsuario;
    }

    public void setCodigoGrupoUsuario(Integer codigoGrupoUsuario) {
        this.codigoGrupoUsuario = codigoGrupoUsuario;
    }

    public String getNombrePermiso() {
        return nombrePermiso;
    }

    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }

    public List<GrupoCiudadanoDto> getGrupoCiudadanoList() {
        return grupoCiudadanoList;
    }

    public void setGrupoCiudadanoList(List<GrupoCiudadanoDto> grupoCiudadanoList) {
        this.grupoCiudadanoList = grupoCiudadanoList;
    }

}
