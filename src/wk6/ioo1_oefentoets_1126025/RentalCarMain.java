package wk6.ioo1_oefentoets_1126025;

import java.util.Date;

public class RentalCarMain {
    private static int aantalAutosVerhuurd;
    public static void main(String[] args) {
        Klant[] klanten = new Klant[2];
        klanten[0] = new Klant("Els");
        klanten[1] = new Klant("Ruud");

        Verhuurorganisatie hertz = new Verhuurorganisatie("Hertz");
        Verhuurorganisatie suncars = new Verhuurorganisatie("SunCars");

        Auto ford = new Auto("Ford", "Malaga", 21.99, hertz);
        Auto toyota = new Auto("Toyota", "Rome", 17.99, suncars);
        klanten[0].maakVoucher(ford, ford.getVerhuurplaats(), new Date(2019, 1, 12), 6);
        klanten[1].maakVoucher(toyota, toyota.getVerhuurplaats(), new Date(2019, 6, 23), 3);

        System.out.println("Er zijn de volgende auto’s verhuurd:");
        for (Klant klant : klanten) {
            for(Voucher voucher : klant.getMijnVouchers()) {
                if (voucher != null) {
                    System.out.println(String.format("Klant: %s heeft een %s gehuurd voor %s dagen in %s", klant.getNaam(), voucher.getAuto().getMerk(), voucher.getAantal_dagen(), voucher.getAuto().getVerhuurplaats()));
                }
            }
        }

        for (Klant klant : klanten) aantalAutosVerhuurd += klant.getAantalAutosVerhuurd();
        System.out.println(String.format("Aantal verhuurde auto’s: %s", aantalAutosVerhuurd));

        Persoon[] personen = new Persoon[2];
        personen[0] = new Persoon("Babette");
        personen[1] = new Servicedeskmedewerker("Tom", "t.degraaf@gmail.com");

        System.out.println("Lijst met personen: ");
        for (Persoon persoon : personen) {
            System.out.println(String.format("Naam: %s", persoon.getNaam()));
        }
    }
}
