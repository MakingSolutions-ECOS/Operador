/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "MARCA_DIRECTORIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MarcaDirectorio.findAll", query = "SELECT m FROM MarcaDirectorio m"),
    @NamedQuery(name = "MarcaDirectorio.findByCodigoMarcaDirectorio", query = "SELECT m FROM MarcaDirectorio m WHERE m.codigoMarcaDirectorio = :codigoMarcaDirectorio")})
public class MarcaDirectorio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_MARCA_DIRECTORIO")
    private Integer codigoMarcaDirectorio;
    @OneToMany(mappedBy = "codigoMarcaDirectorio")
    private List<Marca> marcaList;
    @OneToMany(mappedBy = "codigoMarcaDirectorio")
    private List<Directorio> directorioList;

    public MarcaDirectorio() {
    }

    public MarcaDirectorio(Integer codigoMarcaDirectorio) {
        this.codigoMarcaDirectorio = codigoMarcaDirectorio;
    }

    public Integer getCodigoMarcaDirectorio() {
        return codigoMarcaDirectorio;
    }

    public void setCodigoMarcaDirectorio(Integer codigoMarcaDirectorio) {
        this.codigoMarcaDirectorio = codigoMarcaDirectorio;
    }

    @XmlTransient
    public List<Marca> getMarcaList() {
        return marcaList;
    }

    public void setMarcaList(List<Marca> marcaList) {
        this.marcaList = marcaList;
    }

    @XmlTransient
    public List<Directorio> getDirectorioList() {
        return directorioList;
    }

    public void setDirectorioList(List<Directorio> directorioList) {
        this.directorioList = directorioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMarcaDirectorio != null ? codigoMarcaDirectorio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarcaDirectorio)) {
            return false;
        }
        MarcaDirectorio other = (MarcaDirectorio) object;
        if ((this.codigoMarcaDirectorio == null && other.codigoMarcaDirectorio != null) || (this.codigoMarcaDirectorio != null && !this.codigoMarcaDirectorio.equals(other.codigoMarcaDirectorio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.cp.entidades.MarcaDirectorio[ codigoMarcaDirectorio=" + codigoMarcaDirectorio + " ]";
    }
    
}
