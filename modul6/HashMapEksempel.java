/**
 * @author Henrik
 * @version 1.0.0
 */
import java.util.HashMap;

public class HashMapEksempel
{
    public HashMapEksempel()
    {
    }

   /** @return eksempel på et HashMap */
    public void hashmap()
    {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        capitalCities.put("Norge", "Oslo");
        capitalCities.put("Sverige", "Stockholm");
        capitalCities.put("Danmark", "København");
        
        System.out.println(capitalCities);
    }
}