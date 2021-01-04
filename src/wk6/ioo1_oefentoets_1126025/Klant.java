package wk6.ioo1_oefentoets_1126025;

import java.util.Date;

public class Klant extends Persoon{
    private Voucher[] mijnVouchers = new Voucher[10];
    private int aantalAutosVerhuurd;

    public Klant(String naam) {
        super(naam);
    }

    public Voucher[] getMijnVouchers() {
        return mijnVouchers;
    }

    public void setMijnVouchers(Voucher[] mijnVouchers) {
        this.mijnVouchers = mijnVouchers;
    }

    public void maakVoucher(Auto auto, String plaats, Date startDatum, int aantalDagen) {
        Voucher voucher = new Voucher(auto, startDatum, aantalDagen, auto.getDagprijs());
        // Voeg voucher toe aan mijnVoucher
        for (int i = 0; i<mijnVouchers.length;i++) {
            if (mijnVouchers[i] == null) {
                mijnVouchers[i] = voucher;
                break;
            }
        }
    }

    public int getAantalAutosVerhuurd() {
        for(Voucher voucher : mijnVouchers) {
            if (voucher != null) {
                aantalAutosVerhuurd++;
            }
        }
        return aantalAutosVerhuurd;
    }
}
