/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author Camilo Marroquin
 */
public class TramiteServiceBeanTest {
    
    public TramiteServiceBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerEmisores method, of class TramiteServiceBean.
     */
    @org.junit.Test
    public void testObtenerEmisores() {
        System.out.println("obtenerEmisores");
        TramiteServiceBean instance = new TramiteServiceBean();
        instance.obtenerEmisores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
