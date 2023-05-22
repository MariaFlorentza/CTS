package ro.ase.acs.adapter;

public class BusToTrainClassAdapter extends BusTicket implements AbstractTrainTicket {
    @Override
    public void buyTicket(int wagonNumber, int seatNumber) {
        super.reserveSeat();
    }
}
