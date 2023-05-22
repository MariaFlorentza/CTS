package ro.ase.acs.builder;

import java.time.LocalDate;

public class FoodItem {
    private String name;
    private String producer;
    private float price;
    private float discount;
    private LocalDate bestBefore;
    private boolean isVegan;

    private FoodItem() {
    }

    FoodItem(String name, String producer, float price, float discount, LocalDate bestBefore, boolean isVegan) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.discount = discount;
        this.bestBefore = bestBefore;
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", bestBefore=" + bestBefore +
                ", isVegan=" + isVegan +
                '}';
    }
}
