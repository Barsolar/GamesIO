/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier.entities;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import subbussinesTier.Facade;
import testdata.TestData;

/**
 *
 * @author Win8
 */
public class ClientTest {
    
    public ClientTest() {
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
     * Test of getName method, of class Client.
     */
    /*
    @Test
    public void testGetName() {
        System.out.println("getName");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of setName method, of class Client.
     */
    
    /*
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Client instance = new Client();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of getNumber method, of class Client.
     */
    /*
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of setNumber method, of class Client.
     */
    /*
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int number = 0;
        Client instance = new Client();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of getReservation method, of class Client.
     */
    /*
    @Test
    public void testGetReservation() {
        System.out.println("getReservation");
        Client instance = new Client();
        ArrayList<Reservation> expResult = null;
        ArrayList<Reservation> result = instance.getReservation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of setReservation method, of class Client.
     */
    /*
    @Test
    public void testSetReservation() {
        System.out.println("setReservation");
        ArrayList<Reservation> reservation = null;
        Client instance = new Client();
        instance.setReservation(reservation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of toStringMap method, of class Client.
     */
    /*
    @Test
    public void testToStringMap() {
        System.out.println("toStringMap");
        Client instance = new Client();
        String[] expResult = null;
        String[] result = instance.toStringMap();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of addReservation method, of class Client.
     */
    
    @Test
    public void testAddReservation() {
        System.out.println("addReservation");
        LocalDate date = LocalDate.of(2018, Month.MARCH, 4);
        Game game = testData.game[1];
        Facade.getInstance().addGameTitle(testData.gameTitleData[0]);
        Client instance = new Client("Olek","1");
        instance.addReservation(date, game);
        assertEquals(testData.reservation[1],instance.getReservation().get(0));
    }
    

    /**
     * Test of equals method, of class Client.
     */
    /*
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Client instance = new Client();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of hashCode method, of class Client.
     */
    /*
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
}
