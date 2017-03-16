/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elef
 */
public class TestTest extends TestCase{
    
    public TestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        String elef = "<elef>";
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Test.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double a = 8.0;
        double b = 5.0;
        double expResult = 13.0;
        double result = test.Test.suma(a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Comparacion : "+ expResult+ " vs " +result);
    }

    /**
     * Test of resta method, of class Test.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 8.0;
        double b = 5.0;
        double expResult = 3.0;
        double result = test.Test.resta(a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Comparacion : "+ expResult+ " vs " +result);
    }

    /**
     * Test of producto method, of class Test.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        double a = 8.0;
        double b = 5.0;
        double expResult = 40.01;
        double result = test.Test.producto(a, b);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Comparacion : "+ expResult+ " vs " +result);
    }

    /**
     * Test of main method, of class Test.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        System.out.println("Aproved");
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
