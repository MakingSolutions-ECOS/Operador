/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.quartz;

import com.making.cp.quartz.exception.QuartzJEEException;
import java.util.Date;
import java.util.HashMap;
import javax.batch.api.listener.JobListener;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;

/**
 *
 * @author Sergio Forero
 */
public  class ProgramacionGenericaEJBJobDetail extends QuartzJEEJobDetail {

    private Trigger trigger;
    private JobListener jobListener;

    /**
     * Creates a new instance of ProgramacionGenericaEJBJobDetail
     */
    public ProgramacionGenericaEJBJobDetail() {
    }

    @Override
    public void loadJobDataMap(String ejbJndiNameKey, String ejbMethodKey, String ejbInterfaceClass, HashMap parametrosJob) throws QuartzJEEException {
        try {
            jobDetail.getJobDataMap().put("ejb", ejbJndiNameKey);
            jobDetail.getJobDataMap().put("method", ejbMethodKey);
            jobDetail.getJobDataMap().put("interfaceClass", ejbInterfaceClass);

            Object[] args = new Object[1];
            args[0] = parametrosJob;

            jobDetail.getJobDataMap().put("args", args);

            Class[] argTypes = new Class[1];
            argTypes[0] = java.util.HashMap.class;

            jobDetail.getJobDataMap().put("argTypes", argTypes);
        } catch (Exception ex) {
            throw new QuartzJEEException("Error cargando el datamap del job", ex);
        }
    }

    @Override
    public void setJobTrigger(HashMap parametrosTrigger) throws QuartzJEEException {

        TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
        triggerBuilder.withIdentity((String) parametrosTrigger.get("triggerName"), Scheduler.DEFAULT_GROUP);
         if (parametrosTrigger.get("cronExpression") != null) {
                triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule((String) parametrosTrigger.get("cronExpression")));
            } 
        if (parametrosTrigger.get("startTime") != null) {
            triggerBuilder.startAt((Date) parametrosTrigger.get("startTime"));
        }        
        trigger = triggerBuilder.build();

    }

    @Override
    public JobDetail getJobDetail() {
        return jobDetail;
    }

   

    @Override
    public JobListener getJobListener() {
        return jobListener;
    }

    @Override
    public Trigger getJobTrigger() {
        return trigger;
    }

}
