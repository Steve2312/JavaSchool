package wk6.ioo1_oefentoets_1126025;

public class Servicedeskmedewerker extends Persoon {
    private String email_adres;

    public Servicedeskmedewerker(String naam, String email_adres) {
        super(naam);
        this.email_adres = email_adres;
    }

    public String getEmail_adres() {
        return email_adres;
    }
}
