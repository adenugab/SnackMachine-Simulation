

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SnackMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SnackMachineTest
{
    /**
     * Default constructor for test class SnackMachineTest
     */
    public SnackMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void buyPackOfCrisps()
    {
        SnackMachine snackMac1 = new SnackMachine(1, 1);
        PackOfCrisps packOfCr1 = new PackOfCrisps("BBQ");
        Penny penny1 = new Penny();
        snackMac1.describe();
        assertEquals(1, snackMac1.getCost());
        snackMac1.insertMoney(penny1);
        snackMac1.addPack(packOfCr1);
        snackMac1.describe();
        assertEquals(false, snackMac1.isEmpty());
        assertEquals(1, snackMac1.countPacks("BBQ"));
        assertNotNull(snackMac1.buyPack("BBQ"));
        snackMac1.describe();
        assertEquals(true, snackMac1.isEmpty());
        assertNull(snackMac1.buyPack("BBQ"));
    }
}

