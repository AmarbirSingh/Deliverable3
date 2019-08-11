/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

import Player;
import Player;
import UnoGame;
import UnoGame;
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
public class UnoGameTest {
    
    public UnoGameTest() {
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
     * Test of getDeck method, of class UnoGame.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        UnoGame instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPile method, of class UnoGame.
     */
    @Test
    public void testGetPile() {
        System.out.println("getPile");
        UnoGame instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getPile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class UnoGame.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        UnoGame instance = null;
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class UnoGame.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        UnoGame instance = null;
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayer method, of class UnoGame.
     */
    @Test
    public void testGetCurrentPlayer() {
        System.out.println("getCurrentPlayer");
        UnoGame instance = null;
        Player expResult = null;
        Player result = instance.getCurrentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextPlayer method, of class UnoGame.
     */
    @Test
    public void testGetNextPlayerGood() {
        System.out.println("getNextPlayer");
        int skip = 0;
        UnoGame instance = null;
        Player expResult = null;
        Player result = instance.getNextPlayer(skip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
  @Test
    public void testGetNextPlayerBad() {
        System.out.println("getNextPlayer");
        int skip = 0;
        UnoGame instance = null;
        Player expResult = null;
        Player result = instance.getNextPlayer(skip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testGetNextPlayerBoundary() {
        System.out.println("getNextPlayer");
        int skip = 0;
        UnoGame instance = null;
        Player expResult = null;
        Player result = instance.getNextPlayer(skip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getPlayDirection method, of class UnoGame.
     */
    @Test
    public void testGetPlayDirection() {
        System.out.println("getPlayDirection");
        UnoGame instance = null;
        int expResult = 0;
        int result = instance.getPlayDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayDirection method, of class UnoGame.
     */
    @Test
    public void testSetPlayDirection() {
        System.out.println("setPlayDirection");
        int dir = 0;
        UnoGame instance = null;
        instance.setPlayDirection(dir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of goToNextPlayer method, of class UnoGame.
     */
    @Test
    public void testGoToNextPlayer() {
        System.out.println("goToNextPlayer");
        UnoGame instance = null;
        instance.goToNextPlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class UnoGame.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Player player = null;
        int nCards = 0;
        UnoGame instance = null;
        instance.draw(player, nCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealCards method, of class UnoGame.
     */
    @Test
    public void testDealCards() {
        System.out.println("dealCards");
        UnoGame instance = null;
        instance.dealCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playTurn method, of class UnoGame.
     */
    @Test
    public void testPlayTurn() {
        System.out.println("playTurn");
        UnoGame instance = null;
        Player expResult = null;
        Player result = instance.playTurn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class UnoGame.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        UnoGame instance = null;
        Player expResult = null;
        Player result = instance.play();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
