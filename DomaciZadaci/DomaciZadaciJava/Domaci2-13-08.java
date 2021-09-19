package src;

import java.util.Scanner;

/*
1.Napisati program gde preko skenera unesete broj, 
ako je broj manji od 10 onda ga pomnoziti sa 100, 
ako je broj veci od 100 onda ga podeliti sa 10. 
Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.
*/

public class Domaci2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		int mojBroj = scanner.nextInt();
		
		if (mojBroj < 10) {
			
			int pomnozeniBroj = mojBroj * 100;
		System.out.println("Broj je pomnozen sa 100: " + pomnozeniBroj);
	}
	else if (mojBroj > 100) {
		double podeljeniBroj = mojBroj / 10;
		System.out.println("Broj je podeljen sa 10: " + podeljeniBroj);
		
	}	else {
			System.out.println("Broj nije manji od 10 i nije veci od 100");
			
			scanner.close();
	}
	
	
	}
	
	
	}


