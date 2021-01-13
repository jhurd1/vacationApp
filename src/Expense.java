import java.util.HashMap;

public interface Expense
{
    default public HashMap <Destination, Float> getCost()
    {
        HashMap<Destination, Float> vacationMap = new HashMap <Destination, Float>();
        return vacationMap;
    }

}

