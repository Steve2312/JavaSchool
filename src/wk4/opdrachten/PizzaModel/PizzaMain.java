package wk4.opdrachten.PizzaModel;

import java.util.Scanner;

public class PizzaMain {
    private final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        PizzaMain pizzaTime = new PizzaMain();
        Menu menu = new Menu();
        Vestiging[] vestigingen = new Vestiging[3];
        vestigingen[0] = new Vestiging("Leiden", new Medewerker("Oscar"));
        vestigingen[1] = new Vestiging("Delft", new Medewerker("Stefan"));
        vestigingen[2] = new Vestiging("Den haag", new Medewerker("Jansen"));

        // Bestelling Maken
        Klant Steve = new Klant("Walter");
        Vestiging bestellingVestiging = pizzaTime.vestigingKiezen(vestigingen);
        Pizza[] bestellingPizza = pizzaTime.bestellingPlaatsen(menu.getMenu());

        Bestelling bestelling_steve = new Bestelling(Steve, bestellingVestiging, bestellingPizza);
    }

    public Vestiging vestigingKiezen(Vestiging[] vestigingen) {
        for (int i = 0; i < vestigingen.length; i++) {
            System.out.println(String.format("[%s]: %s", i+1, vestigingen[i].getPlaatsnaam()));
        }
        System.out.println("Kies een vestiging: ");
        int vestiging_nr = input.nextInt() - 1;
        return vestigingen[vestiging_nr];
    }

    public Pizza[] bestellingPlaatsen(Pizza[] menu) {
        Pizza[] gekozenPizza = new Pizza[0];
        boolean meerPizza = true;
        while (meerPizza) {
            for (int i = 0; i < menu.length; i++) {
                System.out.println(String.format("[%s]: %s (€%.2f)", i + 1, menu[i].getNaam(), menu[i].getPrijs()));
            }
            System.out.println("Kies een pizza: ");
            int pizza_nr = input.nextInt() - 1;

            // Toevoegen pizza aan array
            int nieweArrayLengte = gekozenPizza.length;
            Pizza[] copyPizza = new Pizza[nieweArrayLengte + 1];
            for (int x = 0; x < gekozenPizza.length; x++) {
                copyPizza[x] = gekozenPizza[x];
            }
            copyPizza[nieweArrayLengte] = menu[pizza_nr];
            gekozenPizza = copyPizza;

            System.out.println("Wilt u nog een pizza bestellen? [Type 'ja' om nog een pizza toe te voegen of 'nee']");
            if (!input.next().equals("ja")) {
                meerPizza = false;
            }
        }
        return gekozenPizza;
    }
}
