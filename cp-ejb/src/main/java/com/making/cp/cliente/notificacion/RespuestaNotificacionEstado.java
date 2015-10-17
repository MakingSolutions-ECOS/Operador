
package com.making.cp.cliente.notificacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaNotificacionEstado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaNotificacionEstado">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.ecos.edu.uniandes.co/}respuestaService">
 *       &lt;sequence>
 *         &lt;element name="notificacionEstadoDtos" type="{http://services.ecos.edu.uniandes.co/}notificacionEstadoDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaNotificacionEstado", propOrder = {
    "notificacionEstadoDtos"
})
public class RespuestaNotificacionEstado
    extends RespuestaService
{

    @XmlElement(nillable = true)
    protected List<NotificacionEstadoDto> notificacionEstadoDtos;

    /**
     * Gets the value of the notificacionEstadoDtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificacionEstadoDtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificacionEstadoDtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificacionEstadoDto }
     * 
     * 
     */
    public List<NotificacionEstadoDto> getNotificacionEstadoDtos() {
        if (notificacionEstadoDtos == null) {
            notificacionEstadoDtos = new ArrayList<NotificacionEstadoDto>();
        }
        return this.notificacionEstadoDtos;
    }

}
