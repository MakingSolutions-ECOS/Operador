/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.making.cp.persistencia;

import com.making.cp.entidad.Usuario;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio Forero
 */
public class UsuarioFacadeTest {

    public UsuarioFacadeTest() {
    }
    private EntityManager em;
    private EntityTransaction tx;
    UsuarioFacade usuarioFacade;

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
     * Test of create method, of class UsuarioFacade.
     */
//    @Test
//    public void testCreate() throws Exception {
//        System.out.println("create");
//        Usuario entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        UsuarioFacadeLocal instance = (UsuarioFacadeLocal)container.getContext().lookup("java:global/classes/UsuarioFacade");
//        instance.create(entity);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of edit method, of class UsuarioFacade.
     */
//    @Test
//    public void testEdit() throws Exception {
//        System.out.println("edit");
//        Usuario entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        UsuarioFacadeLocal instance = (UsuarioFacadeLocal)container.getContext().lookup("java:global/classes/UsuarioFacade");
//        instance.edit(entity);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of remove method, of class UsuarioFacade.
     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Usuario entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        UsuarioFacadeLocal instance = (UsuarioFacadeLocal)container.getContext().lookup("java:global/classes/UsuarioFacade");
//        instance.remove(entity);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of find method, of class UsuarioFacade.
     */
//    @Test
//    public void testFind() throws Exception {
//        System.out.println("find");
//        Object id = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        UsuarioFacadeLocal instance = (UsuarioFacadeLocal)container.getContext().lookup("java:global/classes/UsuarioFacade");
//        Usuario expResult = null;
//        Usuario result = instance.find(id);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of findAll method, of class UsuarioFacade.
     *
     * @throws java.lang.Exception
     */
//    @Test
//    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        Map<String, Object> properties = new HashMap<String, Object>();
//        properties.put(EJBContainer.MODULES, new File("target/classes"));
//        properties.put("org.glassfish.ejb.embedded.glassfish.installation.root",
//                "./src/test/glassfish");
//        EJBContainer container = EJBContainer.createEJBContainer(properties);
//        UsuarioFacade instance = (UsuarioFacade) container.getContext().lookup("java:global/classes/UsuarioFacade");
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.making.cp_cp-ejb_ejb_1.0PU");
//        em = emf.createEntityManager();
//        tx = em.getTransaction();
//        this.usuarioFacade = new UsuarioFacade();
//        this.usuarioFacade.setEm(em);
//        List<Usuario> expResult = null;
//        List<Usuario> result = usuarioFacade.findAll();
//        assertEquals(expResult, result);
//        container.close();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findRange method, of class UsuarioFacade.
     */
//    @Test
//    public void testFindRange() throws Exception {
//        System.out.println("findRange");
//        int[] range = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        UsuarioFacadeLocal instance = (UsuarioFacadeLocal)container.getContext().lookup("java:global/classes/UsuarioFacade");
//        List<Usuario> expResult = null;
//        List<Usuario> result = instance.findRange(range);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of count method, of class UsuarioFacade.
     */
//    @Test
//    public void testCount() throws Exception {
//        System.out.println("count");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        UsuarioFacadeLocal instance = (UsuarioFacadeLocal)container.getContext().lookup("java:global/classes/UsuarioFacade");
//        int expResult = 0;
//        int result = instance.count();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
