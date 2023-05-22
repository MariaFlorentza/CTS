package ro.ase.acs.chain;

import ro.ase.acs.interfaces.DecoratorItem;
import ro.ase.acs.interfaces.Item;

public class Decorator implements DecoratorItem {
    protected Item item;
    @Override
    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public void incarcaInPagina() {
        if (item != null) {
            item.incarcaInPagina();
        }
    }

    @Override
    public void getDescriere() {
        if (item != null) {
            item.getDescriere();
        }
    }
}
