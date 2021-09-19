package src;

import java.util.Scanner;

/*
Napisati program gde deklarisete vase ime, prezime kao string, pol kao char i odstampajte adekvatno sva tri unosa.
 Nakon toga preko skenera treba da unesete ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama
 i ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama, 
na kraju treba odstampati procenat zlatnih medalja u odnosu na ukupan broj medalja. Ako ima pitanja pisite u thread.
*/
public class Domaci1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		String ime = "Nikola";
		System.out.println("Ime: " + ime);
		String prezime = "Stavrov";
		System.out.println("Prezime: " + prezime);
		char pol = 'M';
		System.out.println("Pol: " + pol);
		
		
		System.out.println("Unesi ukupan broj medalja osvojenih na OI: ");
		double ukupanBrojM = scanner.nextInt();

		System.out.println("Unesi ukupan broj zlata osvojenih na OI: ");
		double ukupanBrojZ = scanner.nextInt();
		
		
		
		double procenatZ = ukupanBrojZ / ukupanBrojM * 100;
		System.out.println("Procenat osvojenih zlata u odnosu na ukupan broj medalja na OI je " + procenatZ);
		
		scanner.close();
		

		
		
		
		
	}

}
