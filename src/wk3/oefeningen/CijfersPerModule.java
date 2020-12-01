package wk3.oefeningen;

import java.io.IOException;
import java.util.Scanner;

public class CijfersPerModule {
    String[] vakken = new String[] {"IIPR", "IARCH", "IWIS", "IPOHBO"};
    String[] resultaten = new String[4];
    public static void main(String[] args) {
        CijfersPerModule x = new CijfersPerModule();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < x.vakken.length; i++)
        {
            System.out.println(String.format("In periode 1 volgde ik het vak %s en behaalde het cijfer: ", x.vakken[i]));
            x.resultaten[i] = scanner.next();
        }
        scanner.close();
        for(int i = 0; i < x.vakken.length; i++)
        {
            System.out.println(String.format("In periode 1 volgde ik het vak %s en behaalde het cijfer: %s", x.vakken[i], x.resultaten[i]));
            try {
                if (Double.parseDouble(x.resultaten[i]) > 5.4)
                {
                    System.out.println("– Jeej voldoende :)");
                }
            } catch(NumberFormatException err) {
                if (x.resultaten[i].equals("V") || x.resultaten[i].equals("G"))
                {
                    System.out.println("– Jeej voldoende :)");
                }
            }
        }
    }
}
