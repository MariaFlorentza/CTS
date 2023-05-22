package ro.ase.acs.classes;

import ro.ase.acs.interfaces.IObserver;
import ro.ase.acs.interfaces.ISpital;
import ro.ase.acs.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISubject {
    private List<IObserver> observers;
    private int numarVizitatori;

    public Spital() {
        observers = new ArrayList<>();
        numarVizitatori = 0;
    }

    public void adaugaVizitator() {
        numarVizitatori++;

        if (numarVizitatori >= 5) {
            equipVizitatori();
            notifyObservers();
        }
    }

    private void equipVizitatori() {
        System.out.println("Echipare vizitatori cu haine de protecție.");
    }
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
