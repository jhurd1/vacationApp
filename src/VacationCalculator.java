import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class VacationCalculator
{
    Destination d1 = Destination.Mexico;
    Destination d2 = Destination.Europe;
    Destination d3 = Destination.Japan;
    private float totalCost = 0;
    private float addOn = 0;
    HashMap<Destination, Float> vacationMap = new HashMap<Destination, Float>();

    /*******************************
     * TALLYEXPENSES
     * @param vacationMap
     * @return totalCost
     ******************************/
    float tallyExpenses(HashMap<Destination, Float> vacationMap)
    {
        // tallyExpenses iterates across the hashMap
        Iterator vacationIterator = vacationMap.entrySet().iterator();

        // Use the iterator to traverse the hashMap
        while (vacationIterator.hasNext())
        {
            Map.Entry mapElement = (Map.Entry)vacationIterator.next();

            // Hold the values in addOn
            addOn = ((float)mapElement.getValue());
        }

        // return and assign the totalCost to the addOn
        return totalCost += addOn;
    }

    /*******************************
     * CALCULATEVACATIONCOST
     * @param d
     * @return totalCost
     ******************************/
    public float calculateVacationCost(Destination d)
    {
        // totalCost holds a call to tallyExpenses
        totalCost = tallyExpenses(vacationMap);

        // Put the destination and totalCost in the hashMap
        vacationMap.put(d, totalCost);

        // return the totalCost
        return totalCost;
    }

    public static void main (String[] args)
    {
        Destination d1 = Destination.Mexico;
        Destination d2 = Destination.Europe;
        Destination d3 = Destination.Japan;
        Cruise c = new Cruise(d3);
        VacationCalculator vc = new VacationCalculator();
        float japanCost = vc.calculateVacationCost(d3);
        System.out.format("The cost of a vacation to Japan comprises: %f%n", japanCost);
    }
}
