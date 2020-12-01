package wk1.opdrachten;

public class test {
	public static void main(String[] args)
	{
		bankpas pas1 = new bankpas();
		pas1.naam = "Steve";
		pas1.rekeningnummer = 4355543;
		pas1.pasnummer = 222;
		
		bankpas pas2 = new bankpas();
		pas2.naam = "Hans";
		pas2.rekeningnummer = 436345;
		pas2.pasnummer = 444;
		
		System.out.println(pas1.rekeningnummer); // 4355543
		System.out.println(pas2.rekeningnummer); // 436345
	}
}

class bankpas{
	String naam;
	int rekeningnummer;
	int pasnummer;
}
