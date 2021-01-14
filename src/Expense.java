import java.util.HashMap;

/****************************
 * INTERFACE EXPENSE
 ***************************/
public interface Expense
{
    /****************************
     * GETCOST
     * RETURNS VACATIONMAP
     ***************************/
    default public HashMap <Destination, Float> getCost()
    {
        HashMap<Destination, Float> vacationMap = new HashMap <Destination, Float>();
        return vacationMap;
    }

}

