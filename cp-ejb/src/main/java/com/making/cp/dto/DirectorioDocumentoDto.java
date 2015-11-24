package com.making.cp.dto;

import java.util.List;

/**
 * Clase que representa el entity DirectorioDocumento
 *
 * @author John Dany
 */
public class DirectorioDocumentoDto {

    private Integer codigoDirectorioDocumento;
    private List<DirectorioDto> directorioList;
    private List<DocumentoDto> documentoList;

    /**
     * Incializa una nueva instancia de DirectorioDocumentoDto
     */
    public DirectorioDocumentoDto() {
    }

    public DirectorioDocumentoDto(Integer codigoDirectorioDocumento) {
        this.codigoDirectorioDocumento = codigoDirectorioDocumento;
    }

    /**
     * Inicializa una nueva instancia de DirectorioDocumentoDto con parámetros.
     *
     * @param codigoDirectorioDocumento
     * @param directorioList
     * @param documentoList
     */
    public DirectorioDocumentoDto(Integer codigoDirectorioDocumento, List<DirectorioDto> directorioList, List<DocumentoDto> documentoList) {
        this.codigoDirectorioDocumento = codigoDirectorioDocumento;
        this.directorioList = directorioList;
        this.documentoList = documentoList;
    }

    public Integer getCodigoDirectorioDocumento() {
        return codigoDirectorioDocumento;
    }

    public void setCodigoDirectorioDocumento(Integer codigoDirectorioDocumento) {
        this.codigoDirectorioDocumento = codigoDirectorioDocumento;
    }

    public List<DirectorioDto> getDirectorioList() {
        return directorioList;
    }

    public void setDirectorioList(List<DirectorioDto> directorioList) {
        this.directorioList = directorioList;
    }

    public List<DocumentoDto> getDocumentoList() {
        return documentoList;
    }

    public void setDocumentoList(List<DocumentoDto> documentoList) {
        this.documentoList = documentoList;
    }

}
