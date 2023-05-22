package ro.ase.acs.main;

import ro.ase.acs.chain.DecoratorFiltrareImagini;
import ro.ase.acs.chain.DecoratorSetariParagraf;
import ro.ase.acs.chain.Element;
import ro.ase.acs.classes.OptiuneVizualizare;
import ro.ase.acs.classes.Produs;
import ro.ase.acs.classes.ProdusDecoratorRecomandari;
import ro.ase.acs.classes.ProdusVizualizareCrescator;
import ro.ase.acs.interfaces.IProdus;
import ro.ase.acs.interfaces.IProdusVizualizare;
import ro.ase.acs.interfaces.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IProdus produs1 = new Produs(10.99f, new ArrayList<>());
        IProdus produs2 = new Produs(5.99f, new ArrayList<>());
        IProdus produs3 = new Produs(8.99f, new ArrayList<>());

        // Adăugare recomandări de sănătate la produse
        produs1 = new ProdusDecoratorRecomandari(produs1, new ArrayList<>(Arrays.asList("Recomandare 1", "Recomandare 2")));
        produs2 = new ProdusDecoratorRecomandari(produs2, new ArrayList<>(Arrays.asList("Recomandare 3")));
        produs3 = new ProdusDecoratorRecomandari(produs3, new ArrayList<>(Arrays.asList("Recomandare 4", "Recomandare 5", "Recomandare 6")));

        IProdusVizualizare optiune1 = new ProdusVizualizareCrescator();

        // Creare utilizator
        OptiuneVizualizare utilizator = new OptiuneVizualizare();

        // Setare opțiuni de vizualizare pentru utilizator
        utilizator.setStrategie(optiune1);
        utilizator.afisareProduse(Arrays.asList(produs1, produs2, produs3));


        Item paragraf = new Element("Acesta este un paragraf de text.");
        Item imagine = new Element("Imagine1");

        DecoratorFiltrareImagini decoratorFiltrareImagini = new DecoratorFiltrareImagini();
        DecoratorSetariParagraf decoratorSetariParagraf = new DecoratorSetariParagraf();

        decoratorFiltrareImagini.setItem(paragraf);
        decoratorSetariParagraf.setItem(imagine);

        decoratorFiltrareImagini.incarcaInPagina();
        decoratorSetariParagraf.incarcaInPagina();
    }
}