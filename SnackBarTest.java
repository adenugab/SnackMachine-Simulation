

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SnackBarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SnackBarTest
{
    /**
     * Default constructor for test class SnackBarTest
     */
    public SnackBarTest()
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
    public void statusofsnackbar()
    {
        SnackBar snackBar1 = new SnackBar(1, 2, 3);
        snackBar1.describe();
        snackBar1.runSnackBar(10);
    }
}

