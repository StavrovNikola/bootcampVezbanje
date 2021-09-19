package src;

import java.util.Scanner;
/*
Uneti poluprecnik kruga
  Ako je manji ili jednak od 0 -> vratiti poruku da poluprecnik nije validan
  Ako je poluprecnik manji ili jednak od 5 izracunati P
  Ako je poluprecnik veci od 5 izracunati 0
  Ako je poluprecnik veci od 10 izracunati P i O
    napomena: pi=3.14    P = r*r*pi    O=2*r*pi
    * prikazati sa ugnjezdenim if-ovima
*/

public class Zadatak3 {

	public static void main(String[] args) {

	Scanner mojSkener = new Scanner(System.in);
	
	
	
	System.out.println("Unesi poluprecnik kruga");
	double ppK = mojSkener.nextDouble();
	double p = 3.14;
	double oK = 2*ppK*p;
	double pK = ppK*ppK*p;
	
	if ( ppK <= 0 ) {
		System.out.println("Poluprecnik nije validan");
		}
	else if ( ppK <= 5) {
		
		System.out.println("Povrsina kruga je " + pK);
	}
	
	else if ( ppK >= 5 && ppK > 10) {
		System.out.println("Obim kruga je " + oK);
	}
	
	else if ( ppK > 10) {
		System.out.println("Povrsina kruga je " + pK + "a obim kruga je " + oK);
		}
	else {
		System.out.println("Podaci nisu ispravno uneti");
		mojSkener.close();
	}
	
	
		
		
		
	}
}
