/**
 * @author Henrik
 * @version 1.0.0
 */
import java.util.HashSet;

public class HashSetEksempel
{
    public HashSetEksempel()
    {
    }

   /** @return eksempel på bruk av HashSet */
    public void hashset()
    {
        HashSet<String> land = new HashSet<String>();
        
        land.add("Norge");
        land.add("Sverige");
        land.add("Danmark");
        
        System.out.println(land);
    }
}