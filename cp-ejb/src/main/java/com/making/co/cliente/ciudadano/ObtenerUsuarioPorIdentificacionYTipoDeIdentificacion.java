
package com.making.co.cliente.ciudadano;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerUsuarioPorIdentificacionYTipoDeIdentificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerUsuarioPorIdentificacionYTipoDeIdentificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIdentifiacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerUsuarioPorIdentificacionYTipoDeIdentificacion", propOrder = {
    "identificacionOperador",
    "identificacion",
    "tipoIdentifiacion"
})
public class ObtenerUsuarioPorIdentificacionYTipoDeIdentificacion {

    protected String identificacionOperador;
    protected String identificacion;
    protected int tipoIdentifiacion;

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
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentifiacion.
     * 
     */
    public int getTipoIdentifiacion() {
        return tipoIdentifiacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentifiacion.
     * 
     */
    public void setTipoIdentifiacion(int value) {
        this.tipoIdentifiacion = value;
    }

}
