package ro.ase.acs.facade;

public class BrakingSystem {
    private int load;

    public void applyFromBrakes(){
        load += 50;
        if(load > 100) {
            load = 100;
        }
    }

    public void applyRearBrakes() {
        load += 50;
        if(load > 100) {
            load = 100;
        }
    }

    public  void releaseBrakes() {
        load = 0;
    }

    public int getLoad() {
        return load;
    }
}
