
package com.making.cp.cliente;

import com.making.cp.cliente.emisor.EmisorDto;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaEmisor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaEmisor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.ecos.edu.uniandes.co/}respuestaService">
 *       &lt;sequence>
 *         &lt;element name="emisores" type="{http://services.ecos.edu.uniandes.co/}emisorDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaEmisor", propOrder = {
    "emisores"
})
public class RespuestaEmisor
    extends RespuestaService
{

    @XmlElement(nillable = true)
    protected List<EmisorDto> emisores;

    /**
     * Gets the value of the emisores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emisores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmisores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmisorDto }
     * 
     * 
     */
    public List<EmisorDto> getEmisores() {
        if (emisores == null) {
            emisores = new ArrayList<EmisorDto>();
        }
        return this.emisores;
    }

}
