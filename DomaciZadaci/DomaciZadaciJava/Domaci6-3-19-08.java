package src;

import java.util.Scanner;
/*
Napisati program koji stampa sliku na ekranu za N redova.
 N unosi korisnik preko skenera.
(Koristiti for petlju)
Na primer N: 5
*
**
***
****
*****

*/

public class Domaci63{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
     int i = 0;
     int broj = 0;
     String x = "*";
     System.out.println("Unesite broj redova: ");
     broj = sc.nextInt();
     
     for (i = 0; i <= broj ; i++) {
         System.out.println(x);
     x = x + "*";
     }
     
     
     sc.close();
     }
 }

