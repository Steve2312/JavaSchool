package wk3.oefeningen;

public class Bank
{
    public static void main(String[] args)
    {
        System.out.println("Week 3 oefeningen - De bank is open");
        Rekening rekening1 = new Rekening("1111", 0f);
        Rekening rekening2 = new Rekening("2222", 700f);
        Rekening rekening3 = new Rekening("3333", 8000f);
        Rekening rekening4 = new Rekening("4444", -900f);
        Rekening rekening5 = new Rekening("5555", -400f);

        rekening1.setSaldo(rekening1.getSaldo() + 100f);
        rekening2.setSaldo(rekening1.getSaldo() + 100f);
        rekening3.setSaldo(rekening1.getSaldo() + 100f);
        rekening4.setSaldo(rekening1.getSaldo() + 100f);
        rekening5.setSaldo(rekening1.getSaldo() + 100f);

        Klant jansen = new Klant("Jansen", rekening1);
        Klant oscar = new Klant("Oscar", rekening2);
        Klant steve = new Klant("Steve", rekening3);
        Klant levi = new Klant("Levi", rekening4);
        Klant shoewa = new Klant("Shoewa", rekening5);

        Klant[] klanten = new Klant[5];
        klanten[0] = jansen;
        klanten[1] = oscar;
        klanten[2] = steve;
        klanten[3] = levi;
        klanten[4] = shoewa;

        // Print alle klanten + rekeningnummer
        for(int i = 0; i < klanten.length; i++)
        {
            System.out.println(klanten[i].getNaam());
            System.out.println(klanten[i].getRekening().getSaldo());
            System.out.println();
        }

        // Saldo meer dan 100
        for(int i = 0; i < klanten.length; i++)
        {
            if (klanten[i].getRekening().getSaldo() > 100f)
            {
                System.out.println(klanten[i].getNaam());
                System.out.println(klanten[i].getRekening().getSaldo());
                System.out.println();
            }
        }

        // Negatief saldo
        for(int i = 0; i < klanten.length; i++)
        {
            if (klanten[i].getRekening().getSaldo() < 0f)
            {
                System.out.println(klanten[i].getNaam());
                System.out.println(klanten[i].getRekening().getSaldo());
                System.out.println();
            }
        }

    }
}