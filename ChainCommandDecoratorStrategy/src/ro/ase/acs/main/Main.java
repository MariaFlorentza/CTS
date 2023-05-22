package ro.ase.acs.main;

import ro.ase.acs.chain.CallCenterManager;
import ro.ase.acs.chain.CallCenterOperator;
import ro.ase.acs.chain.ChiefFinancialOfficer;
import ro.ase.acs.command.BurgerOrder;
import ro.ase.acs.command.Chef;
import ro.ase.acs.command.PizzaOrder;
import ro.ase.acs.command.Waiter;
import ro.ase.acs.decorator.Car;
import ro.ase.acs.decorator.CarWithAlarm;
import ro.ase.acs.decorator.CarWithSportSeats;
import ro.ase.acs.decorator.Vehicle;
import ro.ase.acs.strategy.Calculator;
import ro.ase.acs.strategy.StrategyNotSetException;
import ro.ase.acs.strategy.SumOperation;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        car.stop();

        CarWithAlarm carWithAlarm = new CarWithAlarm(car);
        carWithAlarm.activateAlarm();

        CarWithSportSeats carWithSportSeats =
                new CarWithSportSeats(car);
        carWithSportSeats.setSeatProducer("Recaro");

        CallCenterOperator operator = new CallCenterOperator();
        CallCenterManager manager = new CallCenterManager();
        ChiefFinancialOfficer cfo = new ChiefFinancialOfficer();

        operator.setNextHandler(manager);
        manager.setNextHandler(cfo);
        operator.refund(700);
        operator.refund(2000);
        operator.refund(6000);


        Waiter waiter = new Waiter();
        Chef chef = new Chef();
        waiter.takeOrder(new PizzaOrder(chef));
        waiter.takeOrder(new PizzaOrder(chef));
        waiter.takeOrder(new BurgerOrder(chef));
        waiter.sendOrdersToChef();

        Calculator calculator = new Calculator();
        calculator.setOperation(new SumOperation());
        try {
            Double result = calculator.calculate(4, 6, 8);
            System.out.println(result);
        } catch (StrategyNotSetException e) {
            throw new RuntimeException(e);
        }
    }
}