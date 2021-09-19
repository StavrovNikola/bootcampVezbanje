package src2;

import java.util.Scanner;
/*
Napisati program gde u nizu napisete ovih 5 gradova
 (Lisabon, London, Helsinki, Prag i Madrid), 
a program stampa gradove sve dok ne dodje do "Prag"-a.

*/

public class Domaci71 {

	public static void main(String[] args) {


String[] gradovi = { "Lisabon", "London", "Helsinki", "Prag", "Madrid" };
 
     for(int i = 0; i<gradovi.length-2; i++)
     {
     
     System.out.println("Grad [" + i +"]: " + gradovi[i]);
     }
 }
 }
	