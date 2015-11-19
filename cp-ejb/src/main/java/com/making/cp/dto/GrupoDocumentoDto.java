package com.making.cp.dto;

import java.util.List;

/**
 * Clase que representa el entity GrupoDocumento
 *
 * @author John Dany
 */
public class GrupoDocumentoDto {

    private Integer codigoGrupoDocumento;
    private List<DocumentoDto> documentoList;
    private GrupoDto codigoGrupo;

    /**
     * Inicializa una nueva instancia de GrupoDocumentoDto
     *
     * @param codigoGrupoDocumento
     * @param documentoList
     * @param codigoGrupo
     */
    public GrupoDocumentoDto(Integer codigoGrupoDocumento, List<DocumentoDto> documentoList, GrupoDto codigoGrupo) {
        this.codigoGrupoDocumento = codigoGrupoDocumento;
        this.documentoList = documentoList;
        this.codigoGrupo = codigoGrupo;
    }

    public Integer getCodigoGrupoDocumento() {
        return codigoGrupoDocumento;
    }

    public void setCodigoGrupoDocumento(Integer codigoGrupoDocumento) {
        this.codigoGrupoDocumento = codigoGrupoDocumento;
    }

    public List<DocumentoDto> getDocumentoList() {
        return documentoList;
    }

    public void setDocumentoList(List<DocumentoDto> documentoList) {
        this.documentoList = documentoList;
    }

    public GrupoDto getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(GrupoDto codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }
}
