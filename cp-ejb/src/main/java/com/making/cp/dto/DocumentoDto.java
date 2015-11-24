package com.making.cp.dto;

import java.util.Date;

/**
 * Clase que representa un el dto del entity Documento.
 *
 * @author John Dany
 */
public class DocumentoDto {

    private Integer codigoDocumento;
    private int codigoTipoMetadataCentralizador;
    private Date fechaModificacion;
    private String nombreDocumento;
    private String rutaLogicaDocumento;
    private Date fechaCreacionDirectorio;
    private String rutaFisicaDirectorio;
    private GrupoDocumentoDto codigoGrupoDocumento;
    private DirectorioDocumentoDto codigoDirectorioDocuento;
    private CiudadanoDto codigoCiudadano;
    private String tipoArchivo;
    private String icono;

    /**
     * Inicializa una nueva instancia de DocumentoDto.
     */
    public DocumentoDto() {
    }

    /**
     * Inicializa una nueva instancia de DocumentoDto.
     *
     * @param codigoTipoMetadataCentralizador
     * @param fechaModificacion
     * @param nombreDocumento
     * @param rutaLogicaDocumento
     * @param fechaCreacionDirectorio
     * @param rutaFisicaDirectorio
     * @param codigoGrupoDocumento
     * @param codigoDirectorioDocuento
     * @param codigoCiudadano
     */
    public DocumentoDto(int codigoTipoMetadataCentralizador, Date fechaModificacion, String nombreDocumento, String rutaLogicaDocumento, Date fechaCreacionDirectorio, String rutaFisicaDirectorio, GrupoDocumentoDto codigoGrupoDocumento, DirectorioDocumentoDto codigoDirectorioDocuento, CiudadanoDto codigoCiudadano) {
        this.codigoTipoMetadataCentralizador = codigoTipoMetadataCentralizador;
        this.fechaModificacion = fechaModificacion;
        this.nombreDocumento = nombreDocumento;
        this.rutaLogicaDocumento = rutaLogicaDocumento;
        this.fechaCreacionDirectorio = fechaCreacionDirectorio;
        this.rutaFisicaDirectorio = rutaFisicaDirectorio;
        this.codigoGrupoDocumento = codigoGrupoDocumento;
        this.codigoDirectorioDocuento = codigoDirectorioDocuento;
        this.codigoCiudadano = codigoCiudadano;
    }

    public DocumentoDto(Integer codigoDocumento, String nombreDocumento, Date fechaModificacion) {
        this.codigoDocumento = codigoDocumento;
        this.nombreDocumento = nombreDocumento;
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(Integer codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
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

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getRutaLogicaDocumento() {
        return rutaLogicaDocumento;
    }

    public void setRutaLogicaDocumento(String rutaLogicaDocumento) {
        this.rutaLogicaDocumento = rutaLogicaDocumento;
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

    public GrupoDocumentoDto getCodigoGrupoDocumento() {
        return codigoGrupoDocumento;
    }

    public void setCodigoGrupoDocumento(GrupoDocumentoDto codigoGrupoDocumento) {
        this.codigoGrupoDocumento = codigoGrupoDocumento;
    }

    public DirectorioDocumentoDto getCodigoDirectorioDocuento() {
        return codigoDirectorioDocuento;
    }

    public void setCodigoDirectorioDocuento(DirectorioDocumentoDto codigoDirectorioDocuento) {
        this.codigoDirectorioDocuento = codigoDirectorioDocuento;
    }

    public CiudadanoDto getCodigoCiudadano() {
        return codigoCiudadano;
    }

    public void setCodigoCiudadano(CiudadanoDto codigoCiudadano) {
        this.codigoCiudadano = codigoCiudadano;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

}
