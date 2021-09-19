package src;

import java.util.Scanner;
/*
Napisati program gde kroz switch se unosi broj od 1 do 12 i program ispisuje koji je to mesec u godini. 
Ako korisnik unese drugi broj treba da se ispise poruka "Potrebno je uneti broj od 1 do 12"
*/

public class Domaci3 {

	public static void main(String[] args) {

		Scanner mojSkener = new Scanner (System.in);
		
		int mesec = mojSkener.nextInt();
		
		switch (mesec) {
		case 1: 
			System.out.println("Januar");
			break;
		case 2: 
			System.out.println("Februar");
			break;
		case 3:
			System.out.println("Mart");
			break;
		default: 
			System.out.println("Nije validan unos");
		}
		
	}

}
