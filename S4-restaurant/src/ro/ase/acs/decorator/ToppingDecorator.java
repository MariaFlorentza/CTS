package ro.ase.acs.decorator;

import ro.ase.acs.interfaces.IProdus;
import ro.ase.acs.interfaces.SpecificDecorator;

public class ToppingDecorator implements SpecificDecorator {
    private IProdus produs;
    private String specific;

    public ToppingDecorator(IProdus produs, String specific) {
        this.produs = produs;
        this.specific = specific;
    }
    @Override
    public String getDescriereIngrediente() {
        return produs.getDescriereIngrediente() + " cu topping " + specific;

    }

    @Override
    public float getPret() {
        return produs.getPret();
    }

    @Override
    public String getSpecific() {
        return specific;
    }
}
