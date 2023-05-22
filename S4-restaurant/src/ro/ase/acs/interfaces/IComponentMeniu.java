package ro.ase.acs.interfaces;

import java.util.List;

public interface IComponentMeniu extends IProdus{
    void adaugaComponenta(IProdus produs);
    void eliminaComponenta(IProdus produs);
    List<IProdus> getComponente();
}
