/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

import java.util.Date;

/**
 *
 * @author Usuario
 */
class DirectorioDto {

    private Integer codigoMetadata;
    private int codigoTipoMetadataCentralizador;
    private Date fechaModificacion;
    private String nombreDirectorio;
    private String rutaLogicaDirectorio;
    private Date fechaCreacionDirectorio;
    private String rutaFisicaDirectorio;
    private MarcaDirectorioDto codigoMarcaDirectorio;
    private GrupoDirectorioDto codigoGrupoDirectorio;
    private CiudadanoDto codigoCiudadano;

    public DirectorioDto() {
    }

    public DirectorioDto(Integer codigoMetadata, int codigoTipoMetadataCentralizador, Date fechaModificacion, String nombreDirectorio, String rutaLogicaDirectorio, Date fechaCreacionDirectorio, String rutaFisicaDirectorio, MarcaDirectorioDto codigoMarcaDirectorio, GrupoDirectorioDto codigoGrupoDirectorio, CiudadanoDto codigoCiudadano) {
        this.codigoMetadata = codigoMetadata;
        this.codigoTipoMetadataCentralizador = codigoTipoMetadataCentralizador;
        this.fechaModificacion = fechaModificacion;
        this.nombreDirectorio = nombreDirectorio;
        this.rutaLogicaDirectorio = rutaLogicaDirectorio;
        this.fechaCreacionDirectorio = fechaCreacionDirectorio;
        this.rutaFisicaDirectorio = rutaFisicaDirectorio;
        this.codigoMarcaDirectorio = codigoMarcaDirectorio;
        this.codigoGrupoDirectorio = codigoGrupoDirectorio;
        this.codigoCiudadano = codigoCiudadano;
    }

    public Integer getCodigoMetadata() {
        return codigoMetadata;
    }

    public void setCodigoMetadata(Integer codigoMetadata) {
        this.codigoMetadata = codigoMetadata;
    }

    public int getCodigoTipoMetadataCentralizador() {
        return codigoTipoMetadataCentralizador;
    }

    public void setCodigoTipoMetadataCentralizador(int codigoTipoMetadataCentralizador) {
        this.codigoTipoMetadataCentralizador = codigoTipoMetadataCentralizador;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getNombreDirectorio() {
        return nombreDirectorio;
    }

    public void setNombreDirectorio(String nombreDirectorio) {
        this.nombreDirectorio = nombreDirectorio;
    }

    public String getRutaLogicaDirectorio() {
        return rutaLogicaDirectorio;
    }

    public void setRutaLogicaDirectorio(String rutaLogicaDirectorio) {
        this.rutaLogicaDirectorio = rutaLogicaDirectorio;
    }

    public Date getFechaCreacionDirectorio() {
        return fechaCreacionDirectorio;
    }

    public void setFechaCreacionDirectorio(Date fechaCreacionDirectorio) {
        this.fechaCreacionDirectorio = fechaCreacionDirectorio;
    }

    public String getRutaFisicaDirectorio() {
        return rutaFisicaDirectorio;
    }

    public void setRutaFisicaDirectorio(String rutaFisicaDirectorio) {
        this.rutaFisicaDirectorio = rutaFisicaDirectorio;
    }

    public MarcaDirectorioDto getCodigoMarcaDirectorio() {
        return codigoMarcaDirectorio;
    }

    public void setCodigoMarcaDirectorio(MarcaDirectorioDto codigoMarcaDirectorio) {
        this.codigoMarcaDirectorio = codigoMarcaDirectorio;
    }

    public GrupoDirectorioDto getCodigoGrupoDirectorio() {
        return codigoGrupoDirectorio;
    }

    public void setCodigoGrupoDirectorio(GrupoDirectorioDto codigoGrupoDirectorio) {
        this.codigoGrupoDirectorio = codigoGrupoDirectorio;
    }

    public CiudadanoDto getCodigoCiudadano() {
        return codigoCiudadano;
    }

    public void setCodigoCiudadano(CiudadanoDto codigoCiudadano) {
        this.codigoCiudadano = codigoCiudadano;
    }

}
