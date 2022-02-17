public class Undulat
{
    private int wallet;
    private int priceForUndulat;
    private int cashback;

    public Undulat()
    {
        // initialise instance variables
        wallet = 700;
        priceForUndulat = 1200;
    }

    public void buyingAUndulat()
    {
        if (wallet >= priceForUndulat)                // Sjekker om kjøperen har råd til undulaten
        {
            if (wallet > priceForUndulat)             // Sjekker om kjøperen skal ha penger tilbake på kjøpet
            {
            cashback = wallet - priceForUndulat;
            System.out.println("You got " + cashback + " in cashback and bought a budgie!");
            }
            else {System.out.println("You just bought a budgie for the exact asking price of " + priceForUndulat);}
  
        }
        else
        {
            System.out.println("You have only " + wallet + " you need at least " + priceForUndulat + "!");
        }
    }
}
