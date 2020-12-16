package wk5.opdrachten.LockItModel;

import java.util.Scanner;

public class LocktItMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School hsleiden = new School();
//        Huurder steve = new Huurder("Steve");
//        Huurder oscar = new Huurder("Oscar");
//        Huurder dawid = new Huurder("Dawid");

//        hsleiden.lockerHuren(steve);
//        hsleiden.lockerHuren(oscar);
//        hsleiden.lockerHuren(dawid);

//        hsleiden.openLocker(scanner, steve);
//        hsleiden.openLocker(scanner, oscar);
//        hsleiden.openLocker(scanner, dawid);

        System.out.println(hsleiden.getLocker()[6].getNummer());

    }
}
