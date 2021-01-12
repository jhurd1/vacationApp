import java.util.HashMap;

public class Cruise implements Expense
{
    Destination d1 = Destination.Mexico;
    Destination d2 = Destination.Europe;
    Destination d3 = Destination.Japan;

    private final Destination d;

    Cruise (Destination d)
    {
        this.d = d;
    }

    public HashMap<Destination, Float> getCost(Destination d)
    {
        HashMap<Destination, Float> vacationMap = new HashMap<Destination, Float>();
        vacationMap.put(d1, 1000.00F);
        vacationMap.put(d2, 2000.00F);
        vacationMap.put(d3, 3000.00F);

        return vacationMap;
    }
}
