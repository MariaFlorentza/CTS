package ro.ase.acs.chain;

public class DecoratorFiltrareImagini extends Decorator{
    @Override
    public void incarcaInPagina() {
        if (item != null) {
            // Filtrare imagini
            System.out.println("Filtrare imagini");
            item.incarcaInPagina();
        }
    }
}
