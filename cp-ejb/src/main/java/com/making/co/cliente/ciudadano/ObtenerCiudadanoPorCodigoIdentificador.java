
package com.making.co.cliente.ciudadano;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerCiudadanoPorCodigoIdentificador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerCiudadanoPorCodigoIdentificador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoIdentificador" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCiudadanoPorCodigoIdentificador", propOrder = {
    "identificacionOperador",
    "codigoIdentificador"
})
public class ObtenerCiudadanoPorCodigoIdentificador {

    protected String identificacionOperador;
    protected int codigoIdentificador;

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
     * Obtiene el valor de la propiedad codigoIdentificador.
     * 
     */
    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    /**
     * Define el valor de la propiedad codigoIdentificador.
     * 
     */
    public void setCodigoIdentificador(int value) {
        this.codigoIdentificador = value;
    }

}
