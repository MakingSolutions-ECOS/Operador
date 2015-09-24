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
class GrupoDirectorioDto {

    private Integer codigoGrupoDirectorio;
    private List<DirectorioDto> directorioList;
    private GrupoDto codigoGrupo;

    public GrupoDirectorioDto() {
    }

    public GrupoDirectorioDto(Integer codigoGrupoDirectorio, List<DirectorioDto> directorioList, GrupoDto codigoGrupo) {
        this.codigoGrupoDirectorio = codigoGrupoDirectorio;
        this.directorioList = directorioList;
        this.codigoGrupo = codigoGrupo;
    }

    public Integer getCodigoGrupoDirectorio() {
        return codigoGrupoDirectorio;
    }

    public void setCodigoGrupoDirectorio(Integer codigoGrupoDirectorio) {
        this.codigoGrupoDirectorio = codigoGrupoDirectorio;
    }

    public List<DirectorioDto> getDirectorioList() {
        return directorioList;
    }

    public void setDirectorioList(List<DirectorioDto> directorioList) {
        this.directorioList = directorioList;
    }

    public GrupoDto getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(GrupoDto codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

}
