package wk3.opdrachten;

import java.util.InputMismatchException;
import java.util.Scanner;

public class garage {
    private int startkapitaal;
    private Auto[] voorraad;
    private Klant[] klantenbestand;

    public static void main(String[] args)
    {
        garage hibiki = new garage(0);
        hibiki.addAutos(hibiki);
        hibiki.addKlanten(hibiki);
        // Start
        while (true)
        {
            int verkocht = 0;
            for (Auto x : hibiki.voorraad)
            {
                if (x == null)
                {
                    verkocht += 1;
                }
            }
            if (verkocht == hibiki.voorraad.length)
            {
                System.out.println("Wij zijn uitverkocht!");
                break;
            }
            System.out.println("==========================================================================");
            hibiki.printKlanten(hibiki.klantenbestand);
            System.out.println("==========================================================================");
            int klant_id = hibiki.invoerID(hibiki.klantenbestand);
            System.out.println("==========================================================================");
            System.out.println(String.format("Welkom %s bij de garage - kies een auto", hibiki.klantenbestand[klant_id].getNaam()));
            Auto[] betaalbare_autos = hibiki.printEnGetBetaalbareAutos(hibiki.voorraad, hibiki.klantenbestand, klant_id);
            if (betaalbare_autos.length > 0)
            {
                Auto gekochte_auto = betaalbare_autos[hibiki.kiesAuto(hibiki.voorraad, betaalbare_autos)];
                hibiki.klantenbestand[klant_id].setAuto(gekochte_auto);
                hibiki.klantenbestand[klant_id].setBedrag(hibiki.klantenbestand[klant_id].getBedrag() - gekochte_auto.getVerkoopprijs());
                System.out.println("==========================================================================");
                System.out.println(String.format("Dank voor de aankoop - Je hebt de %s gekocht.", gekochte_auto.getNaam()));
                hibiki.startkapitaal += gekochte_auto.getVerkoopprijs();
                System.out.println(String.format("De garage heeft nu %s in de kassa", hibiki.startkapitaal));
                System.out.println("==========================================================================");
                System.out.println("\n\n");
            } else
            {
                System.out.println("Je hebt niet genoeg geld voor een auto!");
            }
        }
    }

    public garage(int startkapitaal)
    {
        this.startkapitaal = startkapitaal;
    }

    public void addAutos(garage garage) {
        garage.voorraad = new Auto[5];
        garage.voorraad[0] = new Auto("Rolce Royce", "Zilver", 100000);
        garage.voorraad[1] = new Auto("Batmobiel", "Zwart", 250000);
        garage.voorraad[2] = new Auto("Catmobile", "Zwart", 200000);
        garage.voorraad[3] = new Auto("Kawasaki Ninja (Motor)", "Blauw", 15000);
        garage.voorraad[4] = new Auto("Kawasaki Ninja (Motor)", "Rood", 10000);
    }

    public void addKlanten(garage garage) {
        garage.klantenbestand = new Klant[5];
        garage.klantenbestand[0] = new Klant(1, "Alfred", 100000);
        garage.klantenbestand[1] = new Klant(2, "Bruce", 250000);
        garage.klantenbestand[2] = new Klant(3, "Cat", 200000);
        garage.klantenbestand[3] = new Klant(4, "Grayson", 15000);
        garage.klantenbestand[4] = new Klant(5, "Robin", 10000);
    }

    public void printKlanten(Klant[] klantenbestand) {
        System.out.println("ID\tKlant\tBedrag");
        for (Klant klant : klantenbestand)
        {
            System.out.println(klant.getId() + "\t" + klant.getNaam() + "\t" + klant.getBedrag());
        }
    }

    public int invoerID(Klant[] klantenbestand) {
        System.out.println("Kies de ID bij de klant die bij jou hoort!");
        boolean correct_id = false;
        int id = 0;
        while (!correct_id)
        {
            Scanner scanner = new Scanner(System.in);
            int input;

            try {
                input = scanner.nextInt();
                if (input > 0 && input <= klantenbestand.length)
                {
                    correct_id = true;
                    id = input;
                } else {
                    System.out.println("Het ingevoerde ID bestaat niet in ons systeem.");
                }
            } catch (InputMismatchException err) {
                System.out.println("Het ingevoerde ID bestaat niet in ons systeem.");
            }
        }
        return id - 1;
    }

    public Auto[] printEnGetBetaalbareAutos(Auto[] voorraad, Klant[] klanten, int id)
    {
        System.out.println("Hier een lijst met auto's die je kunt betalen");
        System.out.println("==========================================================================");
        System.out.println("Number\tAuto\tKleur\tBedrag");
        int aantal_betaalbare_autos = 0;
        for (Auto auto : voorraad)
        {
            if (auto != null)
            {
                if (klanten[id].getBedrag() >= auto.getVerkoopprijs())
                {
                    aantal_betaalbare_autos += 1;
                }
            }
        }
        Auto[] betaalbare_autos = new Auto[aantal_betaalbare_autos];
        int betaalbare_autos_index = 0;
        for (Auto auto : voorraad)
        {
            if (auto != null)
            {
                if (klanten[id].getBedrag() >= auto.getVerkoopprijs()) {
                    System.out.println(betaalbare_autos_index + 1 + "\t" + auto.getNaam() + "\t" + auto.getKleur() + "\t" + auto.getVerkoopprijs());
                    betaalbare_autos[betaalbare_autos_index] = auto;
                    betaalbare_autos_index += 1;
                }
            }
        }

        return betaalbare_autos;
    }

    public int kiesAuto(Auto[] alle_autos, Auto[] betaalbare_auto)
    {
        System.out.println("==========================================================================");
        System.out.println("Kies de number die bij de auto hoort!");
        boolean correct_input = false;
        int number = 0;
        while (!correct_input)
        {
            Scanner scanner = new Scanner(System.in);
            int input;

            try {
                input = scanner.nextInt();
                if (input > 0 && input <= betaalbare_auto.length)
                {
                    correct_input = true;
                    number = input;
                } else {
                    System.out.println("Dit nummer bestaat niet in ons systeem");
                }
            } catch (InputMismatchException err) {
                System.out.println("Dit nummer bestaat niet in ons systeem");
            }
        }

        for(int i = 0; i < alle_autos.length; i++)
        {
            if (alle_autos[i] != null)
            {
                if (alle_autos[i].getNaam().equals(betaalbare_auto[number - 1].getNaam()) && alle_autos[i].getKleur().equals(betaalbare_auto[number - 1].getKleur()))
                {
                    alle_autos[i] = null;
                }
            }
        }
        return number - 1;
    }
}
