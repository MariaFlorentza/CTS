package ro.ase.acs.main;

import ro.ase.acs.classes.Spital;
import ro.ase.acs.classes.SpitalPrivat;
import ro.ase.acs.classes.SpitalStat;
import ro.ase.acs.flyweight.Reteta;
import ro.ase.acs.flyweight.RetetaFactory;

public class Main {
    public static void main(String[] args) {
        Spital spitalStat = new SpitalStat();
        Spital spitalPrivat = new SpitalPrivat();

        System.out.println("Protocol preluare caz medical în spitalul de stat:");
        spitalStat.preluareCazMedical();

        System.out.println("\nProtocol preluare caz medical în spitalul privat:");
        spitalPrivat.preluareCazMedical();

        RetetaFactory retetaFactory = new RetetaFactory();

        Reteta reteta1 = new Reteta("Pacient1", "Diag1", retetaFactory.getInformatiiSanatateGenerale("Recomandari1"));
        Reteta reteta2 = new Reteta("Pacient2", "Diag2", retetaFactory.getInformatiiSanatateGenerale("Recomandari2"));
        Reteta reteta3 = new Reteta("Pacient3", "Diag3", retetaFactory.getInformatiiSanatateGenerale("Recomandari1"));

        reteta1.printeazaReteta();
        reteta2.printeazaReteta();
        reteta3.printeazaReteta();

        for (int i = 0; i < 10; i++) {
            Reteta reteta = new Reteta("Pacient" + (i + 1), "Diagnostic" + (i + 1), retetaFactory.getInformatiiSanatateGenerale("Recomandari"));
            reteta.printeazaReteta();
        }
    }
}