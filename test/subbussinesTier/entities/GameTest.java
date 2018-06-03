/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bartek
 */
public class GameTest {
    
    public GameTest() {
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
     * Test of getNumber method, of class Game.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class Game.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int number = 0;
        Game instance = new Game();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameTitle method, of class Game.
     */
    @Test
    public void testGetGameTitle() {
        System.out.println("getGameTitle");
        Game instance = new Game();
        GameTitle expResult = null;
        GameTitle result = instance.getGameTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameTitle method, of class Game.
     */
    @Test
    public void testSetGameTitle() {
        System.out.println("setGameTitle");
        GameTitle gameTitle = null;
        Game instance = new Game();
        instance.setGameTitle(gameTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservations method, of class Game.
     */
    @Test
    public void testGetReservations() {
        System.out.println("getReservations");
        Game instance = new Game();
        ArrayList<Reservation> expResult = null;
        ArrayList<Reservation> result = instance.getReservations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservations method, of class Game.
     */
    @Test
    public void testSetReservations() {
        System.out.println("setReservations");
        ArrayList<Reservation> reservations = null;
        Game instance = new Game();
        instance.setReservations(reservations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReservation method, of class Game.
     */
    @Test
    public void testAddReservation() {
        System.out.println("addReservation");
        Reservation reservation = null;
        Game instance = new Game();
        instance.addReservation(reservation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Game.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFree method, of class Game.
     */
    @Test
    public void testIsFree() {
        System.out.println("isFree");
        LocalDate date = null;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.isFree(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
