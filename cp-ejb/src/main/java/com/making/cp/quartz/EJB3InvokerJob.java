/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.quartz;

import com.making.cp.quartz.exception.QuartzJEEException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author Sergio Forero
 */
public class EJB3InvokerJob implements Job {

    public EJB3InvokerJob() {
        super();
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        try {
            InitialContext jndiContext = null;
            // guarda la referencia al EJB
            Object value = null;
            // Clase con ruta abosulta del Bean a ejecutar
            Class beanClass;
            // Metodo de clase a invocar del EJB
            Method methodExecute = null;
            // DataMap con los parametros de invocacion
            JobDataMap dataMap = context.getJobDetail().getJobDataMap();

            // Datos del EJB a invocar
            String ejb = dataMap.getString("ejb");
            String method = dataMap.getString("method");
            String interfaceClass = dataMap.getString("interfaceClass");

            System.out.print("Intentando ejecutar {ejb=" + ejb + ",method=" + method + ",intefaceClass=" + interfaceClass + "}");

            if (ejb == null) {
                QuartzJEEException quartzEx = new QuartzJEEException("El  EJB a invocar no puede ser nulo");
                throw new JobExecutionException(quartzEx);
            }

            // Se obtienen los argumentos del metodo a invocar del EJB
            Object[] arguments = (Object[]) dataMap.get("args");

            if (arguments == null) {
                arguments = new Object[0];
            }

            // Se obtiene el initial context de acuerdo a los parametros de invocacion
            try {
                jndiContext = getInitialContext(dataMap);
            } catch (NamingException ne) {
                QuartzJEEException quartzEx = new QuartzJEEException("Error obteniendo el InitialContext");
                throw new JobExecutionException(quartzEx);
            }

            // Se busca la referencia al EJB
            try {
                value = jndiContext.lookup("java:global/cp-ear/cp-ejb-1.0/QuartzJEESessionBean!com.making.cp.quartz.QuartzJEESessionBeanLocal");
            } catch (NamingException ne) {
                QuartzJEEException quartzEx = new QuartzJEEException("Error buscando el EJB");
                throw new JobExecutionException(quartzEx);
            }

            // Se obtiene una Clase de la interfaz del Bean a jecutar
            try {
                beanClass = Class.forName(interfaceClass);
            } catch (ClassNotFoundException e) {
                QuartzJEEException quartzEx = new QuartzJEEException("No se encontro la clase indicada por EJB_INTERFACE_CLASS");
                throw new JobExecutionException(quartzEx);
            }

            // Se obtienen los tipos de datos de los argumentos del método del EJB
            Class[] argTypes = (Class[]) dataMap.get("argTypes");

            // Si no se define el arreglo de tipos de los parametros, se crea un arreglo de acuerdo a los tipos de datos que vienen en los argumentos
            if (argTypes == null) {
                argTypes = new Class[arguments.length];

                for (int i = 0; i < arguments.length; i++) {
                    argTypes[i] = arguments[i].getClass();
                }
            }

            // Se obtienen todas las interfaces expuestas por la Clase
            Class[] interfaces = beanClass.getInterfaces();
            boolean encontroMetodo = false;

            for (int i = 0; (i < interfaces.length) && !encontroMetodo; i++) {
                try {
                    // Se busca el metodo solicitado y se utiliza la primer interfaz encontrada
                    methodExecute = interfaces[i].getMethod(method, argTypes); //getDeclaredMethod
                    encontroMetodo = true;
                } catch (NoSuchMethodException nsme) {
                    // No encontro metodo. Continue con la siguiente interfaz
                }
            }

            // Se verifica si se encontro el metodo
            if (!encontroMetodo) {
                QuartzJEEException quartzEx = new QuartzJEEException("No se encontro interfaz con metodo " + method + " declarado. "
                        + "El Bean {" + beanClass.getName() + "} debe implementar alguna interfaz");
                throw new JobExecutionException(quartzEx);
            }

            // Se hace la invocacion del metodo
            methodExecute.invoke(value, arguments);
        } catch (JobExecutionException ex) {
            System.out.print("Se presento un problema inesperado en la ejecucion de la tarea" + (ex.getMessage() != null ? ": " + ex.getMessage() : ""));
            throw ex;
        } catch (IllegalAccessException iae) {
            System.out.print("Acceso ilegal al metodo" + (iae.getMessage() != null ? ": " + iae.getMessage() : ""));
            QuartzJEEException quartzEx = new QuartzJEEException("Acceso ilegal al metodo" + (iae.getMessage() != null ? ": " + iae.getMessage() : ""), iae);
            throw new JobExecutionException(quartzEx);
        } catch (InvocationTargetException ite) {
            QuartzJEEException quartzEx = new QuartzJEEException("Se presento un problema en la ejecucion de la tarea" + (ite.getMessage() != null ? ": " + ite.getMessage() : ""), ite);
            throw new JobExecutionException(quartzEx);
        } catch (Exception ex) {
            System.out.print("Se presento un problema inesperado en la ejecucion de la tarea" + (ex.getMessage() != null ? ": " + ex.getMessage() : ""));
            QuartzJEEException quartzEx = new QuartzJEEException("Se presento un problema inesperado en la ejecucion de la tarea" + (ex.getMessage() != null ? ": " + ex.getMessage() : ""), ex);
            throw new JobExecutionException(quartzEx);
        }
    }

    @SuppressWarnings("unchecked")
    private InitialContext getInitialContext(JobDataMap jobDataMap) throws NamingException {
        Hashtable params = new Hashtable(2);
        String initialContextFactory = jobDataMap.getString("java.naming.factory.initial");
        String providerUrl = jobDataMap.getString("java.naming.provider.url");

        if (initialContextFactory != null) {
            params.put(Context.INITIAL_CONTEXT_FACTORY, initialContextFactory);
        }

        if (providerUrl != null) {
            params.put(Context.PROVIDER_URL, providerUrl);
        }

        return new InitialContext(params);
    }

}
