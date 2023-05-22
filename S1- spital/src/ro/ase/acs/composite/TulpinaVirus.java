package ro.ase.acs.composite;

import ro.ase.acs.interfaces.IVirus;

public class TulpinaVirus implements IVirus {
    private String numeTulpina;
    private int numarCazuri;
    private float rataMortalitate;

    public TulpinaVirus(String numeTulpina, int numarCazuri, float rataMortalitate) {
        this.numeTulpina = numeTulpina;
        this.numarCazuri = numarCazuri;
        this.rataMortalitate = rataMortalitate;
    }

    public int getNumarCazuri() {
        return numarCazuri;
    }

    @Override
    public float getRataMortalitate() {
        return rataMortalitate;
    }

    @Override
    public String getDenumire() {
        return numeTulpina;
    }
}
