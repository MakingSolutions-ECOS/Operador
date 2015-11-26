/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

import java.util.List;

/**
 *
 * @author Sergio Forero
 */
class RecursoPermitidoDto {

    private Integer codigoRecursoPermitido;
    private String descripcionRecurso;
    private List<RolRecursoPermitidoDto> rolRecursoPermitidoList;

    public RecursoPermitidoDto() {
    }

    public RecursoPermitidoDto(Integer codigoRecursoPermitido, String descripcionRecurso, List<RolRecursoPermitidoDto> rolRecursoPermitidoList) {
        this.codigoRecursoPermitido = codigoRecursoPermitido;
        this.descripcionRecurso = descripcionRecurso;
        this.rolRecursoPermitidoList = rolRecursoPermitidoList;
    }

    public Integer getCodigoRecursoPermitido() {
        return codigoRecursoPermitido;
    }

    public void setCodigoRecursoPermitido(Integer codigoRecursoPermitido) {
        this.codigoRecursoPermitido = codigoRecursoPermitido;
    }

    public String getDescripcionRecurso() {
        return descripcionRecurso;
    }

    public void setDescripcionRecurso(String descripcionRecurso) {
        this.descripcionRecurso = descripcionRecurso;
    }

    public List<RolRecursoPermitidoDto> getRolRecursoPermitidoList() {
        return rolRecursoPermitidoList;
    }

    public void setRolRecursoPermitidoList(List<RolRecursoPermitidoDto> rolRecursoPermitidoList) {
        this.rolRecursoPermitidoList = rolRecursoPermitidoList;
    }

}
