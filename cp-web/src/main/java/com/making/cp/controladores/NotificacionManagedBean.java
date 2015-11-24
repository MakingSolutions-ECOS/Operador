/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.controladores;

import com.making.cp.cliente.notificacion.NotificacionDto;
import com.making.cp.cliente.notificacion.NotificacionService;
import com.making.cp.cliente.notificacion.NotificacionService_Service;
import com.making.cp.cliente.notificacion.RespuestaNotificacion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Usuario
 */
@Named(value = "notificacionManagedBean")
@SessionScoped
public class NotificacionManagedBean implements Serializable {

    private NotificacionService_Service service;
    private NotificacionService notificacionService;

    private List<NotificacionDto> notificacionDtos;
    private NotificacionDto mensajeVer;

    /**
     * Creates a new instance of NotificacionManagedBean
     */
    public NotificacionManagedBean() {
    }

    @PostConstruct
    public void init() {
        mensajeVer = new NotificacionDto();
        service = new NotificacionService_Service();
        notificacionService = service.getNotificacionServicePort();
        cargarNotificaciones();
    }

    public void cargarNotificaciones() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        Integer codCiudadano = (Integer) session.getAttribute("codCiudadano");
        RespuestaNotificacion notificacion = notificacionService.obtenerNotificacionCiudadano(codCiudadano);
        notificacionDtos = notificacion.getNotificacionDto();
    }

    public void leerMensaje(NotificacionDto msg) {
        mensajeVer = msg;
        if (mensajeVer.getCodigoNotificacionEstado().getCodigoEstado() == 1) {
            notificacionService.cambiarEstadoNotificacion(mensajeVer.getCodigoNotificacion());
            cargarNotificaciones();
        }
    }

    public List<NotificacionDto> getNotificacionDtos() {
        return notificacionDtos;
    }

    public void setNotificacionDtos(List<NotificacionDto> notificacionDtos) {
        this.notificacionDtos = notificacionDtos;
    }

    public NotificacionDto getMensajeVer() {
        return mensajeVer;
    }

    public void setMensajeVer(NotificacionDto mensajeVer) {
        this.mensajeVer = mensajeVer;
    }

}
