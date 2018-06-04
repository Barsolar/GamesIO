/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbussinesTier.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import testdata.TestData;

/**
 *
 * @author Win8
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Category({TestEntity.class})
@RunWith(Parameterized.class)
public class GameTest {

    public GameTest() {
    }

    static TestData data;
    static Game game;

    @BeforeClass
    public static void setUpClass() {
        data = new TestData();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Parameterized.Parameter
    public int number1;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data1 = new Object[][]{{0}, {1}};
        return Arrays.asList(data1);
    }

    @Before
    public void setUp() {
        game = data.game[number1];
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addReservation method, of class Game.
     */
    @Test
    public void testAddReservation() {
        System.out.println("addReservation");
        int i = 0;
        for (Reservation r : data.reservation) {
            game.addReservation(r);
            assertSame(r, game.getReservations().get(i));
            i++;
        }

    }

    /**
     * Test of equals method, of class Game.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        for (int i = number1; i < 2; i++) {
            if (number1 == i) {
                assertTrue(data.game[number1].equals(data.game[i]));
            } else {
                assertFalse(data.game[number1].equals(data.game[i]));
            }
        }
    }

    /**
     * Test of isFree method, of class Game.
     */
    @Test
    public void testIsFree() {
        System.out.println("isFree");

        
        boolean result;
        result = game.isFree(data.dates[0]);
        assertFalse(result);
        result = game.isFree(data.dates[1]);
        assertFalse(result);
        

    }

}
