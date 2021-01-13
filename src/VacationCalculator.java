import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class VacationCalculator
{
    Destination d1 = Destination.Mexico;
    Destination d2 = Destination.Europe;
    Destination d3 = Destination.Japan;
    float totalCost = 0;
    float addOn = 0;
    HashMap<Destination, Float> vacationMap = new HashMap<Destination, Float>();

    /*******************************
     * TALLYEXPENSES
     * @param vacationMap
     * @return totalCost
     ******************************/
    float tallyExpenses(HashMap<Destination, Float> vacationMap)
    {
        Iterator vacationIterator = vacationMap.entrySet().iterator();
        while (vacationIterator.hasNext())
        {
            Map.Entry mapElement = (Map.Entry)vacationIterator.next();
            addOn = ((float)mapElement.getValue());
        }
        return totalCost += addOn;
    }

    public float calculateVacationCost(Destination d)
    {
        Cruise c = new Cruise(d);
        if()
        {

        }

        this.vacationMap = vacationMap;

        if (vacationMap.equals(d1))
        {
            return vacationMap.get(d1);
        } else if (vacationMap.equals(d2))
        {
            return vacationMap.get(d2);
        } else
        {
            return vacationMap.get(d3);
        }
    }

    public static void main (String[] args)
    {
        Destination d1 = Destination.Mexico;
        Destination d2 = Destination.Europe;
        Destination d3 = Destination.Japan;
        VacationCalculator vc = new VacationCalculator();
        float japanCost = vc.calculateVacationCost(Destination.Japan);
        System.out.format("The cost of a vacation to Japan comprises: %f%n", japanCost);
    }
}
