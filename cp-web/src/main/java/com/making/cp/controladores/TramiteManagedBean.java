/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.controladores;

import com.making.cp.cliente.emisor.EmisorDto;
import com.making.cp.cliente.emisor.TramiteDefinicionDto;

import com.making.cp.dto.ArchivoDto;
import com.making.cp.dto.DocumentoDto;
import com.making.cp.dto.TramiteDto;
import com.making.cp.dto.UsuarioDto;
import com.making.cp.negocio.IEmisorServiceLocal;
import com.making.cp.negocio.ITramiteServiceLocal;
import com.making.cp.negocio.LoginServiceBeanLocal;
import java.io.Serializable;
import java.util.ArrayList;
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
 * @author Your Name
 */
@ViewScoped
@ManagedBean(name = "tramiteManagedBean")
public class TramiteManagedBean implements  Serializable{

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
    //private List<DocuemtoTramiteDto> documentos = new ArrayList<DocuemtoTramiteDto>();
    

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
//        iniciarListaTramites();
//        getTramiteDefinicion();
        getEmisores();
    }

    public void iniciarListaTramites() {

        List<DocumentoDto> dtos = new ArrayList<>();
//<<<<<<< HEAD
////        DocumentoDto dto = new DocumentoDto(1, "DIPLOMA UNIVERSITARIO", "Documento que certifica estudios de pregrado", "01/01/2015");
////        dtos.add(dto);
////        dto = new DocumentoDto(2, "CÉDULA CIUDADANÍA", "Documento que identifica ciudadano", "13/01/2003");
////        dtos.add(dto);
////        TramiteDto tramiteDto = new TramiteDto(1, "AUTENTICACIÓN DOCUMENTO", "01/07/2015", "EN SOLICITUD A ENTIDAD", "NOTARÍA 33", dtos);
////        tramites.add(tramiteDto);
//=======
//        DocumentoDto dto = new DocumentoDto(1, "DIPLOMA UNIVERSITARIO", new Date("01/01/2015"));
//        dtos.add(dto);
////        dto = new DocumentoDto(2, "CÉDULA CIUDADANÍA", "Documento que identifica ciudadano", "13/01/2003");
////        dtos.add(dto);
//        TramiteDto tramiteDto = new TramiteDto(1, "AUTENTICACIÓN DOCUMENTO", "01/07/2015", "EN SOLICITUD A ENTIDAD", "NOTARÍA 33", dtos);
//        tramites.add(tramiteDto);
//>>>>>>> origin/master
////        dtos = new ArrayList<>();
////        dto = new DocumentoDto(1, "CÉDULA CIUDADANÍA", "Documento que identifica ciudadano", "13/01/2003");
////        dtos.add(dto);
////        dto = new DocumentoDto(2, "CERTIFICADO LIBERTAD", "Situación actual de bien inmueble", "10/07/2015");
//        dtos.add(dto);
//        dto = new DocumentoDto(2, "PLANO DE PROYECTO DE PARCELACIÓN", "Plano con división sucesiva de terrenos", "08/07/2015");
//        dtos.add(dto);
//        tramiteDto = new TramiteDto(2, "EXPEDICIÓN LICENCIA PARCELACIÓN", "01/07/2015", "EN EJECUCIÓN", "CURADURÍA 1", dtos);
//        tramites.add(tramiteDto);
//        dtos = new ArrayList<>();
//        dto = new DocumentoDto(1, "CÉDULA CIUDADANÍA", "Documento que identifica ciudadano", "13/01/2003");
//        dtos.add(dto);
//        dto = new DocumentoDto(2, "COMPROBANTE DE PAGO", "Comprobante de pago", "07/07/2015");
//        dtos.add(dto);
//        tramiteDto = new TramiteDto(3, "EXPEDICIÓN PASAPORTE", "21/07/2015", "FINALIZADO CON ÉXITO", "CANCILLERÍA", dtos);
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

    public List<SelectItem> getListaEmisores(){
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

    public void cargarTramites(AjaxBehaviorEvent e ) {
        String codigoEntidad = e.getSource().toString();
        listaTramiteDefinicion = new ArrayList<>();
        try {
            for (EmisorDto emisor : emisores) {
                if (emisor.getCodigoEntidadEmisora() == emisorSeleccionado.getCodigoEntidadEmisora()) {
                    for (TramiteDefinicionDto tramiteDefinicionDto : emisor.getTramiteDefinicionList()) {
                        SelectItem selectItem = new SelectItem(tramiteDefinicionDto.getCodigoTramiteDefinicion(), tramiteDefinicionDto.getDescripcion());
                        listaTramiteDefinicion.add(selectItem);
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
