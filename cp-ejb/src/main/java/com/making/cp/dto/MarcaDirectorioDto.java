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
class MarcaDirectorioDto {

    private Integer codigoMarcaDirectorio;
    private List<MarcaDto> marcaList;
    private List<DirectorioDto> directorioList;

    public MarcaDirectorioDto() {
    }

    public MarcaDirectorioDto(Integer codigoMarcaDirectorio, List<MarcaDto> marcaList, List<DirectorioDto> directorioList) {
        this.codigoMarcaDirectorio = codigoMarcaDirectorio;
        this.marcaList = marcaList;
        this.directorioList = directorioList;
    }

    public Integer getCodigoMarcaDirectorio() {
        return codigoMarcaDirectorio;
    }

    public void setCodigoMarcaDirectorio(Integer codigoMarcaDirectorio) {
        this.codigoMarcaDirectorio = codigoMarcaDirectorio;
    }

    public List<MarcaDto> getMarcaList() {
        return marcaList;
    }

    public void setMarcaList(List<MarcaDto> marcaList) {
        this.marcaList = marcaList;
    }

    public List<DirectorioDto> getDirectorioList() {
        return directorioList;
    }

    public void setDirectorioList(List<DirectorioDto> directorioList) {
        this.directorioList = directorioList;
    }

}
