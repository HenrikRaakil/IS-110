public class Main                           // klasse Main
{
    private Second objectOfSecond;          // Henter data fra Second for å kunne lage et objekt fra den klassen
    private Third objectOfThird;            // Henter data fra Third for å kunne lage et objekt fra den klassen
    
    public Main(){                          // Konstruktør til klassen Main
        objectOfSecond = new Second();          // Lager et objekt fra klassen Second
        objectOfThird = new Third();            // Lager et objekt fra klassen Third
    }
    
    public void printMain(){                // Metode som tilhører et objekt fra klassen Main
        System.out.println("Heisann");
    }
    
    public void callPrintMain(){            // Kaller printMain metoden
        printMain();
    }
    
    public void callMethodIntAndStringFromSecond(){ // Kaller en metode som tilhører et objekt fra klassen Second
        objectOfSecond.intAndStringFromSecond();        // Et objekt fra klassen Second som peker til en metode den eier
    }
    
    public void callStaticMethodFromSecond(){       // kaller en metode som direkte tilhører klassen Second (Static)
        Second.staticMethodSecond();                    // Klasse Second som peker på en metode den eier
    }
    
    public void callMathThird(){                    // Kaller eb netide sin tukhører et objekt fra klassen Third
        objectOfThird.mathThird();                      // Et objekt fra klassen Third som peker til en metode den eier
    }
}
