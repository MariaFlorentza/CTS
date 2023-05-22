package ro.ase.acs.main;

import ro.ase.acs.classes.Spital;
import ro.ase.acs.classes.Virus;
import ro.ase.acs.classes.Vizitator;
import ro.ase.acs.composite.Continent;
import ro.ase.acs.composite.Tara;
import ro.ase.acs.composite.TulpinaVirus;

public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital();

        Vizitator vizitator1 = new Vizitator("Vizitator 1", spital, true, true);
        Vizitator vizitator2 = new Vizitator("Vizitator 2", spital, true, true);
        Vizitator vizitator3 = new Vizitator("Vizitator 3", spital, true, true);
        Vizitator vizitator4 = new Vizitator("Vizitator 4", spital, true, true);
        Vizitator vizitator5 = new Vizitator("Vizitator 5", spital, true, true);
        Vizitator vizitator6 = new Vizitator("Vizitator 6", spital, true, true);
        Vizitator vizitator7 = new Vizitator("Vizitator 7", spital, true, true);

        vizitator1.setAreScrisoare(true);
        vizitator1.setAreHaineProtectie(true);

        vizitator2.setAreScrisoare(true);
        vizitator2.setAreHaineProtectie(true);

        vizitator3.setAreScrisoare(true);
        vizitator3.setAreHaineProtectie(true);

        vizitator4.setAreScrisoare(true);
        vizitator4.setAreHaineProtectie(true);

        vizitator5.setAreScrisoare(true);
        vizitator5.setAreHaineProtectie(true);

        vizitator6.setAreScrisoare(true);
        vizitator6.setAreHaineProtectie(false);

        vizitator7.setAreScrisoare(false);
        vizitator7.setAreHaineProtectie(true);

        vizitator1.intrareInSala();
        vizitator2.intrareInSala();
        vizitator3.intrareInSala();
        vizitator4.intrareInSala();
        vizitator5.intrareInSala();
        vizitator6.intrareInSala();
        vizitator7.intrareInSala();


        Virus virus1 = new Virus("Virus1", 0.2f, 100);
        Virus virus2 = new Virus("Virus2", 0.5f, 200);
        Virus virus3 = new Virus("Virus3", 0.8f, 300);

        Tara tara1 = new Tara("Tara1");
        tara1.addVirus(virus1);
        tara1.addVirus(virus2);

        Tara tara2 = new Tara("Tara2");
        tara2.addVirus(virus2);
        tara2.addVirus(virus3);

        Continent continent = new Continent("Continent");
        continent.addTara(tara1);
        continent.addTara(tara2);

        int totalCazuri = continent.getNumarCazuri();
        System.out.println("Numarul total de cazuri de virusuri: " + totalCazuri);


    }
}