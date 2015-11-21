/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.controladores;

import com.making.cp.persistencia.UsuarioFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Usuario
 */
@Named(value = "loginManagedBean")
@SessionScoped
public class LoginManagedBean implements Serializable {

    private String usuario = "";
    private String contrasenia = "";

    @EJB
    private UsuarioFacadeLocal usuarioFacadeLocal;

    /**
     * Creates a new instance of LoginManagedBean
     */
    public LoginManagedBean() {
    }

    @PostConstruct
    public void init() {

    }

    public String verificarUsuario() {
        boolean resp = usuarioFacadeLocal.validarUsuario(usuario, contrasenia);
        if (resp == true) {
            return "panelControl";
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_WARN,
                                    "INFO!", "Usuario no valido"));
            return "";
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
