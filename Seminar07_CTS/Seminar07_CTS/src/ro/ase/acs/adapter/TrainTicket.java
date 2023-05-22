package ro.ase.acs.adapter;

public class TrainTicket implements AbstractTrainTicket{
    private int numberOfWagons = 7;
    private int numberOfSeats = 100;

    @Override
    public void buyTicket(int wagonNumber, int seatNumber) {
        boolean isValidWagon = wagonNumber >= 1 && wagonNumber <= numberOfWagons;
        boolean isValidSeat = seatNumber >= 1 && seatNumber <= numberOfSeats;
        if(isValidWagon && isValidSeat) {
            System.out.println("Ticket issued for wagon: " + wagonNumber + ", seat: " + seatNumber);
        }
        else {
            throw new RuntimeException("Invalid data");
        }
    }
}
