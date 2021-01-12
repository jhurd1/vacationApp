import java.util.HashMap;

public interface Expense
{
    default public HashMap<Destination, Integer> getCost()
    {
        HashMap<Destination, Integer> vacationMap = new HashMap<Destination, Integer>();
        return vacationMap;
    }

}

