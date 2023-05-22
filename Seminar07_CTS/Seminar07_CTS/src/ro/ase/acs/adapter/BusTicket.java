package ro.ase.acs.adapter;

public class BusTicket implements AbstractBusTicket{
    private int numberOdSeats = 50;
    private int numberOfReservedSeats = 0;
    @Override
    public void reserveSeat() {
        if(numberOfReservedSeats < numberOdSeats) {
            numberOfReservedSeats++;
            System.out.println("Ticket issued");
        }
        else {
            throw new RuntimeException("Bus is full");
        }
    }
}
