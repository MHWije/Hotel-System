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
public class ItemCategoryTest {
    
    public ItemCategoryTest() {
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
     * Test of getCatID method, of class ItemCategory.
     */
    @Test
    public void testGetCatID() {
        System.out.println("getCatID");
        ItemCategory instance = new ItemCategory();
        int expResult = 0;
        int result = instance.getCatID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCatID method, of class ItemCategory.
     */
    @Test
    public void testSetCatID() {
        System.out.println("setCatID");
        int CatID = 0;
        ItemCategory instance = new ItemCategory();
        instance.setCatID(CatID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class ItemCategory.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ItemCategory instance = new ItemCategory();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class ItemCategory.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ItemCategory instance = new ItemCategory();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class ItemCategory.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        ItemCategory instance = new ItemCategory();
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class ItemCategory.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        ItemCategory instance = new ItemCategory();
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
