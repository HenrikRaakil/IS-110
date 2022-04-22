class Strengeinstrument extends Instrument {
    protected int antallStrenger;
    protected String instrumentType;

public Strengeinstrument()
    {
        lagerLyd = true;
        gjennomsnittsvekt = 12;
    }
    
public void visDetaljer()
    {
        System.out.println("En " + instrumentType + " har " + antallStrenger + " strenger");
        System.out.println("Gjennomsnittsvekt på instrumentet er " + gjennomsnittsvekt);
    }
}