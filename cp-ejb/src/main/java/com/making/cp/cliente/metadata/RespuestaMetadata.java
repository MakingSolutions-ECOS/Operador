
package com.making.cp.cliente.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaMetadata complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.ecos.edu.uniandes.co/}respuestaService">
 *       &lt;sequence>
 *         &lt;element name="tiposDocumentoMetaData" type="{http://services.ecos.edu.uniandes.co/}metadataTipoDocumentoDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaMetadata", propOrder = {
    "tiposDocumentoMetaData"
})
public class RespuestaMetadata
    extends RespuestaService
{

    @XmlElement(nillable = true)
    protected List<MetadataTipoDocumentoDto> tiposDocumentoMetaData;

    /**
     * Gets the value of the tiposDocumentoMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposDocumentoMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposDocumentoMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataTipoDocumentoDto }
     * 
     * 
     */
    public List<MetadataTipoDocumentoDto> getTiposDocumentoMetaData() {
        if (tiposDocumentoMetaData == null) {
            tiposDocumentoMetaData = new ArrayList<MetadataTipoDocumentoDto>();
        }
        return this.tiposDocumentoMetaData;
    }

}
