import java.util.HashMap;

public class VacationCalculator
{
    HashMap<Destination, Float> vacationMap = new HashMap<Destination, Float>();
    // git  test
    float tallyExpenses(HashMap<Destination, Float> vacationMap)
    {
        this.vacationMap = vacationMap;
        Destination d1 = Destination.Mexico;
        Destination d2 = Destination.Europe;
        Destination d3 = Destination.Japan;
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

    public float calculateVacationCost(Destination d)
    {
        float cost = 0;
        return cost;
    }

    public static void main (String[] args)
    {
        VacationCalculator vc = new VacationCalculator();
        float japanCost = vc.calculateVacationCost(Destination.Japan);
    }
}
