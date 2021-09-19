public class Kicmenjaci extends Zivotinje{

    public Kicmenjaci(String vrsta, String naziv, String hrana) {
        super(vrsta, naziv, hrana);
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n");
        return sb.toString();
    }

}
public class Ribe extends Kicmenjaci{

    /*
    Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj peraja, vrsta peraja
     */
    private String voda;
    private int brPeraja;
    private String vrstaPeraja;

    public Ribe(String vrsta, String naziv, String hrana, String voda, int brPeraja, String vrstaPeraja ) {
        super(vrsta, naziv, hrana);
        this.brPeraja = brPeraja;
        this.voda = voda;
        this.vrstaPeraja = vrstaPeraja;
    }

    public String getVoda() {
        return voda;
    }

    public int getBrPeraja() {
        return brPeraja;
    }

    public String getVrstaPeraja() {
        return vrstaPeraja;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Voda u kojoj zivi: ").append(voda);
        sb.append("\n");
        sb.append("Ima ukupno ").append(brPeraja).append(" peraja, dok joj je ledjno peraje ").append(vrstaPeraja).append(".");
        return sb.toString();
    }
}
public class Sisari extends Kicmenjaci{
    /*
    Sisari su kicmenjaci koje se razlikuju po boji dlake,
    nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na divlje i domace
     */

    private String bojaDlake;
    private String nacinIshrane;
    private String uloga;

    public Sisari(String vrsta, String naziv, String hrana, String bojaDlake, String nacinIshrane) {
        super(vrsta, naziv, hrana);
        this.bojaDlake = bojaDlake;
        this.nacinIshrane = nacinIshrane;
    }

    public String getBojaDlake() {
        return bojaDlake;
    }

    public String getNacinIshrane() {
        return nacinIshrane;
    }

    public String getUloga() {
        return uloga;
    }

    // mogu da menjaju boju dlake
    public void setBojaDlake(String bojaDlake) {
        this.bojaDlake = bojaDlake;
    }

    // mogu da menjaju "ulogu" koju im je covek dodelio
    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" sto znaci da je u stvari ").append(nacinIshrane).append(".");
        sb.append("\n");
        sb.append(" Dlaka ovoj zivotinji je ").append(bojaDlake).append(".");
        sb.append("\n");
        sb.append("Covek je svrstava u kategoriju ").append(uloga).append(".");
        return sb.toString();
    }
}
import java.util.List;

public class Staniste {

    /*
    Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive.
    Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
     */

    private List<Zivotinje> zivotinje;
    private String naziv;

    public Staniste(List<Zivotinje> zivotinje, String naziv) {
        this.zivotinje = zivotinje;
        this.naziv = naziv;
    }

    public List<Zivotinje> getZivotinje() {
        return zivotinje;
    }

    public String getNaziv() {
        return naziv;
    }

    // nije naglaseno u zadatku, ali nove zivotinje mogu da se nastane negde
    public void dodajZivotinju(Zivotinje z) {
        zivotinje.add(z);
    }

    // nije naglaseno u zadatku ali zivotinje mogu da odu iz nekog stanista
    public void skloniZivotinju(Zivotinje z){
        zivotinje.remove(z);

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" u kom zive: ");
        for (int i = 0; i <zivotinje.size(); i++){
            sb.append(zivotinje.get(i).getNaziv()).append(" ");
        }
        return sb.toString();
    }
}
public class Zivotinje {

    /*
    U zoovrtu obitavaju razne zivotinje.
    Sve imaju svoju vrstu (kicmenjaci, beskicmenjaci), konkretan naziv i cime se hrane.
     */

    private String vrsta;
    private String naziv;
    private String hrana;

    public Zivotinje(String vrsta, String naziv, String hrana) {
        this.vrsta = vrsta;
        this.naziv = naziv;
        this.hrana = hrana;
    }

    public String getVrsta() {
        return vrsta;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getHrana() {
        return hrana;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("*** Zivotinja *** ");
        sb.append(naziv).append(", vrsta: ").append(vrsta).append("\n");
        sb.append("Omiljena hrana ovoj zivotinji su ").append(hrana);
        return sb.toString();
    }
}
import java.util.ArrayList;
import java.util.List;

public class Zoovrt {

    /*
    Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
    Ispisati bar jedno staniste.
    Jednom sisaru zameniti ulogu koju mu je covek dodelio.
     */

    public static void main(String[] args) {

        List<Zivotinje> zivotinje = new ArrayList<Zivotinje>();

        Sisari s1 = new Sisari("kicmenjak","panter",  "antilope", "crna", "mesojed");
        Sisari s2 = new Sisari("kicmenjak","svinja",  "pomije", "roze", "svastojed");
        Ribe r1 = new Ribe("kicmenjak", "skusa", "racici", "slana morska", 8, "racvasto");
        Ribe r2 = new Ribe("kicmenjak", "som", "druge ribe", "slatka recna", 7, "zaobljeno");

        s1.setUloga("divlje zivotinje");
        s2.setUloga("domace zivotinje");

        s2.setBojaDlake("sarena");


        zivotinje.add(s1);
        zivotinje.add(s2);
        zivotinje.add(r1);
        zivotinje.add(r2);
        zivotinje.remove(r1);

        Staniste st = new Staniste(zivotinje, "Zoovrt");

        System.out.println(st);
        System.out.println(r1);
        System.out.println(s2);
        s1.setUloga("ljubimac");
        System.out.println(s1);
    }
}
