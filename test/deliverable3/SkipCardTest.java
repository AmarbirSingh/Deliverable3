/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

import SkipCard;
import SkipCard;
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
public class SkipCardTest {
    
    public SkipCardTest() {
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
     * Test of getNSkip method, of class SkipCard.
     */
    @Test
    public void testGetNSkipGood() {
        System.out.println("getNSkip");
        SkipCard instance = null;
        int expResult = 0;
        int result = instance.getNSkip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetNSkipBad() {
        System.out.println("getNSkip");
        SkipCard instance = null;
        int expResult = 0;
        int result = instance.getNSkip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        public void testGetNSkipBoundary() {
        System.out.println("getNSkip");
        SkipCard instance = null;
        int expResult = 0;
        int result = instance.getNSkip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of play method, of class SkipCard.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        UnoGame game = null;
        SkipCard instance = null;
        instance.play(game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
