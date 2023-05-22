package ro.ase.acs.classes;

import ro.ase.acs.interfaces.IProdus;
import ro.ase.acs.interfaces.IProdusVizualizare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProdusVizualizareDescreescator implements IProdusVizualizare {
    @Override
    public void afisareProduse(List<IProdus> listaProduse) {
        Collections.sort(listaProduse, Comparator.comparing(IProdus::getPret));
        for(IProdus produs:listaProduse) {
            System.out.println("Produs: " + produs + " pret: " + produs.getPret());
        }
    }
}
