package wk5.opdrachten.LockItModel;

import java.util.Scanner;

public class School {
    private final Locker[] locker;
    private int aantalBezetteLockers = 0;
    public School() {
        // All codes
        char[] keys = "ABCDEFG".toCharArray();
        int range = 3;

        // Set array size
        locker = new Locker[keys.length * 3];
        int index = 0;
        for(char x : keys) {
            for (int y = 1; y <= range; y++) {
                String code = String.format("%s%s", x,y);
                locker[index] = new Locker(code);
                index += 1;
            }
        }
    }

    public void lockerHuren (Huurder huurder) {
        if (huurder.getLocker() != null) {
            System.out.println("U bent op dit moment al in bezit van een locker.");
        } else {
            int i = lockerZoeken();
            if (i != -1) {
                String wachtwoord = locker[i].berekenWachtwoord();

                locker[i].setStatus("bezet");
                locker[i].setCijfer(wachtwoord);

                huurder.setLocker(locker[i].getNummer());

                aantalBezetteLockers += 1;

                System.out.println(String.format("Beste %s,\nU heeft locker nummer: %s\nHet wachtwoord is: %s", huurder.getNaam(), locker[i].getNummer(), wachtwoord));
            } else {
                System.out.println("Sorry er is helaas geen locker meer beschikbaar voor je.");
            }
        }
    }

    public Locker[] getLocker() {
        return locker;
    }

    public int lockerZoeken() {
        for (int i = 0; i < this.locker.length; i++) {
            if (locker[i].getStatus() == "beschikbaar") {
                return i;
            }
        }
        return -1;
    }

    public void setAantalBezetteLockers(int aantalBezetteLockers) {
        this.aantalBezetteLockers = aantalBezetteLockers;
    }

    public int getAantalBezetteLockers() {
        return aantalBezetteLockers;
    }

    public void openLocker(Scanner scanner, Huurder huurder) {
        if (huurder.getLocker() != null) {
            System.out.println("Voer het wachtwoord in: ");
            String wachtwoord = scanner.next();
            for (Locker locker : this.getLocker()) {
                if (locker.getNummer().equals(huurder.getLocker())) {
                    if (wachtwoord.equals(locker.getCijfer())) {
                        locker.setCijfer(null);
                        locker.setStatus("beschikbaar");
                        this.aantalBezetteLockers -= 1;
                        System.out.println("Locker is open en de locker is weer beschikbaar");
                    } else {
                        System.out.println("Wachtwoord onjuist!");
                    }
                    break;
                }
            }
        }
    }
}
