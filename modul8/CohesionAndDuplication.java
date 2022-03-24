import java.util.*;

public class CohesionAndDuplication
{
    String[] fruit;
    public CohesionAndDuplication()
    {
        fruit = new String[5];
    }

    public void quickMath()
    {
            int x = 10;
            int y = 5;
            
            System.out.println(x + y);
    }
    
    public void duplicatedCode()
    {
            int x = 10;
            int y = 5;
            System.out.println(x + y);
    }
    
    private void addFruitToArray()
    {
        fruit[0] = "Apple";
        fruit[1] = "Banana";
        quickMath();
    }
}
