import java.util.Random; 
import java.util.ArrayList;
/**
 * SnackBar class represents a Snack-bar which has a Snack Machine of crisps 
 * and a number of hungry students.
 * 
 * @author (Adenuga Banjoko) 
 * @version 1 (21/11/2016)
 */
public class SnackBar
{
    private Random sbRandom; //uses random class to pick random crisp flavours
    private String [] crispFlavours; 
    private SnackMachine newMachine; 
    private ArrayList<Student> allStudents; 

    /**
     * Creates number of students, crisps and the cost of packets.
     * @param noOfStudents  number of students in SnackBar.
     * @param noOfCrisps  number of PackOfCrisps.
     * @param price  cost of crisps from machine. 
     */
    public SnackBar(int noOfStudents, int noOfCrisps,  int price)
    {
        sbRandom = new Random(); 
        allStudents = new ArrayList<Student>(); 
        newMachine = new SnackMachine(noOfCrisps, price);
        crispFlavours = new String [] {"Cheese", "Prawn", "Ready Salted", "BBQ"}; //string array from 0 to 3

        for(int n = 0; n < noOfCrisps; n++)
        {
            newMachine.addPack(new PackOfCrisps(randomFlavour()));
        }

        for(int i = 0; i < noOfStudents; i++)
        {
            allStudents.add(new Student(randomFlavour(), newMachine)); 
        }
    }

    /**
     * Picks Random crisps flavours. 
     * @return  a flavour of crisps from the string array. 
     */
    private String randomFlavour()
    {
        int r = sbRandom.nextInt(crispFlavours.length);
        return crispFlavours[r];
    }

    /**
     * Prints amount of students & number of crisps in SnackBar . 
     */
    public void describe()
    {
        System.out.println ("The SnackBar has " + allStudents.size() + " hungry students" );
        System.out.println ("The SnackMachine has: ");
        System.out.println (newMachine.countPacks("Cheese") + " packets of Cheese crisps,");
        System.out.println (newMachine.countPacks("Prawn") + " packets of Prawn crisps,");
        System.out.println (newMachine.countPacks("Ready Salted") + " packets of Ready Salted crisps,");
        System.out.println (newMachine.countPacks("BBQ") + " packets of BBQ crisps.");
    }

    /**
     * Loops description of Snack Bar in number of steps.
     * @param nSteps    Amount of times the method is intended to run  
     */
    public void runSnackBar(int nSteps)
    {
        for (int y = 1; y <= nSteps; y++)
        {
            System.out.println ("\nTime step " + y + ":"); //prints time step with a spaced line underneath.
            System.out.println ("----------------\n");
            describe();
            int number = sbRandom.nextInt(allStudents.size()); //picks number between 0 and size of list.
            allStudents.get(number).snackTime();  //invokes snacktime method.
        }
    }   

    /**
     * Main method, this can stand alone does not need BlueJ to run. 
     * Allows whole package execute. 
     * @param String[]args  Command line arguement, stores strings in its arrary.
     */
    public static void main(String[] args) 
    {
        if (args.length >= 0)
        {
            int a = Integer.parseInt(args[0]); //parseInt converts Strings to int.
            int b = Integer.parseInt(args[1]); //args[1] refers to second parameter in command line.
            SnackBar sb = new SnackBar(a,b,10);
            sb.runSnackBar(b);
        }   
    }
}