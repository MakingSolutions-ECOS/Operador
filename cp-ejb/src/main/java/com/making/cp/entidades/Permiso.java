/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
<<<<<<< HEAD
 * @author Jimmy
=======
 * @author Usuario
>>>>>>> origin/master
 */
@Entity
@Table(name = "PERMISO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permiso.findAll", query = "SELECT p FROM Permiso p"),
    @NamedQuery(name = "Permiso.findByCodigoPermiso", query = "SELECT p FROM Permiso p WHERE p.codigoPermiso = :codigoPermiso"),
    @NamedQuery(name = "Permiso.findByCodigoGrupoUsuario", query = "SELECT p FROM Permiso p WHERE p.codigoGrupoUsuario = :codigoGrupoUsuario"),
    @NamedQuery(name = "Permiso.findByNombrePermiso", query = "SELECT p FROM Permiso p WHERE p.nombrePermiso = :nombrePermiso")})
public class Permiso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_PERMISO")
    private Integer codigoPermiso;
    @Column(name = "CODIGO_GRUPO_USUARIO")
    private Integer codigoGrupoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NOMBRE_PERMISO")
    private String nombrePermiso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoPermiso")
    private List<GrupoCiudadano> grupoCiudadanoList;

    public Permiso() {
    }

    public Permiso(Integer codigoPermiso) {
        this.codigoPermiso = codigoPermiso;
    }

    public Permiso(Integer codigoPermiso, String nombrePermiso) {
        this.codigoPermiso = codigoPermiso;
        this.nombrePermiso = nombrePermiso;
    }

    public Integer getCodigoPermiso() {
        return codigoPermiso;
    }

    public void setCodigoPermiso(Integer codigoPermiso) {
        this.codigoPermiso = codigoPermiso;
    }

    public Integer getCodigoGrupoUsuario() {
        return codigoGrupoUsuario;
    }

    public void setCodigoGrupoUsuario(Integer codigoGrupoUsuario) {
        this.codigoGrupoUsuario = codigoGrupoUsuario;
    }

    public String getNombrePermiso() {
        return nombrePermiso;
    }

    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }

    @XmlTransient
    public List<GrupoCiudadano> getGrupoCiudadanoList() {
        return grupoCiudadanoList;
    }

    public void setGrupoCiudadanoList(List<GrupoCiudadano> grupoCiudadanoList) {
        this.grupoCiudadanoList = grupoCiudadanoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPermiso != null ? codigoPermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        if ((this.codigoPermiso == null && other.codigoPermiso != null) || (this.codigoPermiso != null && !this.codigoPermiso.equals(other.codigoPermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.cp.entidades.Permiso[ codigoPermiso=" + codigoPermiso + " ]";
    }
    
}
