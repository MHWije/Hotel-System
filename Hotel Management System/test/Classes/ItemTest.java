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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of getStatus method, of class Item.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Item instance = new Item();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Item.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Item instance = new Item();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemainquant method, of class Item.
     */
    @Test
    public void testGetRemainquant() {
        System.out.println("getRemainquant");
        Item instance = new Item();
        int expResult = 0;
        int result = instance.getRemainquant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRemainquant method, of class Item.
     */
    @Test
    public void testSetRemainquant() {
        System.out.println("setRemainquant");
        int Remainquant = 0;
        Item instance = new Item();
        instance.setRemainquant(Remainquant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Item.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Item instance = new Item();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Item.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Item instance = new Item();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Item instance = new Item();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Item.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Item instance = new Item();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatID method, of class Item.
     */
    @Test
    public void testGetCatID() {
        System.out.println("getCatID");
        Item instance = new Item();
        int expResult = 0;
        int result = instance.getCatID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCatID method, of class Item.
     */
    @Test
    public void testSetCatID() {
        System.out.println("setCatID");
        int catID = 0;
        Item instance = new Item();
        instance.setCatID(catID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupID method, of class Item.
     */
    @Test
    public void testGetSupID() {
        System.out.println("getSupID");
        Item instance = new Item();
        int expResult = 0;
        int result = instance.getSupID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupID method, of class Item.
     */
    @Test
    public void testSetSupID() {
        System.out.println("setSupID");
        int supID = 0;
        Item instance = new Item();
        instance.setSupID(supID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Item.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Item instance = new Item();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Item.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Item instance = new Item();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Item.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Item instance = new Item();
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Item.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 0;
        Item instance = new Item();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Item.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Item instance = new Item();
        float expResult = 0.0F;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Item.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        int total = 0;
        Item instance = new Item();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReStockLvl method, of class Item.
     */
    @Test
    public void testGetReStockLvl() {
        System.out.println("getReStockLvl");
        Item instance = new Item();
        int expResult = 0;
        int result = instance.getReStockLvl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReStockLvl method, of class Item.
     */
    @Test
    public void testSetReStockLvl() {
        System.out.println("setReStockLvl");
        int reStockLvl = 0;
        Item instance = new Item();
        instance.setReStockLvl(reStockLvl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
