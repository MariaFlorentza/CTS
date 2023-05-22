package ro.ase.acs.state;

public class DeliveringProductState implements VendingMachineState{
    @Override
    public void displayMessage() {
        System.out.println("Please pick your product!");
    }
}
