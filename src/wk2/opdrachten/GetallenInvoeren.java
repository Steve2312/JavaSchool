package wk2.opdrachten;

import java.util.Arrays;
import java.util.Scanner;

public class GetallenInvoeren {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		GetallenInvoeren x = new GetallenInvoeren();
		System.out.print("Hoeveel getallen wil je invoeren? : ");
		int aantal_waardes = input.nextInt();
		int[] y = x.voerInGetallen(aantal_waardes);
		x.toonGetallen(y);
		System.out.println("\n");
		System.out.println(String.format("Maximum waarde: %s", x.bepaalMaximum(y)));
		System.out.println(String.format("Minimum waarde: %s", x.bepaalMinimum(y)));
		System.out.println("\n");
		System.out.println("Alle Even Waarden");
		x.toonGetallen(x.pakAlleEvenGetallen(y));
		input.close();
	}
	
	public int[] voerInGetallen(int aantal_getallen)
	{
		
		int ingevoerdeGetallen[] = new int[aantal_getallen];
		for (int i = 0; i < aantal_getallen;i++)
		{
			System.out.print(String.format("Voer getal %s in: ", i + 1));
			ingevoerdeGetallen[i] = input.nextInt();
			System.out.print("\n");
		}
		
		return ingevoerdeGetallen;
	}
	
	public int bepaalMaximum(int[] arrayGetallen)
	{
		int[] x = new int[arrayGetallen.length];
		for (int i = 0;i < arrayGetallen.length; i++)
		{
			x[i] = arrayGetallen[i];
		}
		Arrays.sort(x);
		return x[x.length - 1];
	}
	
	public int bepaalMinimum(int[] arrayGetallen)
	{
		int[] x = new int[arrayGetallen.length];
		for (int i = 0;i < arrayGetallen.length; i++)
		{
			x[i] = arrayGetallen[i];
		}
		Arrays.sort(x);
		return x[0];
	}
	
	public int[] pakAlleEvenGetallen(int[] arrayGetallen)
	{
		int Even = 0;
		// Check how many even numbers there are
		for (int i = 0;i < arrayGetallen.length; i++)
		{
			if(arrayGetallen[i] % 2 == 0)
			{
				Even++;
			}
		}
		
		// Initialize new Array
		int ArrayPos = 0;
		int EvenArray[] = new int[Even];
		for (int x : arrayGetallen)
		{
			if(x % 2 == 0)
			{
				EvenArray[ArrayPos] = x;
				ArrayPos++;
			}
		}
		return EvenArray;
	}
	
	public void toonGetallen(int[] arrayGetallen)
	{
		for (int i = 0; i < arrayGetallen.length; i++)
		{
			System.out.println(String.format("Getal %s: %s", i + 1, arrayGetallen[i]));
		}
	}
}
