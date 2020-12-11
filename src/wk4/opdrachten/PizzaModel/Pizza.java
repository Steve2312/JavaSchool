package wk4.opdrachten.PizzaModel;

public class Pizza {
    private String naam;
    private double prijs;

    public Pizza(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getNaam() {
        return naam;
    }
}
