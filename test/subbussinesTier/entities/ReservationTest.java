/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier.entities;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testdata.TestData;

/**
 *
 * @author Win8
 */
public class ReservationTest {

    public ReservationTest() {
    }

    static TestData data;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        data = new TestData();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of interferes method, of class Reservation.
     */
    @Test
    public void testInterferes() {
        System.out.println("interferes");
        LocalDate dateS = data.dates[0];
        Reservation instance = data.reservation[0];
        boolean expResult = true;
        boolean result = instance.interferes(dateS);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Reservation.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = data.reservation[0];
        Reservation instance = data.reservations[0];
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);

    }

}
