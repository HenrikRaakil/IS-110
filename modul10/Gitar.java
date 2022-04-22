class Gitar extends Strengeinstrument {
    
    public Gitar()
    {
        antallStrenger = 6;
        instrumentType = "gitar";
        lagerLyd = true;
    }
    
    public void visDetaljer()
    {
        System.out.println("En " + instrumentType + " har " + antallStrenger + " strenger");
        System.out.println("Gjennomsnittsvekt på instrumentet er " + gjennomsnittsvekt);
    }
}
