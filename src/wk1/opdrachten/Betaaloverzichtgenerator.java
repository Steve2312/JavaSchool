package wk1.opdrachten;

import java.util.Scanner;

public class Betaaloverzichtgenerator {
	private double appel_prijs = 0.50;
	private double peer_prijs = 0.70;
	private double aardappel_prijs = 0.65;
	private double BTW_percentage = 0.21;

	public static void main(String[] args)
	{
		Betaaloverzichtgenerator g = new Betaaloverzichtgenerator();
		GebruikerInformatie user = new GebruikerInformatie();
		Scanner input = new Scanner(System.in);
		System.out.print("Wat is je naam?: ");
		user.naam = input.nextLine();
		System.out.println("De BTW is: " + (int) (g.BTW_percentage * 100) + "%");
		System.out.println(String.format("De verkoopprijs van een appel is: €%.2f", g.appel_prijs));
		System.out.print("Hoeveel appels wil je kopen?: ");
		user.aantal_appels = input.nextInt();
		
		System.out.println(String.format("De verkoopprijs van een peer is: €%.2f", g.peer_prijs));
		System.out.print("Hoeveel peren wil je kopen?: ");
		user.aantal_peren = input.nextInt();
		
		System.out.println(String.format("De verkoopprijs van een aardappel is: €%.2f", g.aardappel_prijs));
		System.out.print("Hoeveel aardappels wil je kopen?: ");
		user.aantal_aardappels = input.nextInt();
		
		input.close();
		
		user.totale_btw_appels = ((user.aantal_appels * g.appel_prijs) * g.BTW_percentage);
		user.subtotale_omzet_appels = (user.aantal_appels * g.appel_prijs);
		user.totale_kostprijs_appels = user.totale_btw_appels + user.subtotale_omzet_appels;
		
		user.totale_btw_peren = ((user.aantal_peren * g.peer_prijs) * g.BTW_percentage);
		user.subtotale_omzet_peren = (user.aantal_peren * g.peer_prijs);
		user.totale_kostprijs_peren = user.totale_btw_peren + user.subtotale_omzet_peren;
		
		user.totale_btw_aardappels = ((user.aantal_aardappels * g.aardappel_prijs) * g.BTW_percentage);
		user.subtotale_omzet_aardappels = (user.aantal_aardappels * g.aardappel_prijs);
		user.totale_kostprijs_aardappels = user.totale_btw_aardappels + user.subtotale_omzet_aardappels;
		
		user.totale_omzet = user.totale_kostprijs_appels + user.totale_kostprijs_peren + user.totale_kostprijs_aardappels;
		user.totale_btw = user.totale_btw_appels + user.totale_btw_peren + user.totale_btw_aardappels;
		
		System.out.print(
				String.format("Beste %s,\n\n", user.naam)
				+ "Hieronder volgt het betaaloverzicht:\n"
				+ "====================================\n\n"
				+ String.format("Appels aantal:\t\t%s\n", user.aantal_appels)
				+ String.format("Totaal kostprijs:\t€%.2f\n", user.totale_kostprijs_appels)
				+ String.format("Totaal BTW:\t\t€%.2f\n", user.totale_btw_appels)
				+ String.format("Subtotaal omzet:\t€%.2f\n", user.subtotale_omzet_appels)
				
				+ String.format("Peren aantal:\t\t%s\n", user.aantal_peren)
				+ String.format("Totaal kostprijs:\t€%.2f\n", user.totale_kostprijs_peren)
				+ String.format("Totaal BTW:\t\t€%.2f\n", user.totale_btw_peren)
				+ String.format("Subtotaal omzet:\t€%.2f\n", user.subtotale_omzet_peren)
				
				+ String.format("Aardappels aantal:\t%s\n", user.aantal_aardappels)
				+ String.format("Totaal kostprijs:\t€%.2f\n", user.totale_kostprijs_aardappels)
				+ String.format("Totaal BTW:\t\t€%.2f\n", user.totale_btw_aardappels)
				+ String.format("Subtotaal omzet:\t€%.2f\n\n", user.subtotale_omzet_aardappels)
				
				+ String.format("Totale omzet incl. BTW:\t€%.2f\n", user.totale_omzet)
				+ String.format("Totale BTW:\t\t€%.2f", user.totale_btw));
	}
}

class GebruikerInformatie {
	String naam;
	int aantal_appels;
	int aantal_peren;
	int aantal_aardappels;
	
	double totale_kostprijs_appels;
	double totale_btw_appels;
	double subtotale_omzet_appels;
	
	double totale_kostprijs_peren;
	double totale_btw_peren;
	double subtotale_omzet_peren;
	
	double totale_kostprijs_aardappels;
	double totale_btw_aardappels;
	double subtotale_omzet_aardappels;
	
	double totale_omzet;
	double totale_btw;
}
