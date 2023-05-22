package ro.ase.acs.classes;

import ro.ase.acs.interfaces.IProdus;

import java.util.ArrayList;

public class ProdusDecoratorRecomandari implements IProdus {
    private IProdus produs;
    private ArrayList<String> recomandari;

    public ProdusDecoratorRecomandari(IProdus produs, ArrayList<String> recomandari) {
        this.produs = produs;
        this.recomandari = recomandari;
    }

    @Override
    public float getPret() {
        return produs.getPret();
    }

    @Override
    public ArrayList<String> getRecenzii() {
        return produs.getRecenzii();
    }
}
