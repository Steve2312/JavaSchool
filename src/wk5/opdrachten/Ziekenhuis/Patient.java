package wk5.opdrachten.Ziekenhuis;

public class Patient extends Persoon{
    public final String PAT_AFKORTING;
    private int patientnummer;
    private Chirurg[] chirurg;
    private Bed bed;

    public Patient(String naam) {
        super(naam);
        patientnummer = (int) (Math.random() * ((999999 - 100000) + 1)) + 100000;
        PAT_AFKORTING = "pat";
    }

    public void opereer(Chirurg chirurg) {
        chirurgToevoegen(chirurg);
        System.out.println(String.format("Patient %s is geopereerd door chirurg %s", patientnummer, chirurg.getNaam()));
    }

    public void opnemen(Chirurg chirurg) {
        chirurgToevoegen(chirurg);
        System.out.println(String.format("Patient %s wordt opgenomen door chirurg %s", patientnummer, chirurg.getNaam()));
    }

    public int getPatientnummer() {
        return patientnummer;
    }

    public void chirurgToevoegen(Chirurg chirurg) {
        if (this.chirurg != null && this.chirurg.length > 0) {
            Chirurg[] nieuweLijst = new Chirurg[this.chirurg.length + 1];
            for(int i = 0; i < this.chirurg.length; i++) {
                nieuweLijst[i] = this.chirurg[i];
            }
            nieuweLijst[nieuweLijst.length - 1] = chirurg;
            this.chirurg = nieuweLijst;
        } else {
            this.chirurg = new Chirurg[1];
            this.chirurg[0] = chirurg;
        }
    }
}
