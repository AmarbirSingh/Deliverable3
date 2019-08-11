/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;
import javax.smartcardio.Card;
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
public class CardTest {
    
    public CardTest() {
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
     * Test of getColour method, of class Card.
     */
    @Test
    public void testGetColourGood() {
        System.out.println("getColour");
        Card instance = null;
        int expResult = 0;
        int result = instance.getColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setColour method, of class Card.
     */
    @Test
    public void testSetColour() {
        System.out.println("setColour");
        int colour = 0;
        Card instance = null;
        instance.setColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetColourBad() {
        System.out.println("getColour");
        Card instance = null;
        int expResult = 0;
        int result = instance.getColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getSymbol method, of class Card.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Card instance = null;
        String expResult = "";
        String result = instance.getSymbol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetColourBoundary() {
        System.out.println("getColour");
        Card instance = null;
        int expResult = 0;
        int result = instance.getColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of canPlayOn method, of class Card.
     */
    @Test
    public void testCanPlayOn() {
        System.out.println("canPlayOn");
        Card card = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.canPlayOn(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Card.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        UnoGame game = null;
        Card instance = null;
        instance.play(game);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
