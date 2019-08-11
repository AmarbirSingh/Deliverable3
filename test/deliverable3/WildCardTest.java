/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

import Card;
import Card;
import WildCard;
import WildCard;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amarbir
 */
public class WildCardTest {
    
    public WildCardTest() {
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
     * Test of canPlayOn method, of class WildCard.
     */
    @Test
    public void testCanPlayOnGood() {
        System.out.println("canPlayOn");
        Card card = null;
        WildCard instance = new WildCard();
        boolean expResult = false;
        boolean result = instance.canPlayOn(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCanPlayOnBad() {
        System.out.println("canPlayOn");
        Card card = null;
        WildCard instance = new WildCard();
        boolean expResult = false;
        boolean result = instance.canPlayOn(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCanPlayOnBoundary() {
        System.out.println("canPlayOn");
        Card card = null;
        WildCard instance = new WildCard();
        boolean expResult = false;
        boolean result = instance.canPlayOn(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
