package ro.ase.acs.classes;

import ro.ase.acs.interfaces.IProdus;
import ro.ase.acs.interfaces.IProdusVizualizare;

import java.util.List;

public class OptiuneVizualizare implements IProdusVizualizare {
    private IProdusVizualizare strategie;

    public void setStrategie(IProdusVizualizare strategie) {
        this.strategie = strategie;
    }

    public void afisareProduse(List<IProdus> listaProduse) {
        strategie.afisareProduse(listaProduse);
    }
}
