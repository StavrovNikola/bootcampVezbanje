package src;

public class Zadatak4 {
/*
Sa switch petljom, proveri unetu godinu zivota i to
ako je 7god   -> ispisi da je prvi razred
ako je 8god   -> ispisi da je drugi razred
*/
	public static void main(String[] args) {

		
			int godinaZivota = '8';
			
			
		switch (godinaZivota) {
		case '7':
			System.out.println("Dete je prvi razred");
			break;
		case '8':
			System.out.println("Dete je drugi razred");
			break;
		default: 
			System.out.println("Pogresan unos godina.");
		}
			
	
		
		
	}	
		
		
	}


