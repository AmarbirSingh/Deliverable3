/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

import Card;
import Card;
import Player;
import Player;
import java.util.ArrayList;
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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class Player.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Player instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearCards method, of class Player.
     */
    @Test
    public void testClearCards() {
        System.out.println("clearCards");
        Player instance = null;
        instance.clearCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gainCard method, of class Player.
     */
    @Test
    public void testGainCard() {
        System.out.println("gainCard");
        Card card = null;
        Player instance = null;
        instance.gainCard(card);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of playCard method, of class Player.
     */
    @Test
    public void testPlayCardGood() {
        System.out.println("playCard");
        Card pileCard = null;
        Player instance = null;
        Card expResult = null;
        Card result = instance.playCard(pileCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       @Test
    public void testPlayCardBad() {
        System.out.println("playCard");
        Card pileCard = null;
        Player instance = null;
        Card expResult = null;
        Card result = instance.playCard(pileCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
       @Test
    public void testPlayCardBoundary() {
        System.out.println("playCard");
        Card pileCard = null;
        Player instance = null;
        Card expResult = null;
        Card result = instance.playCard(pileCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
