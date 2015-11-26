/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.quartz;

import com.making.cp.quartz.exception.QuartzJEEException;
import java.io.Serializable;
import java.util.HashMap;

import javax.batch.api.listener.JobListener;
import static org.quartz.JobBuilder.newJob;
import org.quartz.JobDetail;
import org.quartz.Trigger;


/**
 *
 * @author Sergio Forero
 */
public abstract class QuartzJEEJobDetail implements Serializable
{
    public JobDetail jobDetail;
    
    public final void setJobDetail( String nombreJob, String defaultGroup, Class claseJob, String ejbJndiNameKey, String ejbMethodKey, String ejbInterfaceClass, 
                                    HashMap parametrosTrigger, HashMap parametrosJob ) throws QuartzJEEException
    {
        this.jobDetail = newJob(claseJob).withIdentity(nombreJob, defaultGroup).requestRecovery(true).build();   
        this.setJobTrigger( parametrosTrigger );
        
        loadJobDataMap( ejbJndiNameKey, ejbMethodKey, ejbInterfaceClass, parametrosJob );
    } 
    
     

    abstract public JobDetail getJobDetail();
   
    abstract public JobListener getJobListener();        
    abstract public void setJobTrigger( HashMap parametrosTrigger ) throws QuartzJEEException;
    abstract public Trigger getJobTrigger();    
    abstract public void loadJobDataMap( String ejbJndiNameKey, String ejbMethodKey, String ejbInterfaceClass, HashMap parametrosJob ) throws QuartzJEEException;
}
