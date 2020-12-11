package wk4.opdrachten.PizzaModel;

public class Bestelling {
    private String datum;
    private double totaalBedrag;
    private Pizza[] pizza;
    private Vestiging vestiging;
    private Klant klant;

    public Bestelling(Klant klant, Vestiging vestiging, Pizza[] pizza) {
        this.datum = java.util.Calendar.getInstance().getTime().toString();
        this.pizza = pizza;
        this.vestiging = vestiging;
        this.klant = klant;

        String bon_pizza = "";
        // totaalBedrag berekenen
        for (Pizza x : this.pizza) {
            this.totaalBedrag += x.getPrijs();
            // Maak bon
            bon_pizza += String.format("%s \t €%.2f\n", x.getNaam(), x.getPrijs());
        }

        // printBon
        System.out.println(String.format(
                "Pizza Time!\n" +
                "======================================================\n" +
                "Klant: %s,\n" +
                "Afgehandeld door: %s,\n" +
                "Vestiging: %s,\n" +
                "Datum: %s\n" +
                "======================================================\n" +
                "Pizza's: \t Prijs:\n" +
                "%s" +
                "======================================================\n" +
                "Totaalprijs: €%.2f\n" +
                "======================================================\n",
                this.klant.getNaam(), this.vestiging.getMedewerkers()[0].getNaam(), this.vestiging.getPlaatsnaam(), this.datum, bon_pizza, this.totaalBedrag
        ));
    }
}
