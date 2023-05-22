package ro.ase.acs.composite;

import ro.ase.acs.classes.Virus;
import ro.ase.acs.interfaces.IVirus;

import java.util.ArrayList;
import java.util.List;

public class Continent implements IVirus {
    private String numeContinent;
    private List<Virus> tulpiniVirus;
    private List<Tara> tari;

    public Continent(String numeContinent) {
        this.numeContinent = numeContinent;
        this.tulpiniVirus = new ArrayList<>();
        this.tari = new ArrayList<>();
    }

    public void addTara(Tara tara) {
        tari.add(tara);
    }

    @Override
    public float getRataMortalitate() {
        float rataMortalitateMedie = 0;
        int numarTari = tari.size();
        if (numarTari > 0) {
            for (Tara tara : tari) {
                rataMortalitateMedie += tara.getRataMortalitate();
            }
            rataMortalitateMedie /= numarTari;
        }
        return rataMortalitateMedie;
    }

    @Override
    public String getDenumire() {
        return numeContinent;
    }

    @Override
    public int getNumarCazuri() {
        int numarTotalCazuri = 0;
        for (Tara tara : tari) {
            numarTotalCazuri += tara.getNumarCazuri();
        }
        return numarTotalCazuri;
    }
}
