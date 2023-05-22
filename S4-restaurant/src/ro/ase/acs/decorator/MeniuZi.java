package ro.ase.acs.decorator;

import ro.ase.acs.interfaces.IComponentMeniu;
import ro.ase.acs.interfaces.IProdus;

import java.util.ArrayList;
import java.util.List;

public class MeniuZi implements IComponentMeniu {
    private List<IProdus> componente;

    public MeniuZi() {
        this.componente = new ArrayList<>();
    }
    @Override
    public void adaugaComponenta(IProdus produs) {
        componente.add(produs);
    }

    @Override
    public void eliminaComponenta(IProdus produs) {
        componente.remove(produs);

    }

    @Override
    public List<IProdus> getComponente() {
        return componente;
    }

    @Override
    public String getDescriereIngrediente() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meniul zilei:\n");
        for (IProdus produs : componente) {
            sb.append("- ").append(produs.getDescriereIngrediente()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public float getPret() {
        float total = 0.0f;
        for (IProdus produs : componente) {
            total += produs.getPret();
        }
        return total * 0.9f; // Aplicăm discountul de 10%

    }
}
