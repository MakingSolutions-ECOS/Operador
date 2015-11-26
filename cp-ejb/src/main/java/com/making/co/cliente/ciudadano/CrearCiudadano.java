
package com.making.co.cliente.ciudadano;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearCiudadano complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearCiudadano">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudadano" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearCiudadano", propOrder = {
    "identificacionOperador",
    "ciudadano"
})
public class CrearCiudadano {

    protected String identificacionOperador;
    protected CiudadanoDto ciudadano;

    /**
     * Obtiene el valor de la propiedad identificacionOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionOperador() {
        return identificacionOperador;
    }

    /**
     * Define el valor de la propiedad identificacionOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionOperador(String value) {
        this.identificacionOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadano.
     * 
     * @return
     *     possible object is
     *     {@link CiudadanoDto }
     *     
     */
    public CiudadanoDto getCiudadano() {
        return ciudadano;
    }

    /**
     * Define el valor de la propiedad ciudadano.
     * 
     * @param value
     *     allowed object is
     *     {@link CiudadanoDto }
     *     
     */
    public void setCiudadano(CiudadanoDto value) {
        this.ciudadano = value;
    }

}
