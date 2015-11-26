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
class PublicidadImagenDto {

    private Integer codigoPublicidadImagen;
    private String rutaFisicaImagen;
    private PublicidadDto codigoPublicidad;

    public PublicidadImagenDto() {
    }

    public PublicidadImagenDto(Integer codigoPublicidadImagen, String rutaFisicaImagen, PublicidadDto codigoPublicidad) {
        this.codigoPublicidadImagen = codigoPublicidadImagen;
        this.rutaFisicaImagen = rutaFisicaImagen;
        this.codigoPublicidad = codigoPublicidad;
    }

    public Integer getCodigoPublicidadImagen() {
        return codigoPublicidadImagen;
    }

    public void setCodigoPublicidadImagen(Integer codigoPublicidadImagen) {
        this.codigoPublicidadImagen = codigoPublicidadImagen;
    }

    public String getRutaFisicaImagen() {
        return rutaFisicaImagen;
    }

    public void setRutaFisicaImagen(String rutaFisicaImagen) {
        this.rutaFisicaImagen = rutaFisicaImagen;
    }

    public PublicidadDto getCodigoPublicidad() {
        return codigoPublicidad;
    }

    public void setCodigoPublicidad(PublicidadDto codigoPublicidad) {
        this.codigoPublicidad = codigoPublicidad;
    }

}
