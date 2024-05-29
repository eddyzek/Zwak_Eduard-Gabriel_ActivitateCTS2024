package Problema4.main;

import Problema4.classes.Ingredient;
import Problema4.classes.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
    public static void main(String[] args) {
        List<Ingredient> listaIngrediente = new ArrayList<>();

        listaIngrediente.add(new Ingredient("Ingredient1", 400));
        listaIngrediente.add(new Ingredient("Ingredient2",360));
        listaIngrediente.add(new Ingredient("Ingredient3",220));

        Reteta reteta1 = new Reteta(3, listaIngrediente);
        System.out.println("Reteta 1:\n"+reteta1);
        Reteta reteta2 = (Reteta) reteta1.copiazaReteta();
        System.out.println("Reteta 2 copiata:\n"+reteta2);


        listaIngrediente.clear();

        listaIngrediente.add(new Ingredient("Ingredient4",25));
        listaIngrediente.add(new Ingredient("Ingredient5",180));

        reteta2.setValabilitateReteta(6);
        reteta2.setIngrediente(listaIngrediente);

        System.out.println("\n==========\n");
        System.out.println("Reteta 2 noua:\n"+reteta2);
    }
}