package src5;

/*
Kreirati klasu Video Player koja ima:
 duzinu videa
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa (144, 240, 360, 480, 720, 1080)
 getere, setere i konstruktore
 metodu stampaj koja stampa podatke u formatu:
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa

Kreirati apstraktnu klasu Control koja ima:
apstraktnu metodu izvrsi akciju, koja kao parametar prima objekat VideoPlayer

Kreirati klasu TimeControl koja nasledjuje klasu Control i konstruktore, 
ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean), 
implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.

Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i konstruktore. 
Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean). 
Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100.

Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i 
ima brzinu interneta u megabitima npr 10mb/s 20mb/s...
 Getere, setere i konstruktore. Implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od
 brzine interneta.
 Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde se uzima prvi veci kvalitet
 ako je brzina 20 * 10.1 = 204 - postavlja 240;
 ako je brzina 5*10.1 = 50.5 - postavlja 144;
 ako je brzina 20*10.1 = 505 - postavlja 720;U glavnom programu kreirati video player i izvrsiti neke akcije nad njim

 U glavnom programu kreirati listu akcija i izvrsiti ih nad istim playerom


*/
 
 public class VideoPlayer {
 
     private int duzinaVidea;
     private int trenutnoVremeVidea;
     private int jacinaZvuka;
     private int kvalitetVidea;
 
     public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
         super();
         this.duzinaVidea = duzinaVidea;
         this.trenutnoVremeVidea = trenutnoVremeVidea;
         this.jacinaZvuka = jacinaZvuka;
         this.kvalitetVidea = kvalitetVidea;
     }
 
     public int getDuzinaVidea() {
         return duzinaVidea;
     }
 
     public void setDuzinaVidea(int duzinaVidea) {
         this.duzinaVidea = duzinaVidea;
     }
 
     public int getTrenutnoVremeVidea() {
         return trenutnoVremeVidea;
     }
 
     public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
         this.trenutnoVremeVidea = trenutnoVremeVidea;
     }
 
     public int getJacinaZvuka() {
         return jacinaZvuka;
     }
 
     public void setJacinaZvuka(int jacinaZvuka) {
         this.jacinaZvuka = jacinaZvuka;
     }
 
     public int getKvalitetVidea() {
         return kvalitetVidea;
     }
 
     public void setKvalitetVidea(int kvalitetVidea) {
         this.kvalitetVidea = kvalitetVidea;
     }
 
     public void stampaj() {
         System.out.println("Trenutno vreme videa: " + trenutnoVremeVidea + " min\nJacina zvuka: " + jacinaZvuka
                 + "%\nKvalitet videa: " + kvalitetVidea + "p");

package src5;
 
 public abstract class Control {
 
     public abstract void izvrsiAkciju(VideoPlayer player);


package src5;
 
 public class TimeControl extends Control {
     private boolean menjaVreme; 
 
     public TimeControl(boolean menjaVreme) {
         super();
         this.menjaVreme = menjaVreme;
     }
 
     @Override
     public void izvrsiAkciju(VideoPlayer player) {
         if (!menjaVreme) {
             if (player.getTrenutnoVremeVidea() > 15) {
                 player.setTrenutnoVremeVidea(player.getTrenutnoVremeVidea() - 15);
             } else {
                 player.setTrenutnoVremeVidea(0);
             }
         } else {
             if (player.getDuzinaVidea() - player.getTrenutnoVremeVidea() > 15) {
                 player.setTrenutnoVremeVidea(player.getTrenutnoVremeVidea() + 15);
             } else {
                 player.setTrenutnoVremeVidea(player.getDuzinaVidea());
             }
 
         }
     }
 }

package src5;
 
 public class AudioControl extends Control {
     private boolean menjaZvuk; 
 
     public AudioControl(boolean menjaZvuk) {
         super();
         this.menjaZvuk = menjaZvuk;
     }
 
     @Override
     public void izvrsiAkciju(VideoPlayer player) {
         if (!this.menjaZvuk) {
             if (player.getJacinaZvuka() > 0) {
                 player.setJacinaZvuka(player.getJacinaZvuka() - 1);
             } else {
                 System.out.println("Zvuk je iskljucen");
             }
         } else {
             if (player.getJacinaZvuka() < 100) {
                 player.setJacinaZvuka(player.getJacinaZvuka() + 1);
             } else {
                 System.out.println("Zvuk je max pojacan.");
             }
         }
 
     }
 
 }


package src5;
 
 import java.lang.Math;
 
 public class QualityOptimizerControl extends Control {
     private int brzinaInterneta;
     int[] kvalitet = { 144, 240, 720 };
 
     public QualityOptimizerControl(int brzinaInterneta) {
         super();
         this.brzinaInterneta = brzinaInterneta;
     }
 
     public int getBrzinaInterneta() {
         return brzinaInterneta;
     }
 
     public void setBrzinaInterneta(int brzinaInterneta) {
         this.brzinaInterneta = brzinaInterneta;
     }
 
     @Override
     public void izvrsiAkciju(VideoPlayer player) {
 
         double min = 10000000;
         int index = 0;
         for (int i = 0; i < kvalitet.length; i++) {
             double vrednost = (this.brzinaInterneta * 10.1) - this.kvalitet[i];
             if (Math.abs(vrednost) < min) {
                 min = vrednost;
                 index = i;
             }
         }
         player.setKvalitetVidea(this.kvalitet[index]);
 
     }
 
}


package src5;
 
 import java.util.ArrayList;
 
 public class KlasaGlavna5 {
 
     public static void main(String[] args) {
 
         VideoPlayer p1 = new VideoPlayer(90, 0, 50, 240);
         VideoPlayer p2 = new VideoPlayer(40, 20, 40, 144);
 
         QualityOptimizerControl qual1 = new QualityOptimizerControl(200);
         TimeControl t1 = new TimeControl(true);
         AudioControl a1 = new AudioControl(false);
 
         p1.stampaj();
         System.out.println("");
 
         qual1.izvrsiAkciju(p1);
         t1.izvrsiAkciju(p1);
         a1.izvrsiAkciju(p1);
         t1.izvrsiAkciju(p1);
         p1.stampaj();
 
         System.out.println("");
 
         ArrayList<Control> akcije = new ArrayList();
         akcije.add(qual1);
         akcije.add(t1);
         akcije.add(a1);
 
         for (int i = 0; i < akcije.size(); i++) {
             akcije.get(i).izvrsiAkciju(p2);
         }
         p2.stampaj();
 
     }
 
 }