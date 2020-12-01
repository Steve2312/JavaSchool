package wk3.opdrachten;

public class Auto {
    private String naam;
    private String kleur;
    private int verkoopprijs;

    public Auto(String naam, String kleur, int verkoopprijs)
    {
        this.naam = naam;
        this.kleur = kleur;
        this.verkoopprijs = verkoopprijs;
    }

    public String getNaam()
    {
        return naam;
    }

    public String getKleur()
    {
        return kleur;
    }

    public int getVerkoopprijs()
    {
        return verkoopprijs;
    }
}
