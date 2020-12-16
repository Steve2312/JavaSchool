package wk5.opdrachten.Ziekenhuis;

public class Main {
    public static void main(String[] args) {
//        Patient stefan = new Patient("Stefan");
//        Patient oscar = new Patient("Oscar");
//        Patient jansen = new Patient("Jansen");
//
//        Chirurg jan = new Chirurg("Jan Snijgraag");
//        Chirurg roland = new Chirurg("Roland");
//        Chirurg klaas = new Chirurg("Klaas");
//
//        stefan.opnemen(jan);
//        stefan.opereer(klaas);
//
//        oscar.opnemen(roland);
//        oscar.opereer(jan);
//
//        jansen.opnemen(jan);
//        jansen.opereer(roland);

        Persoon persoon = new Patient("Student Informatica");
        System.out.println(persoon.getNaam());

        Patient patient = (Patient) persoon;
        System.out.println(patient.getNaam());
    }
}
