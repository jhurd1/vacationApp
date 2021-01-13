import java.util.HashMap;

public class Cruise implements Expense
{
    /**************************************
     * PRIVATE MEMBERS
     *************************************/
    private Destination d1 = Destination.Mexico;
    private Destination d2 = Destination.Europe;
    private Destination d3 = Destination.Japan;
    private final Destination d;

    /**************************************
     * CONSTRUCTOR (NON-DEFAULT)
     * @PARAM d
     *************************************/
    Cruise (Destination d)
    {
        this.d = d;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    /**************************************
     * ACCESSOR GETCOST
     * @PARAM d
     *************************************/
    public HashMap<Destination, Float> getCost(Destination d)
    {
        HashMap<Destination, Float> vacationMap = new HashMap <Destination, Float>();
        vacationMap.put(d1, 1000.00F);
        vacationMap.put(d2, 2000.00F);
        vacationMap.put(d3, 3000.00F);

        return vacationMap;
    }
}
