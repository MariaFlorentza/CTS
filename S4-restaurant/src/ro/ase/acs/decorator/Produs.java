package ro.ase.acs.decorator;

import ro.ase.acs.interfaces.IProdus;

public class Produs implements IProdus {
    private String descriere;
    private float pret;

    public Produs(String descriere, float pret) {
        this.descriere = descriere;
        this.pret = pret;
    }

    @Override
    public String getDescriereIngrediente() {
        return descriere;
    }

    @Override
    public float getPret() {
        return pret;
    }
}
