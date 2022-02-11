public class Hund
{
    private int wallet;
    private int priceForHund;
    private int cashback;

    public Hund()
    {
        // initialise instance variables
        wallet = 700;
        priceForHund = 5000;
    }

    public void priceForhund()
    {
        if (wallet >= priceForHund)                // Sjekker om kjøperen har råd til hunden
        {
            if (wallet > priceForHund)             // Sjekker om kjøperen skal ha penger tilbake på kjøpet
            {
            cashback = wallet - priceForHund;
            System.out.println("You got " + cashback + " in cashback and bought a dog!");
            }
            else {System.out.println("You just bought a dog for the exact asking price of " + priceForHund);}
  
        }
        else
        {
            System.out.println("You have only " + wallet + " you need at least " + priceForHund + "!");
        }
    }
}