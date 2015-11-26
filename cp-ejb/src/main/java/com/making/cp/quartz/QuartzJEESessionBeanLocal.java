/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.quartz;

import com.making.cp.quartz.exception.QuartzJEEException;
import java.util.HashMap;
import javax.ejb.Local;
import org.quartz.Scheduler;

/**
 *
 * @author Sergio Forero
 */
@Local
public interface QuartzJEESessionBeanLocal {
    public void programarLecturaTramite();
     public void iniciarQuartz(Scheduler schedulerCreado) throws QuartzJEEException;
     public void programarLeerEstadosTramite(HashMap parametrosJob) ;
    
}
