package src;

import java.util.Scanner;
/*
Napraviti program sa while petljom koja ispisuje
    'Da li zelite da izadjete iz petlje [d/n]: '
     d-da, n -ne
     Ukoliko izaberemo d, tj. 'da', tada izlazimo iz petlje
     Ukoliko izaberemo n, tj. 'ne', tada ostajemo u petlji i ponavljamo pitanje

*/

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char e = 'c';
		char a = 'd';
		char b = 'n';

		while (e != a) {
			System.out.println("Da li zelite da izadjete iz petlje, d-da, n-ne: ");
			e = scanner.nextLine().charAt(0);
		}
		System.out.println("Izasli ste iz petlje");
		scanner.close();
	}	
}