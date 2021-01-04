package wk6.ioo1_oefentoets_1126025;

import java.util.Date;

public class Voucher {
    private Date verhuurdatum;
    private int aantal_dagen;
    private double totaalbedrag;
    private Auto auto;

    public Voucher(Auto auto, Date verhuurdatum, int aantal_dagen, double totaalbedrag) {
        this.auto = auto;
        this.verhuurdatum = verhuurdatum;
        this.aantal_dagen = aantal_dagen;
        this.totaalbedrag = totaalbedrag;
    }

    public Auto getAuto() {
        return auto;
    }

    public Date getVerhuurdatum() {
        return verhuurdatum;
    }

    public int getAantal_dagen() {
        return aantal_dagen;
    }

    public double getTotaalbedrag() {
        return totaalbedrag;
    }
}
