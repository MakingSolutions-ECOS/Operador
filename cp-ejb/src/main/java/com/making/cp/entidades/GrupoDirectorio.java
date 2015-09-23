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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "GRUPO_DIRECTORIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupoDirectorio.findAll", query = "SELECT g FROM GrupoDirectorio g"),
    @NamedQuery(name = "GrupoDirectorio.findByCodigoGrupoDirectorio", query = "SELECT g FROM GrupoDirectorio g WHERE g.codigoGrupoDirectorio = :codigoGrupoDirectorio")})
public class GrupoDirectorio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_GRUPO_DIRECTORIO")
    private Integer codigoGrupoDirectorio;
    @OneToMany(mappedBy = "codigoGrupoDirectorio")
    private List<Directorio> directorioList;
    @JoinColumn(name = "CODIGO_GRUPO", referencedColumnName = "CODIGO_GRUPO")
    @ManyToOne
    private Grupo codigoGrupo;

    public GrupoDirectorio() {
    }

    public GrupoDirectorio(Integer codigoGrupoDirectorio) {
        this.codigoGrupoDirectorio = codigoGrupoDirectorio;
    }

    public Integer getCodigoGrupoDirectorio() {
        return codigoGrupoDirectorio;
    }

    public void setCodigoGrupoDirectorio(Integer codigoGrupoDirectorio) {
        this.codigoGrupoDirectorio = codigoGrupoDirectorio;
    }

    @XmlTransient
    public List<Directorio> getDirectorioList() {
        return directorioList;
    }

    public void setDirectorioList(List<Directorio> directorioList) {
        this.directorioList = directorioList;
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
        hash += (codigoGrupoDirectorio != null ? codigoGrupoDirectorio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoDirectorio)) {
            return false;
        }
        GrupoDirectorio other = (GrupoDirectorio) object;
        if ((this.codigoGrupoDirectorio == null && other.codigoGrupoDirectorio != null) || (this.codigoGrupoDirectorio != null && !this.codigoGrupoDirectorio.equals(other.codigoGrupoDirectorio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.cp.entidades.GrupoDirectorio[ codigoGrupoDirectorio=" + codigoGrupoDirectorio + " ]";
    }
    
}
