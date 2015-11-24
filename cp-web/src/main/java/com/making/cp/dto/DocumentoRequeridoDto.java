/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.dto;

/**
 *
 * @author Camilo Marroquin
 */
public class DocumentoRequeridoDto extends DocumentoDto{
    
    /**
     * Si el documento esta cargado en el sistema
     */
    private boolean Cargado;

    /**
     * Retorna el valor de la variable Cargado
     * @return 
     */
    public boolean isCargado() {
        return Cargado;
    }

    /**
     * Setea el valor de la variable Cargado
     * @param Cargado 
     */
    public void setCargado(boolean Cargado) {
        this.Cargado = Cargado;
    }
    
    
}
