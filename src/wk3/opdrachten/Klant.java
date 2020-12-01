package wk3.opdrachten;

public class Klant {
    private int id;
    private String naam;
    private int bedrag;
    private Auto auto;

    public Klant(int id, String naam, int bedrag)
    {
        this.id = id;
        this.naam = naam;
        this.bedrag = bedrag;
    }

    public int getId()
    {
        return id;
    }

    public int getBedrag()
    {
        return bedrag;
    }

    public void setBedrag(int bedrag)
    {
        this.bedrag = bedrag;
    }

    public String getNaam()
    {
        return naam;
    }

    public void setAuto(Auto auto)
    {
        this.auto = auto;
    }
}
