package wk2.oefeningen;

public class Week2 {
	public static void main(String[] args)
	{
		System.out.println("main van week 2 oefeningen");
		
		Week2 oefeningen = new Week2();
		
		oefeningen.oefenMetIf1();
		
		System.out.println(oefeningen.oefenMetIf2());
		
		oefeningen.oefenMetIf3();
		
		System.out.println(oefeningen.oefenMetSwitch("Maandag"));
		
		oefeningen.oefenMetWhile(20);
		
		oefeningen.oefenMetDoWhile(20);
		
		oefeningen.oefenMetFor();
		
		oefeningen.oefenMetFor2();
		
		oefeningen.oefenMetArrays();
	}
	
	public void oefenMetIf1()
	{
		if (true)
		{
			System.out.println("if geeft true");
		}
		
		int getal = 3;
		if (getal < 10)
		{
			System.out.println("if geeft true");
		}
		
		char karakter = 'a';
		if (karakter != 'c')
		{
			System.out.println("if geeft true");
		}
		
	}
	
	public boolean oefenMetIf2()
	{
		int getal = 3;
		if (getal < 10)
		{
			return true;
		} 
		else {
			return false;
		}
	}
	
	public void oefenMetIf3()
	{
		int afstandTotSchool = 20;
		if (afstandTotSchool < 2)
		{
			System.out.println("lopen");
		} 
		else if (afstandTotSchool >= 2 & afstandTotSchool <= 10)
		{
			System.out.println("fietsen");
		}
		else {
			System.out.println("trein");
		}
	}
	
	public String oefenMetSwitch(String dagVanDeWeek)
	{
		switch(dagVanDeWeek) {
		case "Maandag":
			return "kroket";
		case "Dinsdag":
			return "kaas souffl�";
		case "Woensdag":
			return "balletje gehakt";
		case "Donderdag":
			return "frikandel";
		case "Vrijdag":
			return "gebakken ei";
		default:
			return "No such day";
		}
	}
	
	public void oefenMetWhile(int aantalMaal)
	{
		while(aantalMaal > 0)
		{
			aantalMaal--;
			System.out.println(String.format("Nog zoveel keer: %s", aantalMaal));
			if (aantalMaal == 1)
			{
				System.out.println("Helaas laatste keer");
			}
		}
	}
	
	public void oefenMetDoWhile(int aantalMaal)
	{
		do {
			aantalMaal--;
			System.out.println(String.format("Nog zoveel keer: %s", aantalMaal));
			if (aantalMaal == 1)
			{
				System.out.println("Helaas laatste keer");
			}
		}
		while(aantalMaal > 0);
	}
	
	public void oefenMetFor()
	{
		for (int i = 0;i < 10;i++)
		{
			System.out.println("Het is wel leuk, echt waar!");
		}
	}
	
	public void oefenMetFor2()
	{
		for (int i = 0;i < 10;i++)
		{
			if (i == 4)
			{
				System.out.println("Het is helemaal niet leuk!");
				break;
			}
			System.out.println("Het is wel leuk, echt waar!");
		}
	}
	
	public void oefenMetArrays()
	{
		double mijnCijfers[] = new double[] {9.8, 9.4, 9.1, 7.0};
		
		for (double x : mijnCijfers)
		{
			System.out.println(x);
		}
		
		String bevatModules[] = new String[] {"IIPR", "IARCH", "IWIS", "IPOHBO"};
		for (String x : bevatModules)
		{
			System.out.println(x);
		}
		
		for (int i = 0;i < bevatModules.length; i++)
		{
			System.out.println(String.format("Module: %s, Cijfer: %s", bevatModules[i], mijnCijfers[i]));
		}
		
		int Studiepunten = 0;
		for (int i = 0;i < bevatModules.length; i++)
		{
			String module = bevatModules[i];
			double cijfer = mijnCijfers[i];
			
			if (cijfer > 5.4)
			{
				switch(module) {
				case "IIPR":
					Studiepunten += 4;
					break;
				case "IWIS":
					Studiepunten += 3;
					break;
				case "IARCH":
					Studiepunten += 3;
					break;
				case "IPOHBO":
					Studiepunten += 3;
					break;
				}
			}
		}
		
		System.out.println(String.format("Aantal behaalde studiepunten: %s", Studiepunten));
	}

}
