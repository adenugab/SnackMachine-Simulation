

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
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
    public void eatPacketOfCrisps()
    {
        SnackMachine snackMac2 = new SnackMachine(1, 1);
        PackOfCrisps packOfCr2 = new PackOfCrisps("BBQ");
        Penny penny2 = new Penny();
        Student student2 = new Student("BBQ", snackMac2);
        student2.snackTime();
        snackMac2.addPack(packOfCr2);
        snackMac2.insertMoney(penny2);
        snackMac2.describe();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
        student2.snackTime();
    }
}

