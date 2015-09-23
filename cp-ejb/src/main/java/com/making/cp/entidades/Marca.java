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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "MARCA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marca.findAll", query = "SELECT m FROM Marca m"),
    @NamedQuery(name = "Marca.findByCodigoMarca", query = "SELECT m FROM Marca m WHERE m.codigoMarca = :codigoMarca"),
    @NamedQuery(name = "Marca.findByMarca", query = "SELECT m FROM Marca m WHERE m.marca = :marca")})
public class Marca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_MARCA")
    private Integer codigoMarca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "MARCA")
    private String marca;
    @JoinColumn(name = "CODIGO_MARCA_DIRECTORIO", referencedColumnName = "CODIGO_MARCA_DIRECTORIO")
    @ManyToOne
    private MarcaDirectorio codigoMarcaDirectorio;

    public Marca() {
    }

    public Marca(Integer codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public Marca(Integer codigoMarca, String marca) {
        this.codigoMarca = codigoMarca;
        this.marca = marca;
    }

    public Integer getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(Integer codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public MarcaDirectorio getCodigoMarcaDirectorio() {
        return codigoMarcaDirectorio;
    }

    public void setCodigoMarcaDirectorio(MarcaDirectorio codigoMarcaDirectorio) {
        this.codigoMarcaDirectorio = codigoMarcaDirectorio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMarca != null ? codigoMarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.codigoMarca == null && other.codigoMarca != null) || (this.codigoMarca != null && !this.codigoMarca.equals(other.codigoMarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.making.cp.entidades.Marca[ codigoMarca=" + codigoMarca + " ]";
    }
    
}
