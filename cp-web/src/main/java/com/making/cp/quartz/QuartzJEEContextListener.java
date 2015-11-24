/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.quartz;

import com.making.cp.quartz.exception.QuartzJEEException;
import javax.ejb.EJB;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author Your Name
 */
public class QuartzJEEContextListener implements ServletContextListener {

    private static Scheduler scheduler;
    private ServletContext ctx = null;
    @EJB (beanName = "QuartzJEESessionBean")
    private QuartzJEESessionBeanLocal quartzJEESessionBeanLocal;
    

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ctx = sce.getServletContext();
        if (scheduler == null) {
            StdSchedulerFactory factory;
            try {
                factory = new StdSchedulerFactory("/opt/quartz.properties");
                scheduler = factory.getScheduler();
                ctx.setAttribute("org.quartz.impl.StdSchedulerFactory.KEY", factory);
                quartzJEESessionBeanLocal.iniciarQuartz(scheduler);               
                quartzJEESessionBeanLocal.programarLecturaTramite();           
             } catch (SchedulerException | QuartzJEEException ex) {
            System.out.print("Quartz > Error al realizar Programación de la tarea: " + ex.getMessage());
        }
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destroy");
    }

    

   

   

    
}
