/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.controladores;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
@Named(value = "crudRolManagedBean")
@SessionScoped
public class CrudRolManagedBean implements Serializable {

    /**
     * Creates a new instance of CrudRolManagedBean
     */
    public CrudRolManagedBean() {
    }
    
}
