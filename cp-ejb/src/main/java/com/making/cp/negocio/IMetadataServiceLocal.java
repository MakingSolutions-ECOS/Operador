package com.making.cp.negocio;

import com.making.cp.cliente.metadata.MetadataTipoDocumentoDto;
import java.util.List;

/**
 * Contrato para consumir los métodos del servicio web de metadata.
 *
 * @author John Dany
 */
public interface IMetadataServiceLocal {

    /**
     * Método que obtiene todos los metadata de tipos de documentos.
     *
     * @return colección de objetos MetadataTipoDocumentoDto
     */
    public List<MetadataTipoDocumentoDto> obtenerMetadataTipoDocuementos()  throws Exception;
}
