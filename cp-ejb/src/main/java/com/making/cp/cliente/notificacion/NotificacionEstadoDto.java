
package com.making.cp.cliente.notificacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para notificacionEstadoDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="notificacionEstadoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEstado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificacionList" type="{http://services.ecos.edu.uniandes.co/}notificacionDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificacionEstadoDto", propOrder = {
    "codigoEstado",
    "nombreEstado",
    "notificacionList"
})
public class NotificacionEstadoDto {

    protected Integer codigoEstado;
    protected String nombreEstado;
    @XmlElement(nillable = true)
    protected List<NotificacionDto> notificacionList;

    /**
     * Obtiene el valor de la propiedad codigoEstado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Define el valor de la propiedad codigoEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoEstado(Integer value) {
        this.codigoEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEstado() {
        return nombreEstado;
    }

    /**
     * Define el valor de la propiedad nombreEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEstado(String value) {
        this.nombreEstado = value;
    }

    /**
     * Gets the value of the notificacionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificacionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificacionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificacionDto }
     * 
     * 
     */
    public List<NotificacionDto> getNotificacionList() {
        if (notificacionList == null) {
            notificacionList = new ArrayList<NotificacionDto>();
        }
        return this.notificacionList;
    }

}
