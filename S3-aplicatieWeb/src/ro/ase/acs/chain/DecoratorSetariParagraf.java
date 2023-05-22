package ro.ase.acs.chain;

public class DecoratorSetariParagraf extends Decorator{
    @Override
    public void incarcaInPagina() {
        if (item != null) {
            // Modificare setări paragraf
            System.out.println("Modificare setări paragraf");
            item.incarcaInPagina();
        }
    }
}
