package wk2.opdrachten;

import java.util.Scanner;

public class TafelTonen {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Van welk getal tussen de 1 en 100 wil je de tafel zien?");
		int Tafel = input.nextInt();
		input.close();
		TafelTonen tafels = new TafelTonen();
		
		tafels.TafelForLoop(Tafel);
		tafels.TafelWhileLoop(Tafel);
		tafels.TafelDoWhileLoop(Tafel);
	}
	
	public void TafelForLoop(int tafel)
	{
		for (int i = 1;i <= 10;i++)
		{
			System.out.println(String.format("%s x %s = %s", i, tafel, i * tafel));
		}
	}
	
	public void TafelWhileLoop(int tafel)
	{
		int i = 0;
		while (i < 10)
		{
			i++;
			System.out.println(String.format("%s x %s = %s", i, tafel, i * tafel));
		}
	}
	
	public void TafelDoWhileLoop(int tafel)
	{
		int i = 0;
		do {
			i++;
			System.out.println(String.format("%s x %s = %s", i, tafel, i * tafel));
		} while (i < 10);
	}
}
