/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

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
public class ReverseCardTest {
    
    public ReverseCardTest() {
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
     * Test of canPlayOn method, of class ReverseCard.
     */
    @Test
    public void testCanPlayOn() {
        System.out.println("canPlayOn");
        Card card = null;
        ReverseCard instance = null;
        boolean expResult = false;
        boolean result = instance.canPlayOn(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class ReverseCard.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        UnoGame game = null;
        ReverseCard instance = null;
        instance.play(game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
