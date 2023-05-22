package ro.ase.acs.classes;

import ro.ase.acs.interfaces.IVizitator;

public class Vizitator implements IVizitator {
    private String nume;
    private Spital spital;
    private boolean areScrisoare;
    private boolean areHaineProtectie;

    public Vizitator(String nume, Spital spital, boolean areScrisoare, boolean areHaineProtectie) {
        this.nume = nume;
        this.spital = spital;
        this.areScrisoare = areScrisoare;
        this.areHaineProtectie = areHaineProtectie;
    }

    public void setAreScrisoare(boolean areScrisoare) {
        this.areScrisoare = areScrisoare;
    }

    public void setAreHaineProtectie(boolean areHaineProtectie) {
        this.areHaineProtectie = areHaineProtectie;
    }

    @Override
    public void intrareInSala() {
        if (areScrisoare && areHaineProtectie) {
            spital.adaugaVizitator();
        } else {
            System.out.println(nume + " nu îndeplinește cerințele pentru acces în saloane.");
        }
    }
}
