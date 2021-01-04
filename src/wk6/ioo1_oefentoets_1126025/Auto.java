package wk6.ioo1_oefentoets_1126025;

public class Auto {
    private String merk;
    private String verhuurplaats;
    private double dagprijs;
    private Verhuurorganisatie verhuurorganisatie;

    public Auto(String merk, String verhuurplaats, double dagprijs, Verhuurorganisatie verhuurorganisatie) {
        this.merk = merk;
        this.verhuurplaats = verhuurplaats;
        this.dagprijs = dagprijs;
        this.verhuurorganisatie = verhuurorganisatie;
    }

    public String getMerk() {
        return merk;
    }

    public String getVerhuurplaats() {
        return verhuurplaats;
    }

    public double getDagprijs() {
        return dagprijs;
    }

    public Verhuurorganisatie getVerhuurorganisatie() {
        return verhuurorganisatie;
    }
}
