/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

/**
 *
 * @author Sergio Forero
 */
class MarcaDto {

    private Integer codigoMarca;
    private String marca;
    private MarcaDirectorioDto codigoMarcaDirectorio;

    public MarcaDto() {
    }

    public MarcaDto(Integer codigoMarca, String marca, MarcaDirectorioDto codigoMarcaDirectorio) {
        this.codigoMarca = codigoMarca;
        this.marca = marca;
        this.codigoMarcaDirectorio = codigoMarcaDirectorio;
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

    public MarcaDirectorioDto getCodigoMarcaDirectorio() {
        return codigoMarcaDirectorio;
    }

    public void setCodigoMarcaDirectorio(MarcaDirectorioDto codigoMarcaDirectorio) {
        this.codigoMarcaDirectorio = codigoMarcaDirectorio;
    }

}
