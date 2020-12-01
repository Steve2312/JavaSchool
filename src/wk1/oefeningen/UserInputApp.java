package wk1.oefeningen;

import java.util.Scanner;

public class UserInputApp {
	private int getal;
	public static void main(String[] args)
	{
		UserInputApp x = new UserInputApp();
		Scanner input = new Scanner(System.in);
		System.out.println("Voer een getal in: ");
		x.getal = Integer.parseInt(input.next()) * 2;
		input.close();
		System.out.println(x.getal);
	}
}
