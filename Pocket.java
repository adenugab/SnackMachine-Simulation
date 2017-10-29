import java.util.HashSet;

/**
 * Holds an amount of Penny objects in the Students pocket.
 * 
 * @author (Adenuga Banjoko) 
 * @version 1 (15/11/2016)
 */
public class Pocket
{
    private HashSet<Penny> myPenny; // Hash Set of Pennies in this Pocket.

    /**
     * Creates a new Pocket, fills it with a set number of Penny objects.
     * @param pocketSize    Creates an amount of pennies in students pocket.
     */
    public Pocket(int pocketSize)
    {
        myPenny = new HashSet<Penny>(pocketSize); //Creates a new HashSet for pennies

        for (int i = 0; i < pocketSize; i++)
        {
            myPenny.add(new Penny()); 
        }

    }

    /**
     * Counts how many pennies are in the pocket.
     * @return  An integer amount of Penny objects in pocket.
     */
    public int pennyCount()
    {
        return myPenny.size();
    }

    /**
     * Removes one penny from pocket until there are no pennies left in pocket. 
     * @return  If at least one Penny objects in the Pocket, return one penny object. 
     *          Else return null. 
     */
    public Penny removePenny()
    {
        if (myPenny.size() >= 1)
        {
            for( Penny aPennies : myPenny ) 
            {
                myPenny.remove(aPennies);
                return aPennies;
            }
        }
        return null;

    }  
}
