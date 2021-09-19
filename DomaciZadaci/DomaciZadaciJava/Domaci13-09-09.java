/*Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. 
Svi podaci mogu da se dohvate, ali ne i postave.
Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
Putnik je covek koji poseduje novac. 
Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja.
 Odredjena svota novca moze da mu se doda i/ili oduzme.
Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze.
 Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca
*/

package src8;
 
 public class Covek {
 
 public Covek(String imePrezime) {
     
     this.imePrezime = imePrezime;
 }
 
 public String getImePrezime() {
     return imePrezime;
 }
     
 
 
 }

package src8;
 
 public class Putnik extends Covek {
  
     private int novac;
 
     public Putnik(String imePrezime, int novac) {
         super(imePrezime);
         this.novac = novac;
     }
 
     public int getNovac() {
         return novac;
     }
 
     public void setNovac(int novac) {
         this.novac = novac;
     }
 public String toString() {
         
         return "Putnik: " + super.getImePrezime() + ", poseduje sumu od: " + novac + "din.";
     
     
     
     
    }
 }
package src8;
 public class Vozac extends Covek {
     public Vozac(String imePrezime, String zanimanje) {
         super(imePrezime);
         this.zanimanje=zanimanje;
     }
 
     public String getZanimanje() {
         return zanimanje;
     }
 
     public void setZanimanje(String zanimanje) {
         this.zanimanje = zanimanje;
     }
     
     public String toString() {
         
         return "Vozac: " + super.getImePrezime() + "\nZanimanje: " + zanimanje +"\n";
         
     }
     
     
 }
package src8;
 
 public class Autobus {
 
     private String naziv;
     private int cenaKarte;
     private Vozac voz;
     private Putnik put;
     public Autobus(String naziv, int cenaKarte, Vozac voz, Putnik put) {
         this.naziv = naziv;
         this.cenaKarte = cenaKarte;
         this.voz = voz;
         this.put = put;
     }
     public String getNaziv() {
         return naziv;
     }
     public void setNaziv(String naziv) {
         this.naziv = naziv;
     }
     public int getCenaKarte() {
         return cenaKarte;
     }
     public void setCenaKarte(int cenaKarte) {
         this.cenaKarte = cenaKarte;
     }
     public Vozac getVoz() {
         return voz;
     }
     public void setVoz(Vozac voz) {
         this.voz = voz;
     }
     public Putnik getPut() {
         return put;
     }
     public void setPut(Putnik put) {
         this.put = put;
     }
 public String toString() {
         
         return "\nAutobus: " + naziv +"\n" + voz + "Cena karte: " + cenaKarte + "din." + "\n" + put;
     
     
     
   }
 }
package src8;
 
 public class CovekMain {
 
     public static void main(String[] args) {
         Vozac v1 = new Vozac("Nikola Stavrov", "Vozac" );
         System.out.println(v1);
         Putnik p1 = new Putnik("Petar Petrovic", 1000);
         System.out.println(p1);
         Autobus a1 = new Autobus ("Presto", 500, v1, p1);
         System.out.println(a1);
     }
 
 }