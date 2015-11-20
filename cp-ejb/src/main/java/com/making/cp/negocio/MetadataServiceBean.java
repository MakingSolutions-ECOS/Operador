package com.making.cp.negocio;

import com.making.cp.cliente.metadata.MetaDataService;
import com.making.cp.cliente.metadata.MetaDataService_Service;
import com.making.cp.cliente.metadata.MetadataTipoDocumentoDto;
import com.making.cp.cliente.metadata.RespuestaMetadata;
import java.util.List;

/**
 * ServiceBean manejador de la MetaDataService
 *
 * @author John Dany
 */
public class MetadataServiceBean implements IMetadataServiceLocal {

    /**
     * Método que obtiene las metadata tipos de docuemento.
     *
     * @return colección de objetos MetadataTipoDocumentoDto
     * @throws Exception con el mensaje que viene del centralizador.
     */
    @Override
    public List<MetadataTipoDocumentoDto> obtenerMetadataTipoDocuementos() throws Exception {
        List<MetadataTipoDocumentoDto> metadataTipoDocumentoDtos = null;
        RespuestaMetadata respuesta;

        MetaDataService_Service servicio = new MetaDataService_Service();
        MetaDataService metaDataService = servicio.getMetaDataServicePort();
        respuesta = metaDataService.obtenerMetadataTiposDocumentos();
        if (respuesta != null) {
            if (respuesta.isSePresentoError()) {
                throw new Exception(respuesta.getErrorMensaje() + " *** " + respuesta.getErrorOriginal() + "***");
            }

            metadataTipoDocumentoDtos = respuesta.getTiposDocumentoMetaData();
        }

        return metadataTipoDocumentoDtos;
    }
}
