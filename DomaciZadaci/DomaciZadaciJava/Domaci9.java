public class glumci_Class {
 
/*
Napraviti klasu Glumci koja ce imati public atribute:
 Ime i prezime, godina rodjenja, pol. 
Private atributi su: da li su ozenjeni ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova. 
Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, 
koliko godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena da se doda "Mr." ili "Mrs." 
ako su zenskog pola.
 Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova 
(pored naslova napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore ocenjenog filma od tih pet 
(preko getera i setera).


*/

     public String ime;
     public String prezime;
     public int rodjendan;
     public String pol;
     private boolean status;
     private double prosecnaZarada;
     private int brojSnimljenihfilmova;
     public double ukupnaZarada;
     public Glumci_Class() {
         
         
         
     }
     
     
     
     public void setstatus(boolean status) {
         this.status = status;
         
         
     }
     
     public boolean getstatus() {
         
         return this.status;
         
     }
 
     public void setprosecnaZarada(double prosek) {
         this.prosecnaZarada = prosek;
         
     }
     
     public double getprosecnaZarada() {
         return this.prosecnaZarada;
         
         
     }
     
     public void setbrojSnimljenih(int broj) {
         
         this.brojSnimljenihfilmova = broj;
         
         
     }
     
     public int getbrojSnimljenihfilmova() {
         
         return this.brojSnimljenihfilmova;
         
         
         
         
     }
     public double ukupnaZarada() {
         
         double ukupnaZarada = this.prosecnaZarada * this.brojSnimljenihfilmova;
         return ukupnaZarada;
     }
     
     public int sledeceGodine() {
         
         int sledeceGodine =  2022 - this.rodjendan;
         return sledeceGodine;
         
     }
     
   
         
         
     
     public void stampanje() {
         
         if(pol.equals("M")) {
             
             
         System.out.println("Name: Mr. " + ime + "\n" + "Lastname: " + prezime + "\n" + "Gender: " + pol + "\n" + "Married: "
         + status + "\n" + "Average salary: " + prosecnaZarada + "\n" + "Number of movies filmed: " + brojSnimljenihfilmova + "\n" + "Estimated worth: " 
         + ukupnaZarada() + "\n" + "Age next year: " + sledeceGodine());
             
         }else {
             
         System.out.println("Name: Mrs. " + ime + "\n" + "Lastname: " + prezime + "\n" + "Gender: " + pol + "\n" + "Married: "
         + status + "\n" + "Average salary: " + prosecnaZarada + "\n" + "Number of movies filmed: " + brojSnimljenihfilmova + "\n" + "Estimated worth: " 
         + ukupnaZarada() + "\n" + "Age next year: " + sledeceGodine());
             
             
         }
         }
         
         
         
     }



import java.util.ArrayList;
 
 public class Glumci_Main {
 
     public static void main(String[] args) {
              
         Glumci_Class glumac1 = new Glumci_Class();
         
         glumac1.ime = "Petar";
         glumac1.prezime = "Petrovic";
         glumac1.pol = "M";
         glumac1.rodjendan = 1990;
         glumac1.setstatus(false);
         glumac1.setprosecnaZarada(1005);
         glumac1.setbrojSnimljenihfilmova(40);
         glumac1.stampanje();
         
         ArrayList<String> Movies = new ArrayList<String>();
         Movies.add("Mi nismo andjeli 1 (9.0)");
         Movies.add("Mi nismo andjeli 2 (8.5)");
         Movies.add("Mi nismo andjeli 3 (7.0)");
         Movies.add("Mi nismo andjeli 4 (8.7)");
         Movies.add("Mi nismo andjeli 5 (9.5)");
         
         Object alt = Movies.get(0);
         Movies.set(0, Movies.get(4));
         Movies.set(4, (String) alt);
         alt = Movies.get(1);
         Movies.set(1, Movies.get(4));
         Movies.set(4, (String) alt);
         alt = Movies.get(2);
         Movies.set(2, Movies.get(3));
         Movies.set(3, (String) alt);
         alt = Movies.get(3);
         Movies.set(3, Movies.get(4));
         Movies.set(4, (String) alt);
     
         
         
         
         
         
         
         
         for(int i = 0; i < Movies.size(); i++) {
             
             System.out.println(Movies.get(i));
             
         }
             
          
     }
 
     }