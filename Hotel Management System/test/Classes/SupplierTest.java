/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HarshaKoshila
 */
public class SupplierTest {
    
    public SupplierTest() {
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
     * Test of getID method, of class Supplier.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Supplier instance = new Supplier();
        instance.setID(0);
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Supplier.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Supplier instance = new Supplier();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Supplier.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Supplier instance = new Supplier();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Supplier.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Supplier instance = new Supplier();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Supplier.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Supplier instance = new Supplier();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Supplier.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Supplier instance = new Supplier();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTele method, of class Supplier.
     */
    @Test
    public void testGetTele() {
        System.out.println("getTele");
        Supplier instance = new Supplier();
        String expResult = "";
        String result = instance.getTele();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTele method, of class Supplier.
     */
    @Test
    public void testSetTele() {
        System.out.println("setTele");
        String tele = "";
        Supplier instance = new Supplier();
        instance.setTele(tele);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
