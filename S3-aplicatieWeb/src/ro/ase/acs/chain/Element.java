package ro.ase.acs.chain;

import ro.ase.acs.interfaces.Item;

public class Element implements Item {
    private String descriere;

    public Element(String descriere) {
        this.descriere = descriere;
    }
    @Override
    public void incarcaInPagina() {
        System.out.println("Incarcare element: " + descriere);
    }

    @Override
    public void getDescriere() {
        System.out.println("Descriere element: " + descriere);
    }
}
