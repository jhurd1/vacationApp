import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*******************************
 * CLASS DINING EXTENDS EXPENSE
 *******************************/
public class Dining implements Expense
{
    /****************************
     * DATA MEMBERS
     ***************************/
    HashMap<Destination, Float> dining = new HashMap <Destination, Float>();
    Destination d;

    public int getNights()
    {
        calculateDining(d);
        return nights;
    }

    private int nights = 0;
    private float diningCost = 0.00F;
    /****************************
     * NON-DEFAULT CONSTRUCTOR
     ***************************/
    Dining (Destination d, int nights)
    {
        this.d = d;
        this.nights = nights;
    }

    /****************************
     * CALCULATEDININGCOST
     ***************************/
    public float calculateDining (Destination d)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Number of nights: ");
        nights = scan.nextInt();

        dining.put(Destination.Mexico, 10.00F);
        dining.put(Destination.Europe, 20.00F);
        dining.put(Destination.Japan, 30.00F);
        Iterator diningIterator = dining.entrySet().iterator();
        while (diningIterator.hasNext())
        {
            Map.Entry mapElement = (Map.Entry)diningIterator.next();

            // Hold the values in addOn
            diningCost = ((float)mapElement.getValue());
        }

        // return and assign the totalCost to the addOn
        return diningCost *= nights;
    }
}
