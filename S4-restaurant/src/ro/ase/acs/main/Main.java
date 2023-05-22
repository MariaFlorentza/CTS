package ro.ase.acs.main;

import ro.ase.acs.decorator.Categorie;
import ro.ase.acs.decorator.MeniuZi;
import ro.ase.acs.decorator.Produs;
import ro.ase.acs.decorator.ToppingDecorator;
import ro.ase.acs.interfaces.IProdus;
import ro.ase.acs.interfaces.SpecificDecorator;

public class Main {
    public static void main(String[] args) {
        IProdus produs1 = new Produs("Pizza Margherita", 25.0f);
        IProdus produs2 = new Produs("Paella Valenciana", 35.0f);

        SpecificDecorator produs1CuTopping = new ToppingDecorator(produs1, "italian");
        SpecificDecorator produs2CuTopping = new ToppingDecorator(produs2, "spaniol");

        System.out.println("Produs 1: " + produs1CuTopping.getDescriereIngrediente() + ", pret: " + produs1CuTopping.getPret());
        System.out.println("Produs 2: " + produs2CuTopping.getDescriereIngrediente() + ", pret: " + produs2CuTopping.getPret());


        IProdus produs3 = new Produs("Paste Carbonara", 20.0f);
        IProdus produs4 = new Produs("Tiramisu", 12.0f);

        MeniuZi meniuZi = new MeniuZi();
        meniuZi.adaugaComponenta(produs1);
        meniuZi.adaugaComponenta(produs2);

        Categorie meniuRestaurant = new Categorie("Mic dejun");
        meniuRestaurant.adaugaComponenta(meniuZi);
        meniuRestaurant.adaugaComponenta(produs3);
        meniuRestaurant.adaugaComponenta(produs4);

        System.out.println("Descrierea meniului: ");
        System.out.println(meniuRestaurant.getDescriereIngrediente());
        System.out.println("Prețul meniului: " + meniuRestaurant.getPret());

    }
}