/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

import java.util.Date;

/**
 *
 * @author Camilo Marroquin
 */
public class DocumentoRequeridoDto extends DocumentoDto{

    public DocumentoRequeridoDto(boolean Cargado) {
        this.Cargado = Cargado;
    }

    public DocumentoRequeridoDto(boolean Cargado, int codigoTipoMetadataCentralizador, Date fechaModificacion, String nombreDocumento, String rutaLogicaDocumento, Date fechaCreacionDirectorio, String rutaFisicaDirectorio, GrupoDocumentoDto codigoGrupoDocumento, DirectorioDocumentoDto codigoDirectorioDocuento, CiudadanoDto codigoCiudadano) {
        super(codigoTipoMetadataCentralizador, fechaModificacion, nombreDocumento, rutaLogicaDocumento, fechaCreacionDirectorio, rutaFisicaDirectorio, codigoGrupoDocumento, codigoDirectorioDocuento, codigoCiudadano);
        this.Cargado = Cargado;
    }

    public DocumentoRequeridoDto(boolean Cargado, Integer codigoDocumento, String nombreDocumento, Date fechaModificacion) {
        super(codigoDocumento, nombreDocumento, fechaModificacion);
        this.Cargado = Cargado;
    }
    
    /**
     * Si el documento esta cargado en el sistema
     */
    private boolean Cargado;

    /**
     * Retorna el valor de la variable Cargado
     * @return 
     */
    public boolean isCargado() {
        return Cargado;
    }

    /**
     * Setea el valor de la variable Cargado
     * @param Cargado 
     */
    public void setCargado(boolean Cargado) {
        this.Cargado = Cargado;
    }
    
    
}
