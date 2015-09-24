
package com.making.cp.cliente.emisor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emisorDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emisorDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEntidadEmisora" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreEntidadEmisora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emisorDto", propOrder = {
    "codigoEntidadEmisora",
    "nombreEntidadEmisora"
})
public class EmisorDto {

    protected Integer codigoEntidadEmisora;
    protected String nombreEntidadEmisora;

    /**
     * Obtiene el valor de la propiedad codigoEntidadEmisora.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoEntidadEmisora() {
        return codigoEntidadEmisora;
    }

    /**
     * Define el valor de la propiedad codigoEntidadEmisora.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoEntidadEmisora(Integer value) {
        this.codigoEntidadEmisora = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEntidadEmisora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidadEmisora() {
        return nombreEntidadEmisora;
    }

    /**
     * Define el valor de la propiedad nombreEntidadEmisora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidadEmisora(String value) {
        this.nombreEntidadEmisora = value;
    }

}
