/**
 * @author Henrik
 * @version 1.0.0
 */
import java.util.Random;                 // Importer package Random som inneholder en klasse som også heter Random.

class RandomEksempel
{
    public RandomEksempel()
    {
    }

   /** @return eksempel på bruk av Random inne i en for-loop */
    void randomNumberGenerator()
    {
        Random rn = new Random();        // Lager et nytt objekt (rn) av klassen Random.
        for (int i = 5; i < 10; i++){
            int answer = rn.nextInt(100); // Lager integer answer. Setter verdi til det samme som rn + (Får en ny integer. Grenseverdi på 20)
            System.out.println(answer);  // Printer ut answer.
        }
    }
    
    /** @param Parametere er en integer...*/
    public void paramexample(int endreMeg){
        System.out.println(endreMeg);
    }
}