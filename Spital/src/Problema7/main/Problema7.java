package Problema7.main;

import Problema7.classes.ProviderRezultatAnalize;
import Problema7.classes.RezultatAnalize;
import Problema7.decorator.DecoratorRezultatAnalize;
import Problema7.decorator.RezultatAnalizeOnline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problema7 {
    public static void main(String[] args) {

        List<String> simptome = new ArrayList<>(Arrays.asList("febra", "frisoare"));

        ProviderRezultatAnalize rezultatPrintat = new RezultatAnalize("gripa", simptome, false);
        System.out.println("\n<-----Rezultat normal----->\n");
        rezultatPrintat.printeazaRezultatAnaliza();

        DecoratorRezultatAnalize rezultatOnline = new RezultatAnalizeOnline(rezultatPrintat);
        System.out.println("\n<-----Rezultat decorator----->\n");
        rezultatOnline.printeazaRezultatAnaliza();
        rezultatOnline.revenireLaPrintareaFizica();
    }
}