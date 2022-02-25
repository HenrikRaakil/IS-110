public class FixedArray
{
   private String[] arrayFood;
   private float[] arrayFloat;
    public FixedArray()
    {
        arrayFood = new String[6];
        arrayFloat = new float[] {0.1f, 0.2f, 0.3f};
        arrayFood[0] = "Apple"; arrayFood[1] = "Banana";
        arrayFood[2] = "Mango"; arrayFood[3] = "Potato";
        arrayFood[4] = "Carrot"; arrayFood[5] = "Pear"; 
    }

    public void printFixedArray()
    {
        System.out.println(arrayFood[0]); System.out.println(arrayFood[1]);
        System.out.println(arrayFood[2]); System.out.println(arrayFood[3]);
        System.out.println(arrayFloat[0]);
    }
    
    public void conditionalOperator(int b)
    {
        int a = 10;
        if (a == b) {
            System.out.println("Dette er noe av maten som er i arrayen " + arrayFood[0]);
        }
        else {
            System.out.println(a + " og " + b + " Har ikke samme verdi");
        }
    }
    
    public void ternaryOperator()
    {
        int var1 = 1; int var2 = 1;
        System.out.println(var1 == var2 ? "yes" : "no");
    }
    
    public void forLoop()
    {
        for(int i = 0; i <= 6; i++){
            System.out.println(arrayFood[i]);
        }
    }
    
    /*
    public void countArray(int limit)
    {
        while(arrayFood.length < limit){
            System.out.println(arrayFood[0]);
        }
    } */
}
