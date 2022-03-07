import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

public class Eksempel
{
    public Eksempel()
    {
    }

    public static void hashSetEksempel()
    {
        HashSet<String> farger = new HashSet<String>();
        
        // add
        farger.add("Rød");
        farger.add("Blå");
        farger.add("Grønn");
        System.out.println(farger);
        
        // contains
        farger.contains("Blå");
        
        // remove
        farger.remove("Blå");
        System.out.println(farger);
    }
    
    public static void hashMapEksempel()
    {
        HashMap<String, Integer> land = new HashMap<String, Integer>();
        
        // put
        land.put("Norge", 1);
        land.put("England", 2);
        land.put("Italia", 3);
        System.out.println(land);
        
        // get
        System.out.println(land.get("Norge"));
        
        // remove
        land.remove("England");
        System.out.println(land);
        
        System.out.println(land.size());
        
        // clear
        land.clear();
        System.out.println(land);

    }
    
    public static void randomEksempel()
    {
        Random randomValue = new Random();
        for (int i = 1; i <= 10; i++)
        {
            int value = randomValue.nextInt(20);
            System.out.println(value);
        } 
    }
}
