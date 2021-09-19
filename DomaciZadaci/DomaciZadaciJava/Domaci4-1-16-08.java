package src;
 
 import java.util.Scanner;
/*
While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta

*/
 
 public class Domaci41{
 
     public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Unesite broj: ");
         
         int x = scanner.nextInt();
         int n = 0;
         
         while (n < x) {
              n++;
             System.out.println("Laku noc!");
             
             }
     }
     
 }