/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.controladores;

import com.making.cp.cliente.emisor.DocumentoRequeridoTramiteDto;
import com.making.cp.cliente.emisor.EmisorDto;
import com.making.cp.cliente.emisor.TramiteDefinicionDto;

import com.making.cp.dto.ArchivoDto;
import com.making.cp.dto.DocumentoDto;
import com.making.cp.dto.DocumentoRequeridoDto;
import com.making.cp.dto.TramiteDto;
import com.making.cp.dto.UsuarioDto;
import com.making.cp.negocio.IEmisorServiceLocal;
import com.making.cp.negocio.ITramiteServiceLocal;
import com.making.cp.negocio.LoginServiceBeanLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author Sergio Forero
 */
@ViewScoped
@ManagedBean(name = "tramiteManagedBean")
public class TramiteManagedBean implements Serializable {

    @EJB(beanName = "EmisorServiceBean")
    private IEmisorServiceLocal iEmisorServiceBean;
    @EJB(beanName = "TramiteServiceBean")
    private ITramiteServiceLocal iTramiteServiceLocal;

    private List<EmisorDto> emisores;
    private EmisorDto emisorSeleccionado;
    private TramiteDefinicionDto tramiteDefinicionSeleccionado;

    private List<ArchivoDto> selectedFiles;
    private TramiteDto tramiteSeleccionado;
    private DataTable bindingDataTable;
    private boolean dialogView;

    private List<SelectItem> listaEmisores;
    private List<TramiteDto> tramites;
    private List<TramiteDefinicionDto> tramiteDefinicionGeneral;
    private List<SelectItem> listaTramiteDefinicion;
    private List<DocumentoRequeridoDto> documentos = new ArrayList<>();

    public List<DocumentoRequeridoDto> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentoRequeridoDto> documentos) {
        this.documentos = documentos;
    }

    @EJB(beanName = "LoginServiceBean")
    private LoginServiceBeanLocal loginServiceBeanLocal;

    public TramiteManagedBean() {
        emisores = new ArrayList<>();
        listaEmisores = new ArrayList<>();
        emisorSeleccionado = new EmisorDto();
        listaTramiteDefinicion = new ArrayList<>();
        tramites = new ArrayList<>();
        tramiteSeleccionado = new TramiteDto();
    }

    @PostConstruct
    public void init() {
        getEmisores();
    }

    public void iniciarListaTramites() {

        List<DocumentoDto> dtos = new ArrayList<>();
    }

    public void seleccionarTramite() {
        tramiteSeleccionado = (TramiteDto) bindingDataTable.getRowData();
        dialogView = true;
    }

    public List<ArchivoDto> getSelectedFiles() {
        return selectedFiles;
    }

    public void setSelectedFiles(List<ArchivoDto> selectedFiles) {
        this.selectedFiles = selectedFiles;
    }

    public TramiteDto getTramiteSeleccionado() {
        return tramiteSeleccionado;
    }

    public void setTramiteSeleccionado(TramiteDto tramiteSeleccionado) {
        this.tramiteSeleccionado = tramiteSeleccionado;
    }

    public DataTable getBindingDataTable() {
        return bindingDataTable;
    }

    public void setBindingDataTable(DataTable bindingDataTable) {
        this.bindingDataTable = bindingDataTable;
    }

    public boolean isDialogView() {
        return dialogView;
    }

    public void setDialogView(boolean dialogView) {
        this.dialogView = dialogView;
    }

    public List<SelectItem> getListaEmisores() {
        return listaEmisores;
    }

    public void setListaEmisores(List<SelectItem> listaEmisores) {
        this.listaEmisores = listaEmisores;
    }

    public EmisorDto getEmisorSeleccionado() {
        return emisorSeleccionado;
    }

    public void setEmisorSeleccionado(EmisorDto emisorSeleccionado) {
        this.emisorSeleccionado = emisorSeleccionado;
    }

    public List<TramiteDto> getTramites() {
        return tramites;
    }

    public void setTramites(List<TramiteDto> tramites) {
        this.tramites = tramites;
    }

    public void ejecutartramite() {
        List<Integer> requeridos = new ArrayList<>();
        requeridos.add(1);
        UsuarioDto usuarioDto = loginServiceBeanLocal.getUsuarioSesion();
        iTramiteServiceLocal.getDocumentosFaltantes(requeridos, 1, usuarioDto.getCiudadanoDto());

    }

    public void getTramiteDefinicion() {
        try {
            emisores = iEmisorServiceBean.obtenerEmisores();
            for (EmisorDto emisor : emisores) {
                SelectItem selectItem = new SelectItem(emisor.getCodigoEntidadEmisora(), emisor.getNombreEntidadEmisora());
                listaTramiteDefinicion.add(selectItem);
            }
        } catch (Exception ex) {

        }
    }

    public void setTramiteDefinicion(List<TramiteDefinicionDto> tramiteDefinicion) {
        this.tramiteDefinicionGeneral = tramiteDefinicion;
    }

    public void getEmisores() {
        try {
            emisores = iEmisorServiceBean.obtenerEmisores();
            for (EmisorDto emisorDto : emisores) {
                SelectItem selectItem = new SelectItem(emisorDto.getCodigoEntidadEmisora(), emisorDto.getNombreEntidadEmisora());
                listaEmisores.add(selectItem);
            }
        } catch (Exception e) {
            Logger.getLogger(TramiteManagedBean.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void cargarTramites(AjaxBehaviorEvent e) {
        String codigoEntidad = e.getSource().toString();
        listaTramiteDefinicion = new ArrayList<>();
        try {
            for (EmisorDto emisor : emisores) {
                if (emisor.getCodigoEntidadEmisora() == emisorSeleccionado.getCodigoEntidadEmisora()) {
                    emisorSeleccionado = emisor;
                    for (TramiteDefinicionDto tramiteDefinicionDto : emisor.getTramiteDefinicionList()) {
                        SelectItem selectItem = new SelectItem(tramiteDefinicionDto.getCodigoTramiteDefinicion(), tramiteDefinicionDto.getDescripcion());
                        listaTramiteDefinicion.add(selectItem);
                    }
                }
            }
        } catch (Exception ex) {
        }
    }
    
    public void cargarDocumentos(AjaxBehaviorEvent e) {
        String codigoTramite = e.getSource().toString();
        documentos = new ArrayList<>();
        try {
            for (EmisorDto emisor : emisores) {
                if (emisor.getCodigoEntidadEmisora() == emisorSeleccionado.getCodigoEntidadEmisora()) {
                    for (TramiteDefinicionDto tramiteDefinicionDto : emisor.getTramiteDefinicionList()) {
                        if (tramiteDefinicionDto.getCodigoTramiteDefinicion() == tramiteSeleccionado.getIdTramite()) {
                            for (DocumentoRequeridoTramiteDto documento : tramiteDefinicionDto.getDocumentoRequeridoTramiteList()) {
                                
                                /*Validacion de los documentos faltantes*/
                                //TramiteServiceBean.getDocumentosFaltantes()
                                
                                documentos.add(new DocumentoRequeridoDto(true, documento.getCodigoDocumentoRequerido(), 
                                        documento.getCodigoMetadataTipoDocumento().getNombreMetadataTipoDocumento(), new Date() ));
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    public List<SelectItem> getListaTramiteDefinicion() {
        return listaTramiteDefinicion;
    }

    public void setListaTramiteDefinicion(List<SelectItem> listaTramiteDefinicion) {
        this.listaTramiteDefinicion = listaTramiteDefinicion;
    }

    public TramiteDefinicionDto getTramiteDefinicionSeleccionado() {
        return tramiteDefinicionSeleccionado;
    }

    public void setTramiteDefinicionSeleccionado(TramiteDefinicionDto tramiteDefinicionSeleccionado) {
        this.tramiteDefinicionSeleccionado = tramiteDefinicionSeleccionado;
    }

}
