/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

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
public class SimplyLinkedListTest {
    
    public SimplyLinkedListTest() {
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
     * Test of addFirst method, of class SimplyLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object element = null;
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.addFirst(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class SimplyLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object element = null;
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.addLast(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class SimplyLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class SimplyLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class SimplyLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SimplyLinkedList instance = new SimplyLinkedList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class SimplyLinkedList.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        SimplyLinkedList instance = new SimplyLinkedList();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class SimplyLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SimplyLinkedList instance = new SimplyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class SimplyLinkedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = null;
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class SimplyLinkedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Object element = null;
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.set(index, element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class SimplyLinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        SimplyLinkedList instance = new SimplyLinkedList();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SimplyLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class SimplyLinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int index = 0;
        Object element = null;
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.insert(index, element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SimplyLinkedList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SimplyLinkedList instance = new SimplyLinkedList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class SimplyLinkedList.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class SimplyLinkedList.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        Object element = null;
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.swap(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMin method, of class SimplyLinkedList.
     */
    @Test
    public void testDeleteMin() {
        System.out.println("deleteMin");
        SimplyLinkedList instance = new SimplyLinkedList();
        boolean expResult = false;
        boolean result = instance.deleteMin(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
