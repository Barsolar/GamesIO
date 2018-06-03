/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import subbussinesTier.entities.Client;
import subbussinesTier.entities.Game;
import subbussinesTier.entities.GameTitle;
import subbussinesTier.entities.Reservation;
import testdata.TestData;


public class FactoryTest {
    
    
    public FactoryTest() {
        
    }
    
    static TestData testData;
    
    @BeforeClass
    public static void setUpClass() {
        testData=new TestData();
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
     * Test of getInstance method, of class Factory.
     */
    /*
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Factory expResult = null;
        Factory result = Factory.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of createGameTitle method, of class Factory.
     */
    
    @Test
    public void testCreateGameTitle() {
        System.out.println("createGameTitle");
        Factory instance=new Factory();
        for (int i = 0; i<3; i++){
            GameTitle result = instance.createGameTitle(testData.gameTitleData[i]);
            assertEquals(testData.gameTitle[i], result);
        }
    }
    

    /**
     * Test of createClient method, of class Factory.
     */
    @Test
    public void testCreateClient() {
        System.out.println("createClient");
        Factory instance = new Factory();
        for (int i = 0; i<3; i++){
            Client result = instance.createClient(testData.clientData[i]);
            assertEquals(testData.client[i], result);
        }
      
    }

    /**
     * Test of createReservation method, of class Factory.
     */
    /*
    @Test
    public void testCreateReservation_3args() {
        System.out.println("createReservation");
        Game game = null;
        LocalDate date = null;
        Client client = null;
        Factory instance = new Factory();
        Reservation expResult = null;
        Reservation result = instance.createReservation(game, date, client);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    */
    /**
     * Test of createReservation method, of class Factory.
     */
    /*
    @Test
    public void testCreateReservation_StringArr() {
        System.out.println("createReservation");
        String[] data = null;
        Factory instance = new Factory();
        Reservation expResult = null;
        Reservation result = instance.createReservation(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of createGame method, of class Factory.
     */
    
    @Test
    
    public void testCreateGame() {
        System.out.println("createGame");
        Factory instance = new Factory();
        
         for (int i = 0; i<3; i++){
            Game result =instance.createGame(testData.gameTitle[i]);
            assertEquals(testData.game[i], result);
        }
    }
    
}
