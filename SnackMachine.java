import java.util.ArrayList;

/**
 * This is the SnackMachine class. Represents a snack machine tempoarily storing all packets of crips and money inserted. 
 * @author (Adenuga Banjoko) 
 * @version 1 (15/11/2016)
 */
public class SnackMachine
{
    private ArrayList<PackOfCrisps> allCrisps; // Array List storing all crips packets in the Snack Machine.
    private int capacity; 
    private int cost; 
    private int payment;
    private ArrayList<Penny> allPennies; // Array List storing money in the Snack Machine.

    /**
     * Creates money and crips to be stored in the SnackMachine. 
     * @param maxPackets    Number of maximum packets machine can contain.
     * @param costOfPackets Cost of a packet of crisps.
     */
    public SnackMachine(int maxPackets, int costOfPackets)
    {
        cost = costOfPackets;
        capacity = maxPackets;
        payment = 0;
        allPennies = new ArrayList<Penny>();
        allCrisps = new ArrayList<PackOfCrisps>();
    }

    /**
     * Checks the cost of the packet of crisps. 
     * @return Cost of packet of crisps.
     */
    public int getCost()
    {
        return cost;
    }

    /**
     * Adds a Packet of Crisps to the machine if it is not already small.
     * @param pack  PackOfCrisps type for a pack of crisps. 
     */
    public void addPack(PackOfCrisps pack)
    {
        if (allCrisps.size() < capacity )
        {
            allCrisps.add(pack);
        }
        else
        {
            System.out.println ("The machine is full to capacity!");
        }
    }

    /**
     * This will count all Packets of Crisps of the specified flavour in the machine.
     * @param flavour   String type of specfied flavour of crisps. 
     * @return An integer of the number of packet of crisps of the specified flavour.
     */
    public int countPacks(String flavour)
    {
        int numOfPacks = 0;
        for( PackOfCrisps aPacket : allCrisps ) 
        {
            if (aPacket.getFlavour().equals(flavour)) 
            {
                numOfPacks++;
            }
        }
        return numOfPacks;
    }

    /**
     * This inserts one penny object to the Snack machine.
     * @param penny Inherits from Penny class  
     */
    public void insertMoney(Penny penny)
    {
        if (penny == null) 
        {
            System.out.println("You must put a proper coin in the machine!");
        }
        else
        {
            payment++;
            allPennies.add(penny);
        }
    }

    /**
     * Boolean return type method, checks if the Snack Machine has any packets of crisps left 
     * @return True if no packets left and false otherwise. 
     */ 
    public boolean isEmpty()
    {
        return allCrisps.size() == 0;
    }

    /**
     * This buys a Packet of Crisps from the machine if enough penny onjects have been inserted 
     * @param flavour   String type of specified flavour of crisps. 
     * @return the bought packet if enough money inserted, if not returns null
     */ 
    public PackOfCrisps buyPack(String flavour)
    {
        PackOfCrisps bought = null;
        if (payment < cost) { // should check that there is sufficient payment!
            System.out.println("You need to insert more coins!");
        } else {
            int i = 0;
            boolean found = false;
            while( i < allCrisps.size() && !found ) {
                if (allCrisps.get(i).getFlavour().equals(flavour)) {
                    found = true;
                } 
                i++;
            }
            if ( found ) {
                // pack found: set payment to zero and remove from machine
                payment = 0;
                bought = allCrisps.remove(i-1);
            }
        }
        return bought;
    }

    /**
     * This prints the description of the Snack Machine at any time between buying crisps packets.
     */
    public void describe()
    {
        System.out.println ("The snack machine has " + allCrisps.size() + " packets of crisps left and has taken " + payment + " in payment");
    }
}
