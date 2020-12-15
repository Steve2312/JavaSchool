package wk5.opdrachten.LockItModel;

import java.util.Scanner;

public class Locker {
    private final String nummer;
    private String cijfer;
    private String status = "beschikbaar";

    public Locker(String nummer) {
        this.nummer = nummer;
    }

    public void setCijfer(String cijfer) {
        this.cijfer = cijfer;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getCijfer() {
        return cijfer;
    }

    public String getNummer() {
        return nummer;
    }

    public String berekenWachtwoord() {
        int max = 30;
        int min = 1;
        int range = max - min - 1;
        return String.format("%02d%02d", (int)(Math.random() * range), (int)(Math.random() * range));
    }
}
