package ro.ase.acs.main;

import ro.ase.acs.Spital;
import ro.ase.acs.interfaces.ISpital;
import ro.ase.acs.interfaces.Vizitator;
import ro.ase.acs.proxy.VizitatorProxy;

public class Main {
    public static void main(String[] args) {
        ISpital spital=new Spital();

        Vizitator v1=new VizitatorProxy("Ion", "Scrisoare acceptare", true, spital);
        Vizitator v2=new VizitatorProxy("Dan", "Scrisoare acceptare", true, spital);
        Vizitator v3=new VizitatorProxy("Alex", "Scrisoare acceptare", true, spital);
        Vizitator v4=new VizitatorProxy("Andrei", "Scrisoare acceptare", true, spital);
        Vizitator v5=new VizitatorProxy("Andi", "Scrisoare acceptare", true, spital);
        Vizitator v6=new VizitatorProxy("David", "Scrisoare acceptare", true, spital);
        Vizitator v7=new VizitatorProxy("Denis", "Scrisoare acceptare", true, spital);

        spital.accesSalon(v1);
        spital.accesSalon(v2);
        spital.accesSalon(v3);
        spital.accesSalon(v4);
        spital.accesSalon(v5);
        spital.accesSalon(v6);
        spital.accesSalon(v7);




    }
}