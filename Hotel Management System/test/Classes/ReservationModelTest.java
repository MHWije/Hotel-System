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
public class ReservationModelTest {
    
    public ReservationModelTest() {
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
     * Test of getId method, of class ReservationModel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ReservationModel instance = new ReservationModel();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ReservationModel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        ReservationModel instance = new ReservationModel();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGuestID method, of class ReservationModel.
     */
    @Test
    public void testGetGuestID() {
        System.out.println("getGuestID");
        ReservationModel instance = new ReservationModel();
        int expResult = 0;
        int result = instance.getGuestID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGuestID method, of class ReservationModel.
     */
    @Test
    public void testSetGuestID() {
        System.out.println("setGuestID");
        int guestID = 0;
        ReservationModel instance = new ReservationModel();
        instance.setGuestID(guestID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomID method, of class ReservationModel.
     */
    @Test
    public void testGetRoomID() {
        System.out.println("getRoomID");
        ReservationModel instance = new ReservationModel();
        int expResult = 0;
        int result = instance.getRoomID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomID method, of class ReservationModel.
     */
    @Test
    public void testSetRoomID() {
        System.out.println("setRoomID");
        int roomID = 0;
        ReservationModel instance = new ReservationModel();
        instance.setRoomID(roomID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeadCount method, of class ReservationModel.
     */
    @Test
    public void testGetHeadCount() {
        System.out.println("getHeadCount");
        ReservationModel instance = new ReservationModel();
        int expResult = 0;
        int result = instance.getHeadCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeadCount method, of class ReservationModel.
     */
    @Test
    public void testSetHeadCount() {
        System.out.println("setHeadCount");
        int headCount = 0;
        ReservationModel instance = new ReservationModel();
        instance.setHeadCount(headCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheckIN method, of class ReservationModel.
     */
    @Test
    public void testGetCheckIN() {
        System.out.println("getCheckIN");
        ReservationModel instance = new ReservationModel();
        String expResult = "";
        String result = instance.getCheckIN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCheckIN method, of class ReservationModel.
     */
    @Test
    public void testSetCheckIN() {
        System.out.println("setCheckIN");
        String checkIN = "";
        ReservationModel instance = new ReservationModel();
        instance.setCheckIN(checkIN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheckOut method, of class ReservationModel.
     */
    @Test
    public void testGetCheckOut() {
        System.out.println("getCheckOut");
        ReservationModel instance = new ReservationModel();
        String expResult = "";
        String result = instance.getCheckOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCheckOut method, of class ReservationModel.
     */
    @Test
    public void testSetCheckOut() {
        System.out.println("setCheckOut");
        String checkOut = "";
        ReservationModel instance = new ReservationModel();
        instance.setCheckOut(checkOut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCost method, of class ReservationModel.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        ReservationModel instance = new ReservationModel();
        double expResult = 0.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCost method, of class ReservationModel.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 0.0;
        ReservationModel instance = new ReservationModel();
        instance.setCost(cost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
