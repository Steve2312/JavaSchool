package wk1.opdrachten;

import java.util.Scanner;

public class SecondenOmrekenenen {
	private long input_seconden;
	private long jaren;
	private long dagen;
	private long uren;
	private long minuten;
	private long seconden;
	public static void main(String[] args)
	{
		SecondenOmrekenenen x = new SecondenOmrekenenen();
		Scanner input = new Scanner(System.in);
		System.out.println("Voer het aantal seconden in: ");
		x.input_seconden = input.nextLong();
		input.close();
		
		x.jaren  = (long) Math.floor(x.input_seconden / (60 * 60 * 24 * 365));
		x.seconden  = x.input_seconden % (60 * 60 * 24 * 365);
		x.dagen = (long) Math.floor(x.seconden / (60 * 60 * 24));
		x.seconden  = x.seconden % (60 * 60 * 24);
		x.uren = (long) Math.floor(x.seconden / (60 * 60));
		x.seconden  = x.seconden % (60 * 60);
		x.minuten = (long) Math.floor(x.seconden / 60);
		x.seconden  = x.seconden % (60);
		System.out.println(String.format("%s bestaat uit:\nJaren: %s\nDagen: %s\nUren: %s\nMinuten: %s\nSeconden: %s", x.input_seconden, x.jaren, x.dagen, x.uren, x.minuten, x.seconden));
	}
}
