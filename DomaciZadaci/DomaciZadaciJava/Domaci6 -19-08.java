package src2;

import java.util.Scanner;
/*
Napisati program gde korisnik unosi pozitivne brojeve, 
kad unese negativan broj prikaze mu se suma svih prethodno unetih brojeva
 i na kraju zakomentarisati koje ste brojeve sve unosili po testu
*/
 
public class Domaci6 {
 
     public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in);
 
         int i = 0;
         int sum = 0;
 
         do {
             sum = sum + i;
             System.out.println("Unesite broj: ");
             i = sc.nextInt();
 
         } while (i >= 0);
 
         System.out.println("Zbir unetih brojeva je: " + sum);
 
     }
 }