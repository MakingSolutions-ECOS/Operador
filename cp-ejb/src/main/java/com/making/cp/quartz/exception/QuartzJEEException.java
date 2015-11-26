/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.quartz.exception;

/**
 *
 * @author Sergio Forero
 */
public class QuartzJEEException extends Exception{

    /** Creates a new instance of PagoNominaException */
    public QuartzJEEException(String e,Throwable t) {
        super(e,t);
    }

     /** Creates a new instance of PagoNominaException */
    public QuartzJEEException(String e) {
        super(e);
    }
    
}
