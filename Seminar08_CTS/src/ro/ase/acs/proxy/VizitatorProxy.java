package ro.ase.acs.proxy;

import ro.ase.acs.interfaces.ISpital;
import ro.ase.acs.interfaces.Vizitator;

public class VizitatorProxy implements Vizitator {
    private String nume;
    private String scrisoareAcceptare;
    private boolean echipatHaineProtectie;
    private ISpital spital;

    public VizitatorProxy(String nume, String scrisoareAcceptare, boolean echipatHaineProtectie, ISpital spital) {
        this.nume = nume;
        this.scrisoareAcceptare = scrisoareAcceptare;
        this.echipatHaineProtectie = echipatHaineProtectie;
        this.spital = spital;
    }

    @Override
    public String getNume() {
        return null;
    }

    public void acceseazaSpital() {
        if(scrisoareAcceptare != null && echipatHaineProtectie){
            spital.accesSalon(this);
        } else
        {
            System.out.println("Accesul refuzat pentru vizitatorul" + nume);
        }
    }
}
