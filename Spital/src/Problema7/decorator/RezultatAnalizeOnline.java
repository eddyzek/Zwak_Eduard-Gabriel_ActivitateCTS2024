package Problema7.decorator;

import Problema7.classes.ProviderRezultatAnalize;

public class RezultatAnalizeOnline extends DecoratorRezultatAnalize {

    public RezultatAnalizeOnline(ProviderRezultatAnalize rezultatAnalize) {
        super(rezultatAnalize);
    }

    @Override
    public void revenireLaPrintareaFizica() {
        System.out.println("Se va reveni la forma initiala de printare a rezultatelor");
    }
}