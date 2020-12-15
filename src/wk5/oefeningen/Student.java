package wk5.oefeningen;

public class Student {
    private String studentnummer;
    private String naam;
    private double cijfer;
    public Student(String studentnummer, String naam) {
        this.studentnummer = studentnummer;
        this.naam = naam;
    }
    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }
}
