
package com.making.co.cliente.ciudadano;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaCiudadano complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaCiudadano">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.ecos.edu.uniandes.co/}respuestaService">
 *       &lt;sequence>
 *         &lt;element name="ciudadanoDto" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaCiudadano", propOrder = {
    "ciudadanoDto"
})
public class RespuestaCiudadano
    extends RespuestaService
{

    protected CiudadanoDto ciudadanoDto;

    /**
     * Obtiene el valor de la propiedad ciudadanoDto.
     * 
     * @return
     *     possible object is
     *     {@link CiudadanoDto }
     *     
     */
    public CiudadanoDto getCiudadanoDto() {
        return ciudadanoDto;
    }

    /**
     * Define el valor de la propiedad ciudadanoDto.
     * 
     * @param value
     *     allowed object is
     *     {@link CiudadanoDto }
     *     
     */
    public void setCiudadanoDto(CiudadanoDto value) {
        this.ciudadanoDto = value;
    }

}
