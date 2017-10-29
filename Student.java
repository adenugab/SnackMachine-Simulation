/**
 * Class represents a Student, buys a pack of crisps and informs user 
 * of status of the pack of crisps.
 * 
 * @author (Adenuga Banjoko) 
 * @version 1 (17/11/2016)
 */
public class Student
{
    private static int STUDENT_ID = 0; // static variable storing students initial ID number.
    private String favCrisps; 
    private String idnumber; 
    private SnackMachine snacks; 
    private Pocket pocketFull; 
    private PackOfCrisps myPack; 

    /**
     * Creates a Student with pocket full of money.
     * @param flavour   String type of favourite flavour of crisps.  
     * @param machine   Snack Machine type of favourite flavour of crisps.  
     */
    public Student(String flavour, SnackMachine machine)
    {
        favCrisps = flavour;
        STUDENT_ID++;
        idnumber = "Student No. " + STUDENT_ID;
        snacks = machine;
        myPack = null;
        pocketFull = new Pocket(20);
    }

    /**
     * Student buys a packet of crips if the student has enough money. 
     * Else prints out statement feedback to the user.
     */
    private void buyCrisps()
    {
        if (snacks.countPacks(favCrisps) < 1) //excecuted if the amount of favourite flavour crisps are less than 1
        {
            System.out.println (idnumber + " there are no " + favCrisps + " flavoured crisps left in the machine!");
        }
        else if (pocketFull.pennyCount() < snacks.getCost()) //excecuted if the amount of pennies is less than the cost of crisps
        {
            System.out.println (idnumber + " doesn't have enough money to buy a pack!");
        }
        else if(pocketFull.pennyCount() > snacks.getCost()&& (snacks.countPacks(favCrisps) > 1))
        {
            snacks.insertMoney(pocketFull.removePenny());
            snacks.buyPack(favCrisps);
            myPack = snacks.buyPack(favCrisps);
        }
    }

    /**
     * Student buys a packet of crips if the student has enough money. 
     * Else prints out statement feedback to the user.
     */
    public void snackTime()
    {
        if (myPack == null)
        {
            System.out.println ( idnumber + " is buying a pack of crisps.");
            buyCrisps(); //invokes the buy crisps method.
            myPack = new PackOfCrisps(favCrisps);  //assigns the new pack of crisps to myPack field.     
        }
        else if (myPack != null && myPack.isClosed())
        {
            System.out.println ( idnumber + " is opening the packet.");
            myPack.open(); //invokes the external open() method in Pack of Crisps class.
        }
        else if (myPack != null && myPack.isEmpty())
        {
            myPack = null;
            System.out.println ( idnumber + "  has finished the packet!");
        }
        else if (myPack != null)
        {
            System.out.println ( idnumber + " is eating a favourite " + favCrisps + " flavoured crisp!");
            myPack.eatCrisp(); // invokes the external eatCrisp() method in Pack of Crisps class.
        }
    }
}
