package ro.ase.acs.interfaces;

import java.util.ArrayList;

public interface IPaginaWeb {
    ArrayList<Item> getListaObiecte();
    void incarcaPaginaWeb();
}
