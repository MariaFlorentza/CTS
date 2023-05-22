package ro.ase.acs.classes;

import ro.ase.acs.interfaces.IProdus;
import ro.ase.acs.interfaces.IProdusVizualizare;

import java.util.ArrayList;

public class Produs implements IProdus {
    private float pret;
    private ArrayList<String> recenzii;

    public Produs(float pret, ArrayList<String> recenzii) {
        this.pret = pret;
        this.recenzii = recenzii;
    }

    @Override
    public float getPret() {
        return pret;
    }

    @Override
    public ArrayList<String> getRecenzii() {
        return recenzii;
    }
}
