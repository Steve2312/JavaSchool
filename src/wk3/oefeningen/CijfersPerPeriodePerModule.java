package wk3.oefeningen;

import java.util.Scanner;

public class CijfersPerPeriodePerModule {
    final int periode = 0;
    final int vak = 1;
    final int cijfer = 2;
    String[][] cpppm = new String[3][3];
    String voldoende;
    public static void main(String[] args)
    {
        CijfersPerPeriodePerModule x = new CijfersPerPeriodePerModule();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < x.cpppm.length; i++)
        {
            System.out.println("Welke periode?");
            x.cpppm[i][x.periode] = scanner.next();
            System.out.println("Welke vak?");
            x.cpppm[i][x.vak] = scanner.next();
            System.out.println("Welke cijfer?");
            x.cpppm[i][x.cijfer] = scanner.next();
        }
        scanner.close();

        for(int i = 0; i < x.cpppm.length; i++)
        {
            // Voldoende?
            x.voldoende = "Onvoldoende";
            try {
                if (Double.parseDouble(x.cpppm[i][x.cijfer]) > 5.4)
                {
                    x.voldoende = "Voldoende";
                }
            } catch(NumberFormatException err) {
                if (x.cpppm[i][x.cijfer].equals("V") || x.cpppm[i][x.cijfer].equals("G"))
                {
                    x.voldoende = "Voldoende";
                }
            }
            System.out.println(String.format("In periode %s behaalde ik een %s voor het vak %s. Dit is een %s", x.cpppm[i][x.periode], x.cpppm[i][x.cijfer], x.cpppm[i][x.vak], x.voldoende));
        }
    }
}
