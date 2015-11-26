package com.making.cp.dto;

import java.util.List;

/**
 *
 * @author Sergio Forero
 */
class GrupoDto {

    private Integer codigoGrupo;
    private String nombreGrupo;
    private List<GrupoDocumentoDto> grupoDocumentoList;
    private List<GrupoCiudadanoDto> grupoCiudadanoList;
    private PermisoDto codigoPermiso;

    public GrupoDto() {
    }

    /**
     * 
     * @param codigoGrupo
     * @param nombreGrupo
     * @param grupoDocumentoList
     * @param grupoCiudadanoList
     * @param codigoPermiso 
     */
    public GrupoDto(Integer codigoGrupo, String nombreGrupo, List<GrupoDocumentoDto> grupoDocumentoList, List<GrupoCiudadanoDto> grupoCiudadanoList, PermisoDto codigoPermiso) {
        this.codigoGrupo = codigoGrupo;
        this.nombreGrupo = nombreGrupo;
        this.grupoDocumentoList = grupoDocumentoList;
        this.grupoCiudadanoList = grupoCiudadanoList;
        this.codigoPermiso = codigoPermiso;

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

    public List<GrupoDocumentoDto> getGrupoDocumentoList() {
        return grupoDocumentoList;
    }

    public void setGrupoDocumentoList(List<GrupoDocumentoDto> grupoDocumentoList) {
        this.grupoDocumentoList = grupoDocumentoList;
    }

    public List<GrupoCiudadanoDto> getGrupoCiudadanoList() {
        return grupoCiudadanoList;
    }

    public void setGrupoCiudadanoList(List<GrupoCiudadanoDto> grupoCiudadanoList) {
        this.grupoCiudadanoList = grupoCiudadanoList;
    }

    public PermisoDto getCodigoPermiso() {
        return codigoPermiso;
    }

    public void setCodigoPermiso(PermisoDto codigoPermiso) {
        this.codigoPermiso = codigoPermiso;
    }
}
