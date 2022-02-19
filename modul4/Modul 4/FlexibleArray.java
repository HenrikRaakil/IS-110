import java.util.ArrayList;
import java.util.Iterator;

public class FlexibleArray
{
    private ArrayList<Integer> arrayListInteger;

    public FlexibleArray()
    {
        arrayListInteger = new ArrayList<>();
    }
    
    public void fillArrayList()
    {
        for(int i = 1; i < 10; i++){                // for loop
            arrayListInteger.add(i);
        }
    }
    
    public void viewArrayList()
    {
        for(int number: arrayListInteger){          // for each loop
            System.out.println(number);
        }
    }
    
    public void getIndexValue(int number)
    {
        System.out.println("Index: " + number + " has the value of " + arrayListInteger.get(number));
    }
    
    public void removeIndexValue(int number)
    {
        System.out.println("Removed " + arrayListInteger.get(number));
        arrayListInteger.remove(number);
    }
    
    public void removeMultipleValues(int limit)
    {
        Iterator<Integer> it = arrayListInteger.iterator();
        while(it.hasNext()){                        // While loop
            int i = it.next();
            if (i <= limit){
                it.remove();
            }
        }
    }
    
    public void clearArrayListInteger()
    {
        arrayListInteger.clear();
    }
}
