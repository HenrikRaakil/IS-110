public class Bear
{
    private static int wallet;
    private static int priceForBear;
    private static int cashback;

    public Bear()
    {
        // initialise instance variables
        wallet = 100000;
        priceForBear = 80000;
    }

    public static void buyingABear()
    {
        if (wallet >= priceForBear)                // Sjekker om kjøperen har råd til bjørnen
        {
            if (wallet > priceForBear)             // Sjekker om kjøperen skal ha penger tilbake på kjøpet
            {
            cashback = wallet - priceForBear;
            System.out.println("You got " + cashback + " in cashback and bought a bear!");
            }
            else {System.out.println("You just bought a bear for the exact asking price of " + priceForBear);}
  
        }
        else
        {
            System.out.println("You have only " + wallet + " you need at least " + priceForBear + "!");
        }
    }
    
    public void callingAMethod()
{
    buyingABear();
}
    
    
}

