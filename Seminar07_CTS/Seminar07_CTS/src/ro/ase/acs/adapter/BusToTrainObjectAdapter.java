package ro.ase.acs.adapter;

public class BusToTrainObjectAdapter implements AbstractTrainTicket{
    private AbstractBusTicket busTicket;

    public BusToTrainObjectAdapter(AbstractBusTicket busTicket) {
        this.busTicket = busTicket;
    }

    @Override
    public void buyTicket(int wagonNumber, int seatNumber) {
        busTicket.reserveSeat();
    }
}
