package ro.ase.acs.composite;

import ro.ase.acs.classes.Virus;
import ro.ase.acs.interfaces.IVirus;

import java.util.ArrayList;
import java.util.List;

public class Tara implements IVirus {
    private String numeTara;
    private List<Virus> tulpiniVirus;

    public Tara(String numeTara) {
        this.numeTara = numeTara;
        this.tulpiniVirus = new ArrayList<>();
    }

    public void addVirus(Virus virus) {
        tulpiniVirus.add(virus);
    }

    public int getNumarCazuri() {
        int numarTotalCazuri = 0;
        for (Virus virus : tulpiniVirus) {
            numarTotalCazuri += virus.getNumarCazuri();
        }
        return numarTotalCazuri;
    }

    @Override
    public float getRataMortalitate() {
        float rataMortalitateMedie = 0;
        int numarTulpini = tulpiniVirus.size();
        if (numarTulpini > 0) {
            for (Virus virus : tulpiniVirus) {
                rataMortalitateMedie += virus.getRataMortalitate();
            }
            rataMortalitateMedie /= numarTulpini;
        }
        return rataMortalitateMedie;
    }




    public String getDenumire() {
        return numeTara;
    }
}
