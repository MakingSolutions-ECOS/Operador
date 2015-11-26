/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

/**
 *
 * @author Camilo Marroquin
 */
public class MetadataTipoDocumentoDto {
    private String nombreMetadataTipoDocumento;
    private String descripcionMetadataTipoDocumento;

    public String getNombreMetadataTipoDocumento() {
        return nombreMetadataTipoDocumento;
    }

    public void setNombreMetadataTipoDocumento(String nombreMetadataTipoDocumento) {
        this.nombreMetadataTipoDocumento = nombreMetadataTipoDocumento;
    }

    public String getDescripcionMetadataTipoDocumento() {
        return descripcionMetadataTipoDocumento;
    }

    public void setDescripcionMetadataTipoDocumento(String descripcionMetadataTipoDocumento) {
        this.descripcionMetadataTipoDocumento = descripcionMetadataTipoDocumento;
    }
}
