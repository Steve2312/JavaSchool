package wk5.oefeningen;

import java.util.Random;

public class Utils {
    public double berekenCijfer() {
        Random random = new Random();
        return 1F + (10F -  1F) * random.nextDouble();
    }
}
