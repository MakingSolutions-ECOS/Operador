/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.controladores;

import com.making.cp.dto.ArchivoDto;
import com.making.cp.dto.MailDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.Dependent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

/**
 *
 * @author Usuario
 */
@ManagedBean(name = "carpetaManagedBean")
@Dependent
public class CarpetaManagedBean {

    public List<ArchivoDto> valor;
    private TreeNode mailboxes;

    private List<MailDto> mails;

    private MailDto mail;

    private TreeNode mailbox;
    
    public List<ArchivoDto> selectedFiles;

    /**
     * Creates a new instance of CarpetaManagedBean
     */
    public CarpetaManagedBean() {
    }

    @PostConstruct
    public void init() {
        iniciarListaArchivos();
        iniciarMail();
    }

    public void iniciarMail() {
        mailboxes = new DefaultTreeNode("root", null);

        TreeNode inbox = new DefaultTreeNode("i", "Bandeja Entrada", mailboxes);
        TreeNode sent = new DefaultTreeNode("s", "Enviados", mailboxes);
        TreeNode trash = new DefaultTreeNode("t", "Eliminados", mailboxes);
        TreeNode junk = new DefaultTreeNode("j", "Spam", mailboxes);

        TreeNode gmail = new DefaultTreeNode("Gmail", inbox);
        TreeNode hotmail = new DefaultTreeNode("Hotmail", inbox);

        mails = new ArrayList<MailDto>();
        mails.add(new MailDto("making@solutions.com", "Presentación Proyecto", "Reunión para presentar el proyecto", new Date()));
        mails.add(new MailDto("ecos@correo.com", "Mensaje Importante", "Mensaje de prueba para la bandeja de entrada", new Date()));
        mails.add(new MailDto("tecno@tecnologia.com", "infraestructura", "La infraestructura para la implementación de la solución técnologica", new Date()));        
    }

    public void iniciarListaArchivos() {
        valor = new ArrayList<ArchivoDto>();
        ArchivoDto arch1 = new ArchivoDto();
        arch1.setTipoArchivo("Carpeta");
        arch1.setNombreArchivo("Documentos Personales");
        arch1.setFechaActualizacion(new Date());
        arch1.setIcono("ui-icon-folder-open");
        valor.add(arch1);
        ArchivoDto arch2 = new ArchivoDto();
        arch2.setTipoArchivo("Archivo");
        arch2.setNombreArchivo("Cedula Ciudadania");
        arch2.setFechaActualizacion(new Date());
        arch2.setIcono("ui-icon-document");
        valor.add(arch2);
        ArchivoDto arch3 = new ArchivoDto();
        arch3.setTipoArchivo("Archivo");
        arch3.setNombreArchivo("Tarjeta Profesional");
        arch3.setFechaActualizacion(new Date());
        arch3.setIcono("ui-icon-document");
        valor.add(arch3);
    }

    public List<ArchivoDto> getValor() {
        return valor;
    }

    public void setValor(List<ArchivoDto> valor) {
        this.valor = valor;
    }

    public TreeNode getMailboxes() {
        return mailboxes;
    }

    public List<MailDto> getMails() {
        return mails;
    }

    public MailDto getMail() {
        return mail;
    }

    public void setMail(MailDto mail) {
        this.mail = mail;
    }

    public TreeNode getMailbox() {
        return mailbox;
    }

    public void setMailbox(TreeNode mailbox) {
        this.mailbox = mailbox;
    }

    public void send() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Mail Sent!"));
    }

    public List<ArchivoDto> getSelectedFiles() {
        return selectedFiles;
    }

    public void setSelectedFiles(List<ArchivoDto> selectedFiles) {
        this.selectedFiles = selectedFiles;
    }
    
                
}
