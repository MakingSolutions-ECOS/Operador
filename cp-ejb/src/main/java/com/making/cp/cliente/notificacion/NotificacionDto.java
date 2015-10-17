
package com.making.cp.cliente.notificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para notificacionDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="notificacionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCiudadano" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" minOccurs="0"/>
 *         &lt;element name="codigoNotificacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoNotificacionEstado" type="{http://services.ecos.edu.uniandes.co/}notificacionEstadoDto" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlAdjunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificacionDto", propOrder = {
    "codigoCiudadano",
    "codigoNotificacion",
    "codigoNotificacionEstado",
    "mensaje",
    "remitente",
    "urlAdjunto"
})
public class NotificacionDto {

    protected CiudadanoDto codigoCiudadano;
    protected Integer codigoNotificacion;
    protected NotificacionEstadoDto codigoNotificacionEstado;
    protected String mensaje;
    protected String remitente;
    protected String urlAdjunto;

    /**
     * Obtiene el valor de la propiedad codigoCiudadano.
     * 
     * @return
     *     possible object is
     *     {@link CiudadanoDto }
     *     
     */
    public CiudadanoDto getCodigoCiudadano() {
        return codigoCiudadano;
    }

    /**
     * Define el valor de la propiedad codigoCiudadano.
     * 
     * @param value
     *     allowed object is
     *     {@link CiudadanoDto }
     *     
     */
    public void setCodigoCiudadano(CiudadanoDto value) {
        this.codigoCiudadano = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoNotificacion() {
        return codigoNotificacion;
    }

    /**
     * Define el valor de la propiedad codigoNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoNotificacion(Integer value) {
        this.codigoNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNotificacionEstado.
     * 
     * @return
     *     possible object is
     *     {@link NotificacionEstadoDto }
     *     
     */
    public NotificacionEstadoDto getCodigoNotificacionEstado() {
        return codigoNotificacionEstado;
    }

    /**
     * Define el valor de la propiedad codigoNotificacionEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificacionEstadoDto }
     *     
     */
    public void setCodigoNotificacionEstado(NotificacionEstadoDto value) {
        this.codigoNotificacionEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad remitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitente() {
        return remitente;
    }

    /**
     * Define el valor de la propiedad remitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitente(String value) {
        this.remitente = value;
    }

    /**
     * Obtiene el valor de la propiedad urlAdjunto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAdjunto() {
        return urlAdjunto;
    }

    /**
     * Define el valor de la propiedad urlAdjunto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAdjunto(String value) {
        this.urlAdjunto = value;
    }

}
