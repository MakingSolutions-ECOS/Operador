/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Your Name
 */
public class TramiteDto {
    
    private int idTramite;
    private String nombreTramite;
    private String fechaTramite;
    private String estadoTramite;
    private String nombreEntidad;
    private List<DocumentoDto> documentosTramite;

    public TramiteDto(int idTramite, String nombreTramite, String fechaTramite, String estadoTramite, String nombreEntidad, List<DocumentoDto> documentosTramite) {
        this.idTramite = idTramite;
        this.nombreTramite = nombreTramite;
        this.fechaTramite = fechaTramite;
        this.estadoTramite = estadoTramite;
        this.nombreEntidad = nombreEntidad;
        this.documentosTramite = documentosTramite;
    }
    
    

    public int getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(int idTramite) {
        this.idTramite = idTramite;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public String getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(String fechaTramite) {
        this.fechaTramite = fechaTramite;
    }

 

    public String getEstadoTramite() {
        return estadoTramite;
    }

    public void setEstadoTramite(String estadoTramite) {
        this.estadoTramite = estadoTramite;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public List<DocumentoDto> getDocumentosTramite() {
        return documentosTramite;
    }

    public void setDocumentosTramite(List<DocumentoDto> documentosTramite) {
        this.documentosTramite = documentosTramite;
    }
    
    
    
    
    
}
