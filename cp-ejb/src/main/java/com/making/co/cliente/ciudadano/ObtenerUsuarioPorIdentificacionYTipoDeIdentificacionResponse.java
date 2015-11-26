
package com.making.co.cliente.ciudadano;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerUsuarioPorIdentificacionYTipoDeIdentificacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerUsuarioPorIdentificacionYTipoDeIdentificacionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.ecos.edu.uniandes.co/}respuestaCiudadano" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerUsuarioPorIdentificacionYTipoDeIdentificacionResponse", propOrder = {
    "_return"
})
public class ObtenerUsuarioPorIdentificacionYTipoDeIdentificacionResponse {

    @XmlElement(name = "return")
    protected RespuestaCiudadano _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaCiudadano }
     *     
     */
    public RespuestaCiudadano getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaCiudadano }
     *     
     */
    public void setReturn(RespuestaCiudadano value) {
        this._return = value;
    }

}
