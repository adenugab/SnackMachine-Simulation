

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PocketTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PocketTest
{
    /**
     * Default constructor for test class PocketTest
     */
    public PocketTest()
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
    public void pocketOfPennies()
    {
        Pocket pocket1 = new Pocket(3);
        assertEquals(3, pocket1.pennyCount());
        assertNotNull(pocket1.removePenny());
        assertNotNull(pocket1.removePenny());
        assertNotNull(pocket1.removePenny());
        assertNull(pocket1.removePenny());
        assertEquals(0, pocket1.pennyCount());
    }
}

