package wk3.opdrachten;

import java.util.Scanner;

public class StartUp {
    public static void main(String[] args)
    {
        Schaakbord spel = new Schaakbord();
        Scanner input = new Scanner(System.in);
        while (true)
        {
            System.out.println("Van positie:");
            String x = input.next();
            System.out.println("Naar positie:");
            String y = input.next();
            spel.doeZet(spel, x, y);
        }
    }
}
