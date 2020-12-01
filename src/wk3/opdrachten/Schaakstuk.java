package wk3.opdrachten;

public class Schaakstuk {
    private final String naam;
    private final String kleur;

    public Schaakstuk(String naam, String kleur)
    {
        this.naam = naam;
        this.kleur = kleur;
    }

    public String getNaam()
    {
        return naam;
    }

    public String getKleur()
    {
        return kleur;
    }
}
