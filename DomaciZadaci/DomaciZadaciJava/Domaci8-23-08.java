package src2;
 
 import java.util.Scanner;
 
 public class Domaci8 {
 
     public static void main(String[] args) {
 
         Scanner scan = new Scanner(System.in);
 
         int[] unosBr = new int[3];
 
         for (int i = 0; i < unosBr.length; i++) {
 
             System.out.println("Unesite broj: ");
 
             unosBr[i] = scan.nextInt();
 
         }
 
         scan.close();
 
         int zbirBr = sabiranje(unosBr);
 
         int maxBr = maksimum(unosBr);
 
         System.out.println("Zbir brojeva je: " + zbirBr + " Najveci broj: " + maxBr);
 
 
     }
 
     private static int sabiranje(int[] unosBr) {
 
         int zbirBr = unosBr[0];
 
         for (int i = 1; i < unosBr.length; i++) {
 
             zbirBr += unosBr[i];
 
         }
 
         return zbirBr;
 
     }
 
     private static int maksimum(int[] unosBr) {
 
         int maxBr = unosBr[0];
 
         for (int i = 0; i < unosBr.length; i++) {
 
             if (maxBr < unosBr[i]) {
 
                 maxBr = unosBr[i];
 
             }
 
         }
 
         return maxBr;
 
     }
 
 }