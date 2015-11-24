/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.quartz;

import com.making.cp.negocio.Helper.ConstantesOperador;
import com.making.cp.negocio.ITramiteServiceLocal;
import com.making.cp.quartz.exception.QuartzJEEException;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author Your Name
 */

@Stateless(name = "QuartzJEESessionBean", mappedName = "ejb/QuartzJEESessionBean")
public class QuartzJEESessionBean implements QuartzJEESessionBeanLocal {

    private static Scheduler scheduler;
    @EJB(beanName = "TramiteServiceBean")
    private ITramiteServiceLocal iTramiteServiceLocal;

  
    /**
     * Método ejecutado desde la tarea de quartz, para verificar los trámites que cuentan con el estado FINALIZADO
     * en la plataforma centralizadora por operador, los trámites son actualizados en su estado a NOTIFICADO, luego de 
     * invocar el servicio de notificaciones y descargar el documento del repo alojandolo en la carpeta del ciudadano.
     * @param parametrosJob 
     */
    @Override
    public void programarLeerEstadosTramite(HashMap parametrosJob) {

        try {
            System.out.print("LANZANDO LECTURA DE ESTADOS DE TRAM");
            //Ejecuta la consulta de estados de trámite
            iTramiteServiceLocal.consultarEstadosTramite(ConstantesOperador.ESTADO_TRAMITE_FINALIZADO);
        } catch (Exception e) {
            Logger.getLogger(QuartzJEESessionBean.class.getName()).log(Level.SEVERE, "ERROR AL PROCESAR ESTADOS DE TRAM. " + e.getMessage(), e);
        }
        try {

            Logger.getLogger(QuartzJEESessionBean.class.getName()).log(Level.INFO, "PROGRAMANDO QUARTZ ARCHIVOS DE CONSULTA DE ESTADOS DE TRAM");
            //SE VUELVE A ACTIVAR EL QUARTZ
            this.programarLecturaTramite();

        } catch (Exception e) {

            //ERROR AL ACTIVAR QUARTZ
            Logger.getLogger(QuartzJEESessionBean.class.getName()).log(Level.SEVERE, "ERROR AL PROCESAR ESTADOS DE TRÁMITE. " + e.getMessage(), e);

        }      
    }
    public void scheduleEJBJob(QuartzJEEJobDetail jobDetail) throws QuartzJEEException {
        try {
            if (scheduler != null) {
                // Si el job ya esta programado se elimina
                if (jobDetail != null && jobDetail.getJobDetail() != null && jobDetail.getJobDetail().getKey() != null) {
                    scheduler.deleteJob(jobDetail.getJobDetail().getKey());
                }
                // Asocia el trigger con en Job shcduler
                scheduler.scheduleJob(jobDetail.getJobDetail(), jobDetail.getJobTrigger());
            } else {
                iniciarQuartz(scheduler);
            }
        } catch (SchedulerException ex) {
            throw new QuartzJEEException("Error agendando Job: " + ex.getMessage(), ex);
        }
    }

    @Override
    public void programarLecturaTramite() {
        try {
            ProgramacionGenericaEJBJobDetail jobDetail = new ProgramacionGenericaEJBJobDetail();

            // Se arma un hash con los parametros del job
            HashMap parametrosJob = new HashMap();
            // Se arma un hash con los parametros del trigger
            HashMap parametrosTrigger = new HashMap();

            parametrosTrigger.put("triggerName", "LeerEstadosTramiteEJBTrigger");
            parametrosTrigger.put("startTime", new Date());
            parametrosTrigger.put("cronExpression", "0 0/5 * 1/1 * ? *"); 

            // Detalle del job
            jobDetail.setJobDetail("LeerEstadosTramiteInvokerEJBJob", Scheduler.DEFAULT_GROUP, EJB3InvokerJob.class,"ejb/QuartzJEESessionBean", "programarLeerEstadosTramite",
                    "com.making.cp.quartz.QuartzJEESessionBean", parametrosTrigger, parametrosJob);
            // Se programa el Job
            this.scheduleEJBJob(jobDetail);
        } catch (QuartzJEEException ex) {
            Logger.getLogger(QuartzJEESessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void iniciarQuartz(Scheduler schedulerCreado) throws QuartzJEEException {
        try {
            scheduler = schedulerCreado;

            // Se declara el scheduler
            if (scheduler == null) {
                scheduler = createScheduler();
            }
            // Se inicia el scheduler
            if ((scheduler != null) && !scheduler.isStarted()) {
                scheduler.start();
            }
        } catch (SchedulerException ex) {
            System.out.print("Quartz > Error inicializando scheduler: " + ex.getMessage());
            System.out.print("Quartz > Se reintenta inicio");
        }
    }

    private Scheduler createScheduler() throws SchedulerException {
        return StdSchedulerFactory.getDefaultScheduler();
    }
}
