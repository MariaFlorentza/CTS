package ro.ase.acs.main;

import ro.ase.acs.adapter.*;
import ro.ase.acs.builder.FoodItem;
import ro.ase.acs.builder.FoodItemBuilder;
import ro.ase.acs.facade.AutonomousCarFacade;

public class Main {
    public static void main(String[] args) {
        FoodItemBuilder builder = new FoodItemBuilder();
        builder.addName("ciocolata");
        builder.addPrice(20);
        builder.addProducer("Milka");

        FoodItem foodItem = builder.build();
        System.out.println(foodItem);

        AutonomousCarFacade autonomousCarFacade = new AutonomousCarFacade();
        autonomousCarFacade.startCar();
        autonomousCarFacade.emergencyBrake();

        AbstractTrainTicket trainTicket = new TrainTicket();
        trainTicket.buyTicket(3, 47);

        BusTicket busTicket = new BusTicket();
        trainTicket = new BusToTrainObjectAdapter(busTicket);
        trainTicket.buyTicket(2, 28);

        trainTicket = new BusToTrainClassAdapter();
        trainTicket.buyTicket(2, 28);

    }
}