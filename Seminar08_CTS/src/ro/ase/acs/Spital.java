package ro.ase.acs;

import ro.ase.acs.interfaces.ISpital;
import ro.ase.acs.interfaces.Vizitator;

public class Spital implements ISpital {
    @Override
    public void accesSalon(Vizitator vizitator) {
        System.out.println("Acces permis pentru vizitatorul" + vizitator.getNume());
    }
}
