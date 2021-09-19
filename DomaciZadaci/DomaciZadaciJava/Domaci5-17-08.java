package src2;
 
 import java.util.Scanner;
/*
While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” 
onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta

*/
 
 public class Domaci5 {
 
     public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in);
 
         int i = 0;
         int odgovor;
         String glavniGr;
 
         do {
             System.out.println("Izaberite opciju od ponudjenih: ");
             
             System.out.println("1. Francuska");
             System.out.println("2. Italija");
             System.out.println("3. Srbija");
             System.out.println("4. Izlaz");
 
             odgovor = sc.nextInt();
 
             if (odgovor == 1) {
                 System.out.println("Koji je glavni grad Francuske? ");
                 glavniGr = sc.next();
                 if (glavniGr.equals("Pariz")) {
                     System.out.println("Odgovor je tacan.");
                 } else {
                     System.out.println("Odgovor nije tacan.");
                 }
             } else if (odgovor == 2) {
                 System.out.println("Koji je glavni grad Italije? ");
                 glavniGr = sc.next();
                 if (glavniGr.equals("Rim")) {
                     System.out.println("Odgovor je tacan.");
                 } else {
                     System.out.println("Odgovor nije tacan.");
                 }
             } else if (odgovor == 3) {
                 System.out.println("Koji je glavni grad Srbije? ");
                 glavniGr = sc.next();
                 if (glavniGr.equals("Beograd")) {
                     System.out.println("Odgovor je tacan.");
                 } else {
                     System.out.println("Odgovor nije tacan.");
                 }
             }
 
         } while (odgovor != 4);
 
         System.out.println("Izasli ste iz programa.");
 
         sc.close();
 
     }
 }

