
package com.making.co.cliente.ciudadano;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaTipoIdentificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaTipoIdentificacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.ecos.edu.uniandes.co/}respuestaService">
 *       &lt;sequence>
 *         &lt;element name="tipoIdentificacionDtos" type="{http://services.ecos.edu.uniandes.co/}tipoIdentificacionDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaTipoIdentificacion", propOrder = {
    "tipoIdentificacionDtos"
})
public class RespuestaTipoIdentificacion
    extends RespuestaService
{

    @XmlElement(nillable = true)
    protected List<TipoIdentificacionDto> tipoIdentificacionDtos;

    /**
     * Gets the value of the tipoIdentificacionDtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoIdentificacionDtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoIdentificacionDtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoIdentificacionDto }
     * 
     * 
     */
    public List<TipoIdentificacionDto> getTipoIdentificacionDtos() {
        if (tipoIdentificacionDtos == null) {
            tipoIdentificacionDtos = new ArrayList<TipoIdentificacionDto>();
        }
        return this.tipoIdentificacionDtos;
    }

}
