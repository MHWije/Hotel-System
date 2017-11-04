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
 * @author mhWiJe
 */
public class Room_CategoryModelTest {
    
    public Room_CategoryModelTest() {
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
     * Test of getId method, of class Room_CategoryModel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Room_CategoryModel instance = new Room_CategoryModel();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Room_CategoryModel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Room_CategoryModel instance = new Room_CategoryModel();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Room_CategoryModel.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Room_CategoryModel instance = new Room_CategoryModel();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Room_CategoryModel.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Room_CategoryModel instance = new Room_CategoryModel();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPricePerHead method, of class Room_CategoryModel.
     */
    @Test
    public void testGetPricePerHead() {
        System.out.println("getPricePerHead");
        Room_CategoryModel instance = new Room_CategoryModel();
        double expResult = 0.0;
        double result = instance.getPricePerHead();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPricePerHead method, of class Room_CategoryModel.
     */
    @Test
    public void testSetPricePerHead() {
        System.out.println("setPricePerHead");
        double pricePerHead = 0.0;
        Room_CategoryModel instance = new Room_CategoryModel();
        instance.setPricePerHead(pricePerHead);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsActive method, of class Room_CategoryModel.
     */
    @Test
    public void testIsIsActive() {
        System.out.println("isIsActive");
        Room_CategoryModel instance = new Room_CategoryModel();
        boolean expResult = false;
        boolean result = instance.isIsActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsActive method, of class Room_CategoryModel.
     */
    @Test
    public void testSetIsActive() {
        System.out.println("setIsActive");
        boolean isActive = false;
        Room_CategoryModel instance = new Room_CategoryModel();
        instance.setIsActive(isActive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
