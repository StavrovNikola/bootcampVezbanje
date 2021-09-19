package src2;

import java.util.Scanner;
/*
Napisati program gde u nizu napisete 5 gradova, 
a program vam odstampa sve osim prvog i poslednjeg unosa.
*/

public class Domaci7{


		public static void main(String[] args) {
         
         
         String[] gradovi = { "Pariz", "London", "Lisabon", "Kijev", "Moskva" };
 
         for (int i = 1; i < gradovi.length - 1; i++) {
             
             System.out.println("Grad [" + i +"]: " + gradovi[i] );
             }

 }
}