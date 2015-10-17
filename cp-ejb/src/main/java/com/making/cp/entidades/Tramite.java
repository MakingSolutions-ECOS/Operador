/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jimmy
 */
@Entity
@Table(name = "TRAMITE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tramite.findAll", query = "SELECT t FROM Tramite t"),
    @NamedQuery(name = "Tramite.findByCodigoTramite", query = "SELECT t FROM Tramite t WHERE t.codigoTramite = :codigoTramite"),
    @NamedQuery(name = "Tramite.findByCodigoTramiteCentralizador", query = "SELECT t FROM Tramite t WHERE t.codigoTramiteCentralizador = :codigoTramiteCentralizador")})
public class Tramite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_TRAMITE")
    private Integer codigoTramite;
    @Column(name = "CODIGO_TRAMITE_CENTRALIZADOR")
    private Integer codigoTramiteCentralizador;
    @JoinColumn(name = "CODIGO_CIUDADANO", referencedColumnName = "CODIGO_CIUDADANO")
    @ManyToOne
    private Ciudadano codigoCiudadano;

    public Tramite() {
    }

    public Tramite(Integer codigoTramite) {
        this.codigoTramite = codigoTramite;
    }

    public Integer getCodigoTramite() {
        return codigoTramite;
    }

    public void setCodigoTramite(Integer codigoTramite) {
        this.codigoTramite = codigoTramite;
    }

    public Integer getCodigoTramiteCentralizador() {
        return codigoTramiteCentralizador;
    }

    public void setCodigoTramiteCentralizador(Integer codigoTramiteCentralizador) {
        this.codigoTramiteCentralizador = codigoTramiteCentralizador;
    }

    public Ciudadano getCodigoCiudadano() {
        return codigoCiudadano;
    }

    public void setCodigoCiudadano(Ciudadano codigoCiudadano) {
        this.codigoCiudadano = codigoCiudadano;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoTramite != null ? codigoTramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        if ((this.codigoTramite == null && other.codigoTramite != null) || (this.codigoTramite != null && !this.codigoTramite.equals(other.codigoTramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.cp.entidades.Tramite[ codigoTramite=" + codigoTramite + " ]";
    }
    
}
