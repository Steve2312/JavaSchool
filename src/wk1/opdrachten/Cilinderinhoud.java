package wk1.opdrachten;

import java.util.Scanner;

public class Cilinderinhoud {
	private double straal;
	private double hoogte;
	private final double pi = 3.141592653;
	private double inhoud;
	
	public static void main(String[] args)
	{
		Cilinderinhoud x = new Cilinderinhoud();
		Scanner input = new Scanner(System.in);
		System.out.print("Wat is de straal van jou cilinder in cm: ");
		x.straal = input.nextDouble();
		System.out.print("Wat is de hoogte van jou cilinder in cm: ");
		x.hoogte = input.nextDouble();
		input.close();
		x.inhoud = x.straal * x.straal * x.pi * x.hoogte;
		System.out.print(String.format("De inhoud van de cilinder is : %scm�", x.inhoud));
	}
}
