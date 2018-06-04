/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier.entities;

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
public class ClientTest {

    public ClientTest() {
    }

    static TestData data;

    @BeforeClass
    public static void setUpClass() {
        data = new TestData();
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
     * Test of addReservation method, of class Client.
     */
    @Test
    public void testAddReservation() {
        System.out.println("addReservation");
        Client client = data.client[0];
        Game game = data.game[0];
        for (int i = 0; i < 3; i++) {
            client.addReservation(data.dates[i], game);
            assertSame(client.getReservation().get(i), game.getReservations().get(i));
            assertSame(client.getReservation().get(i).getClient(), client);
        }
    }

    /**
     * Test of equals method, of class Client.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < 2; j++) {
                if (j == i) {
                    assertTrue(data.client[j].equals(data.client[i]));
                } else {
                    assertFalse(data.client[j].equals(data.client[i]));
                }
            }
        }
    }

}
