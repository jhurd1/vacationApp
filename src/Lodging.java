import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*******************************
 * CLASS LODGING EXTENDS EXPENSE
 *******************************/
public class Lodging implements Expense
{
    /****************************
     * DATA MEMBERS
     ***************************/
    Destination d;
    private int days = 0;
    private float lodgingCost = 0.0F;
    private float taxSurcharge = 0.0F;
    private float europeTotal = 200.0F;
    private float japanTotal = 300.0F;
    HashMap<Destination, Float> lodging = new HashMap <Destination, Float>();

    public int getDays()
    {
        calculateLodging(d);
        return days;
    }

    /****************************
     * NON-DEFAULT CONSTRUCTOR
     ***************************/
    Lodging (Destination d, int days)
    {
        this.d = d;
        this.days = days;
    }
    /****************************
     * CALCULATELODGINGCOST
     ***************************/
    public float calculateLodging (Destination d)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Number of days: ");
        days = scan.nextInt();
        europeTotal *= .1 + 200.00;
        japanTotal *= .3 + 300.00;
        lodging.put(Destination.Mexico, 100.00F);
        lodging.put(Destination.Europe, europeTotal);
        lodging.put(Destination.Japan, japanTotal);
        Iterator diningIterator = lodging.entrySet().iterator();

        while (diningIterator.hasNext())
        {
            Map.Entry mapElement = (Map.Entry)diningIterator.next();

            // Hold the values in addOn
            lodgingCost = ((float)mapElement.getValue());
        }

        // return and assign the totalCost to the addOn
        return lodgingCost += days;
    }
}
