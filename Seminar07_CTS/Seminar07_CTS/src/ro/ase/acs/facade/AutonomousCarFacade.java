package ro.ase.acs.facade;

public class AutonomousCarFacade {
    private Engine engine = new Engine();
    private BrakingSystem brakingSystem = new BrakingSystem();
    private LightingSystem lightingSystem = new LightingSystem();

    public void startCar() {
        brakingSystem.releaseBrakes();
        lightingSystem.lowBeam();
        engine.setLoad(10);
    }

    public void emergencyBrake() {
        engine.setLoad(0);
        brakingSystem.applyFromBrakes();
        brakingSystem.applyRearBrakes();
        lightingSystem.hazardLights();
    }
}
