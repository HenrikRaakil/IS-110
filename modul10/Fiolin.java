class Fiolin extends Strengeinstrument {
    
    public Fiolin()
    {
        antallStrenger = 4;
        instrumentType = "fiolin";
    }

    public void spillMusikk() {
        System.out.println("Denne har jeg arvet fra isntrumentklassen!");
        System.out.println("*Fiolinlyder*");
        visDetaljer();
    }

}