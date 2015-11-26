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
class RolRecursoPermitidoDto {

    private Integer codigoRolRecursoPermitido;
    private RolDto codigoRol;
    private RecursoPermitidoDto codigoRecursoPermitido;

    public RolRecursoPermitidoDto() {
    }

    public RolRecursoPermitidoDto(Integer codigoRolRecursoPermitido, RolDto codigoRol, RecursoPermitidoDto codigoRecursoPermitido) {
        this.codigoRolRecursoPermitido = codigoRolRecursoPermitido;
        this.codigoRol = codigoRol;
        this.codigoRecursoPermitido = codigoRecursoPermitido;
    }

    public Integer getCodigoRolRecursoPermitido() {
        return codigoRolRecursoPermitido;
    }

    public void setCodigoRolRecursoPermitido(Integer codigoRolRecursoPermitido) {
        this.codigoRolRecursoPermitido = codigoRolRecursoPermitido;
    }

    public RolDto getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(RolDto codigoRol) {
        this.codigoRol = codigoRol;
    }

    public RecursoPermitidoDto getCodigoRecursoPermitido() {
        return codigoRecursoPermitido;
    }

    public void setCodigoRecursoPermitido(RecursoPermitidoDto codigoRecursoPermitido) {
        this.codigoRecursoPermitido = codigoRecursoPermitido;
    }

}
