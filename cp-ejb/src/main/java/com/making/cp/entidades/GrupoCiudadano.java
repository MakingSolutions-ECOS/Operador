/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
<<<<<<< HEAD
 * @author Jimmy
=======
 * @author Usuario
>>>>>>> origin/master
 */
@Entity
@Table(name = "GRUPO_CIUDADANO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupoCiudadano.findAll", query = "SELECT g FROM GrupoCiudadano g"),
    @NamedQuery(name = "GrupoCiudadano.findByCodigoGrupoCiudadano", query = "SELECT g FROM GrupoCiudadano g WHERE g.codigoGrupoCiudadano = :codigoGrupoCiudadano")})
public class GrupoCiudadano implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_GRUPO_CIUDADANO")
    private Integer codigoGrupoCiudadano;
    @JoinColumn(name = "CODIGO_PERMISO", referencedColumnName = "CODIGO_PERMISO")
    @ManyToOne(optional = false)
    private Permiso codigoPermiso;
    @JoinColumn(name = "CODIGO_GRUPO", referencedColumnName = "CODIGO_GRUPO")
    @ManyToOne(optional = false)
    private Grupo codigoGrupo;

    public GrupoCiudadano() {
    }

    public GrupoCiudadano(Integer codigoGrupoCiudadano) {
        this.codigoGrupoCiudadano = codigoGrupoCiudadano;
    }

    public Integer getCodigoGrupoCiudadano() {
        return codigoGrupoCiudadano;
    }

    public void setCodigoGrupoCiudadano(Integer codigoGrupoCiudadano) {
        this.codigoGrupoCiudadano = codigoGrupoCiudadano;
    }

    public Permiso getCodigoPermiso() {
        return codigoPermiso;
    }

    public void setCodigoPermiso(Permiso codigoPermiso) {
        this.codigoPermiso = codigoPermiso;
    }

    public Grupo getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(Grupo codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoGrupoCiudadano != null ? codigoGrupoCiudadano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoCiudadano)) {
            return false;
        }
        GrupoCiudadano other = (GrupoCiudadano) object;
        if ((this.codigoGrupoCiudadano == null && other.codigoGrupoCiudadano != null) || (this.codigoGrupoCiudadano != null && !this.codigoGrupoCiudadano.equals(other.codigoGrupoCiudadano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.cp.entidades.GrupoCiudadano[ codigoGrupoCiudadano=" + codigoGrupoCiudadano + " ]";
    }
    
}
