package wk4.opdrachten.PizzaModel;

public class Vestiging {
    private String plaatsnaam;
    private Medewerker[] medewerkers;

    public Vestiging(String plaatsnaam, Medewerker medewerker) {
        this.plaatsnaam = plaatsnaam;
        this.medewerkers = new Medewerker[]{medewerker};
    }

    public String getPlaatsnaam() {
        return plaatsnaam;
    }

    public Medewerker[] getMedewerkers() {
        return medewerkers;
    }
}
