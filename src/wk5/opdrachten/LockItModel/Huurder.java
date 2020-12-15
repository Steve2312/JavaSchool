package wk5.opdrachten.LockItModel;

public class Huurder {
    private final String naam;
    private String locker;

    public Huurder(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public String getLocker() {
        return locker;
    }

    public void setLocker(String locker) {
        this.locker = locker;
    }
}
