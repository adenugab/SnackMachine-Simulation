
/**
 * The PackOfCrisps class. Represents a pack of crisps object which can be opened and eaten from.
 * 
 * @author (Adenuga Banjoko) 
 * @version 1 (15/11/2016)
 */
public class PackOfCrisps
{
    private boolean isOpen;
    private int numOfCrisps;
    private String flavour;

    /**
     * Creates flavours of crisps and initalizes amount of crisps in a packet.
     * @param flavourOfCrisps   String type of flavours of crisps e.g. "Ready Salted"
     */
    public PackOfCrisps(String flavourOfCrisps)
    {
        flavour = flavourOfCrisps;
        numOfCrisps = 10;
        isOpen = false;
    }

    /**
     * Booloean method checks if the Packet of Crisps empty.
     * @return True if empty, False if not empty.
     */
    public boolean isEmpty()
    {
        // put your code here
        return numOfCrisps == 0;
    }

    /**
     * Boolean method checks if the Packet of Crisps is closed?
     * @return True if empty, False if not empty.
     */
    public boolean isClosed()
    {
        return !isOpen;
    }

    /**
     * This opens your packet of Crisps object. 
     */
    public void open()
    {
        isOpen = true;
    }

    /**
     * Checks what the flavour of your packet of crisps is.
     * @return flavour of chosen packet of crisps.
     */
    public String getFlavour()
    {
        return flavour;
    }

    /**
     * If packet is open, eats a single crisp one at a time until there are no more crisps. 
     */
    public void eatCrisp()
    {
        if (isClosed() == true) 
        {
            System.out.println ("Need to open the packet first!");
        }
        else if (isEmpty())
        {
            System.out.println ("The packet is empty!");
        }
        else 
        {
            numOfCrisps -= 1;
        }
    }
}
