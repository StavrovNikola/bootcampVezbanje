package src;

import java.util.Scanner;
/*
Unestite svoje ime:  Petar
Unestite svoje prezime:   Petrovic
Unesite poluprecnik kruznice: 3
Rezultati za: Petra Petrovica su
     Obim kruga je:  2*3*3.14
     Povrsina kruga je:  3*3*3.14
*/

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite vase ime: ");
		String mojeIme = scanner.nextLine();
		System.out.println("Unesite vase prezime: ");
		String mojePrezime = scanner.nextLine();
		System.out.println("Unesite poluprecnik kruznice: ");
		int poluprecnikK = scanner.nextInt();
		double obimK = 2*3*3.14;
		double povrsinaK = 3*3*3.14;
	
		
		System.out.println("Rezultati za: ");
		System.out.println("Obim kruga je " + obimK);
		System.out.println("Povrsina kruga je " + povrsinaK);
		System.out.println("Kraj programa");
		
		scanner.close();
		
		
		
		
	}
}