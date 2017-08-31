/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Inject;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import uesocc.edu.sv.ingenieria.prn335.guia03.Utilities;

/**
 *
 * @author usuario
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {
  @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
            .addClass(Utilities.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
    
 
    
    @Inject
    Utilities greeter;

     
    @Test
    public void testGetResume() {
        System.out.println("getResume");
        String texto = "Bienvenidos a la materia de Programación 3 Ciclo II 2017";
        String expResult = "Bienvenidos a la mat";
        String result = Utilities.getResume(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fallo testgetresumen");
    }
    
   @Test
    public void testGetResume2() {
        System.out.println("getResume2");
        String texto = "Hola Mundo!”";
        String expResult = "Hola Mundo!”";
        String result = Utilities.getResume(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fallo testgetresumen2");
    }

    @Test
    public void testGetResume3() {
        System.out.println("getResume2");
        String texto = null;
        String expResult = null;
        String result = Utilities.getResume(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fallo testgetresumen3");
    }
    
    /**
     * Test of capitalizar method, of class Utilities.
     */
    @Test
    public void testCapitalizar() {
        System.out.println("capitalizar");
        String texto = "prueBas de UNIDAD con JUnit & arQuillian";
        String expResult = "Pruebas De Unidad Con Junit & Arquillian";
        String result = Utilities.capitalizar(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fallo estcapitalizar");
    }
    @Test
    public void testCapitalizar3() {
        System.out.println("capitalizar");
        String texto = "";
        String expResult = "";
        String result = Utilities.capitalizar(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fallo estcapitalizar");
    }
    @Test
    public void testCapitalizar2() {
        System.out.println("capitalizar");
        String texto = null;
        String expResult = null;
        String result = Utilities.capitalizar(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fallo estcapitalizar");
    }

    /**
     * Test of contarCoincidencias method, of class Utilities.
     */
    @Test
    public void testContarCoincidencias() {
        System.out.println("contarCoincidencias");
        String frase = "Bienvenidos a la materia de Programación 3 Ciclo II 2017.";
        String texto = "2017";
        int expResult = 1;
        int result = Utilities.contarCoincidencias(frase, texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fallo testcontarcoincidencias");
        
    }
    @Test
    public void testContarCoincidencias2() {
        System.out.println("contarCoincidencias");
        String frase = "Bienvenidos a la materia de Programación 3 Ciclo II 2017.";
        String texto = "MA";
        int expResult = 2;
        int result = Utilities.contarCoincidencias(frase, texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fallo testcontarcoincidencias2");
        }
    @Test
    public void testContarCoincidencias3() {
        System.out.println("contarCoincidencias");
        String frase = "null";
        String texto = "bienvenido";
        int expResult = 0;
        int result = Utilities.contarCoincidencias(frase, texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("fallo testcontarcoincidencias3");
        
    }
    
    
    
    
    
    
    
}
