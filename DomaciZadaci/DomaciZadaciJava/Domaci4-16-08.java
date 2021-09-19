package src;

import java.util.Scanner;
/*
While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, 
i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11

*/

public class Domaci4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int broj = 0;
		int zbirB = 0;
		
			while (broj >= 0) {
				
				System.out.println("Unesite broj: ");
				
				broj = scanner.nextInt();
				if (broj < 0) 
				break;
				{
				zbirB = zbirB + broj;	
					}
				
				System.out.println("Zbir pozitivnih brojeva je: " + zbirB);
			}
		
	}

}
