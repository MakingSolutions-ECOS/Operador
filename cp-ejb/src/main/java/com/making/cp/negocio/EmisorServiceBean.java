/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import com.making.cp.cliente.emisor.EmisorDto;
import com.making.cp.negocio.Helper.EmisorHelper;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Camilo Marroquin
 */
@Stateless
public class EmisorServiceBean implements IEmisorServiceLocal{
     @Override
    public List<EmisorDto> obtenerEmisores() {
        EmisorHelper emisorHelper = new EmisorHelper();
        return emisorHelper.obtenerEmisores();
    }   
}
