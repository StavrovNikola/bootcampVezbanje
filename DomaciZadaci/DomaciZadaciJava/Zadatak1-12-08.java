package src;

import java.util.Scanner;

/*
Izracunati povrsinu i obim kvadrata (na osnovu unete stranice a)
Izracunati povrsinu i obim pravougaonika (na osnovu unete stranice a i b) 
*/
public class Zadatak1 {

	public static void main(String[] args) {
     
		Scanner mojSkener = new Scanner(System.in);
		
		System.out.println("Zadatak: Izracunaj povrsinu i obim kvadrata");
		
		System.out.println("Unesi stranicu a: ");
		int stranicaA = mojSkener.nextInt();
		System.out.println("Unesi stranicu b: ");
		int stranicaB = mojSkener.nextInt();
		int povrsK = stranicaA*stranicaB;
		int obimK = 2*stranicaA + 2*stranicaB;
		
		System.out.println("Povrsina kvadrata je " + povrsK);
		System.out.println("Obim kvadrata je " + obimK);
		
		System.out.println("Kraj programa");
		
		mojSkener.close();

	}
}

