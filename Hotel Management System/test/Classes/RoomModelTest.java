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
public class RoomModelTest {
    
    public RoomModelTest() {
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
     * Test of getId method, of class RoomModel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        RoomModel instance = new RoomModel();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class RoomModel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        RoomModel instance = new RoomModel();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class RoomModel.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        RoomModel instance = new RoomModel();
        int expResult = 0;
        int result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class RoomModel.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        int category = 0;
        RoomModel instance = new RoomModel();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoOfBeds method, of class RoomModel.
     */
    @Test
    public void testGetNoOfBeds() {
        System.out.println("getNoOfBeds");
        RoomModel instance = new RoomModel();
        int expResult = 0;
        int result = instance.getNoOfBeds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoOfBeds method, of class RoomModel.
     */
    @Test
    public void testSetNoOfBeds() {
        System.out.println("setNoOfBeds");
        int NoOfBeds = 0;
        RoomModel instance = new RoomModel();
        instance.setNoOfBeds(NoOfBeds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class RoomModel.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        RoomModel instance = new RoomModel();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class RoomModel.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        RoomModel instance = new RoomModel();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class RoomModel.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        RoomModel instance = new RoomModel();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class RoomModel.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        RoomModel instance = new RoomModel();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsActive method, of class RoomModel.
     */
    @Test
    public void testIsIsActive() {
        System.out.println("isIsActive");
        RoomModel instance = new RoomModel();
        boolean expResult = false;
        boolean result = instance.isIsActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsActive method, of class RoomModel.
     */
    @Test
    public void testSetIsActive() {
        System.out.println("setIsActive");
        boolean isActive = false;
        RoomModel instance = new RoomModel();
        instance.setIsActive(isActive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsAvailable method, of class RoomModel.
     */
    @Test
    public void testIsIsAvailable() {
        System.out.println("isIsAvailable");
        RoomModel instance = new RoomModel();
        boolean expResult = false;
        boolean result = instance.isIsAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAvailable method, of class RoomModel.
     */
    @Test
    public void testSetIsAvailable() {
        System.out.println("setIsAvailable");
        boolean isAvailable = false;
        RoomModel instance = new RoomModel();
        instance.setIsAvailable(isAvailable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
