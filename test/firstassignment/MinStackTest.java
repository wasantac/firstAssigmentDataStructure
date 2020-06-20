/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author walte
 */
public class MinStackTest {
    
    public MinStackTest() {
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
     * Test of push method, of class MinStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        MinStack instance = null;
        boolean expResult = false;
        boolean result = instance.push(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class MinStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        MinStack instance = null;
        boolean expResult = false;
        boolean result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class MinStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MinStack instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class MinStack.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        MinStack instance = null;
        Object expResult = null;
        Object result = instance.getMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStack method, of class MinStack.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        MinStack instance = null;
        LinkedList expResult = null;
        LinkedList result = instance.getStack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MinStack.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MinStack instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
