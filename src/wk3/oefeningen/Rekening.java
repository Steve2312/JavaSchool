package wk3.oefeningen;

public class Rekening {
    private String rekeningNummer;
    private float saldo;

    public Rekening(String nummer, float beginSaldo)
    {
        this.rekeningNummer = nummer;
        this.saldo = beginSaldo;
    }

    public void setRekeningNummer(String rekeningNummer)
    {
        this.rekeningNummer = rekeningNummer;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    public String getRekeningNummer()
    {
        return rekeningNummer;
    }

    public float getSaldo()
    {
        return saldo;
    }
}
