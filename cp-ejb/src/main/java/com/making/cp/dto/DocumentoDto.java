/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

import java.util.Date;

/**
 *
 * @author Your Name
 */
public class DocumentoDto {
    private int idDocumento;
    private String nombreDocumento;
    private String descripcionDocumento;
    private String ultimaActualizacion;

    public DocumentoDto() {
    }

    public DocumentoDto(int idDocumento, String nombreDocumento, String descripcionDocumento, String ultimaActualizacion) {
        this.idDocumento = idDocumento;
        this.nombreDocumento = nombreDocumento;
        this.descripcionDocumento = descripcionDocumento;
        this.ultimaActualizacion = ultimaActualizacion;
    }
    
    
    

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }

    public void setDescripcionDocumento(String descripcionDocumento) {
        this.descripcionDocumento = descripcionDocumento;
    }

    public String getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(String ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
    
    
    
}
