package wk1.oefeningen;

public class VoornaamEnAchternaam {
	private String voorNaam = "Jurgen";
	private String achterNaam = "Vermeer";
	private String namenAanElkaar;
	public static void main(String[] args)
	{
		VoornaamEnAchternaam x = new VoornaamEnAchternaam();
		x.namenAanElkaar = x.voorNaam + " " + x.achterNaam;
		System.out.println(x.namenAanElkaar);
	}
}
