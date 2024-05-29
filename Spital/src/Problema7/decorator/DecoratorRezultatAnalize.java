package Problema7.decorator;

import Problema7.classes.ProviderRezultatAnalize;

public abstract class DecoratorRezultatAnalize implements ProviderRezultatAnalize {

    protected ProviderRezultatAnalize rezultatAnalize;

    public DecoratorRezultatAnalize(ProviderRezultatAnalize rezultatAnalize) {
        this.rezultatAnalize = rezultatAnalize;
    }

    @Override
    public void printeazaRezultatAnaliza() {
        this.rezultatAnalize.printeazaRezultatAnaliza();
        System.out.println("Rezultatul este disponibil si online");
    }

    public abstract void revenireLaPrintareaFizica();
}