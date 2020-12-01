package wk3.oefeningen;

public class Klant {
    private String naam;
    private Rekening mijnRekening;

    public Klant(String klantNaam, Rekening rekening)
    {
        this.naam = klantNaam;
        this.mijnRekening = rekening;
    }
    public String getNaam()
    {
        return naam;
    }

    public Rekening getRekening()
    {
        return mijnRekening;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public void setRekening(Rekening rekening)
    {
        this.mijnRekening = rekening;
    }
}
