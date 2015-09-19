/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.controladores;

import com.making.cp.dto.ArchivoDto;
import com.making.cp.dto.DocumentoDto;
import com.making.cp.dto.TramiteDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author Your Name
 */
@ManagedBean(name = "tramiteManagedBean")
@Dependent
public class TramiteManagedBean {

    public List<TramiteDto> tramites;
    public List<ArchivoDto> selectedFiles;
    public TramiteDto tramiteSeleccionado;
    private DataTable bindingDataTable;
    private boolean dialogView;

    @PostConstruct
    public void init() {
        iniciarListaTramites();
    }

    public void iniciarListaTramites() {
        tramites = new ArrayList<>();
        List<DocumentoDto> dtos = new ArrayList<>();
        DocumentoDto dto = new DocumentoDto(1, "DIPLOMA UNIVERSITARIO", "Documento que certifica estudios de pregrado", "01/01/2015");
        dtos.add(dto);
        dto = new DocumentoDto(2, "CÉDULA CIUDADANÍA", "Documento que identifica ciudadano", "13/01/2003");
        dtos.add(dto);
        TramiteDto tramiteDto = new TramiteDto(1, "AUTENTICACIÓN DOCUMENTO", "01/07/2015", "EN SOLICITUD A ENTIDAD", "NOTARÍA 33", dtos);
        tramites.add(tramiteDto);
        dtos = new ArrayList<>();
        dto = new DocumentoDto(1, "CÉDULA CIUDADANÍA", "Documento que identifica ciudadano", "13/01/2003");
        dtos.add(dto);
        dto = new DocumentoDto(2, "CERTIFICADO LIBERTAD", "Situación actual de bien inmueble", "10/07/2015");
        dtos.add(dto);
        dto = new DocumentoDto(2, "PLANO DE PROYECTO DE PARCELACIÓN", "Plano con división sucesiva de terrenos", "08/07/2015");
        dtos.add(dto);
        tramiteDto = new TramiteDto(2, "EXPEDICIÓN LICENCIA PARCELACIÓN", "01/07/2015", "EN EJECUCIÓN", "CURADURÍA 1", dtos);
        tramites.add(tramiteDto);
        dtos = new ArrayList<>();
        dto = new DocumentoDto(1, "CÉDULA CIUDADANÍA", "Documento que identifica ciudadano", "13/01/2003");
        dtos.add(dto);
        dto = new DocumentoDto(2, "COMPROBANTE DE PAGO", "Comprobante de pago", "07/07/2015");
        dtos.add(dto);
        tramiteDto = new TramiteDto(3, "EXPEDICIÓN PASAPORTE", "21/07/2015", "FINALIZADO CON ÉXITO", "CANCILLERÍA", dtos);
    }

    public void seleccionarTramite() {
        tramiteSeleccionado = (TramiteDto) bindingDataTable.getRowData();
        dialogView = true;
    }

    public List<TramiteDto> getTramites() {
        return tramites;
    }

    public void setTramites(List<TramiteDto> tramites) {
        this.tramites = tramites;
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

}
