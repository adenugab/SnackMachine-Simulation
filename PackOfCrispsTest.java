

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PackOfCrispsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PackOfCrispsTest
{
    /**
     * Default constructor for test class PackOfCrispsTest
     */
    public PackOfCrispsTest()
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
    public void eatingPackOfCrisps()
    {
        PackOfCrisps packOfCr2 = new PackOfCrisps("BBQ");
        assertEquals("BBQ", packOfCr2.getFlavour());
        assertEquals(true, packOfCr2.isClosed());
        assertEquals(false, packOfCr2.isEmpty());
        packOfCr2.open();
        assertEquals(false, packOfCr2.isClosed());
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        packOfCr2.eatCrisp();
        assertEquals(true, packOfCr2.isEmpty());
    }
}

