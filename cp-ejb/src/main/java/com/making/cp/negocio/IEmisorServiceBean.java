/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.emisor.EmisorDto;
import java.util.List;

/**
 *
 * @author Camilo Marroquin
 */
public interface IEmisorServiceBean {
    
    public List<EmisorDto> obtenerEmisores();
}
