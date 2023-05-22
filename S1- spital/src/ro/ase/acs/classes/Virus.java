package ro.ase.acs.classes;

import ro.ase.acs.interfaces.IVirus;

public class Virus implements IVirus {
    private String denumire;
    private float rataMortalitate;
    private int numarCazuri;

    public Virus(String denumire, float rataMortalitate, int numarCazuri) {
        this.denumire = denumire;
        this.rataMortalitate = rataMortalitate;
        this.numarCazuri=numarCazuri;
    }
    @Override
    public float getRataMortalitate() {
        return rataMortalitate;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    public int getNumarCazuri() {
        return numarCazuri;
    }
}
