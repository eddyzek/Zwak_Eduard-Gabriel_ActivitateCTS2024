package Problema4.classes;

import Problema4.interfaces.PrototipReteta;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements PrototipReteta {
    private int valabilitateReteta;
    private List<Ingredient> ingrediente;

    Reteta() {
        this.valabilitateReteta = 0;
        this.ingrediente = new ArrayList<>();
    }

    public Reteta(int valabilitateReteta, List<Ingredient> ingrediente) {
        this.valabilitateReteta = valabilitateReteta;
        this.ingrediente = new ArrayList<>(ingrediente);
    }

    public void setValabilitateReteta(int valabilitateReteta) {
        this.valabilitateReteta = valabilitateReteta;
    }

    public void setIngrediente(List<Ingredient> ingrediente) {
        this.ingrediente = new ArrayList<>(ingrediente);
    }

    @Override
    public String toString() {
        return "Ingredientele retetei sunt:\n" +
                ingrediente + "\nValabilitatea retetei este de " +
                valabilitateReteta + " zile\n";
    }

    @Override
    public PrototipReteta copiazaReteta() {
        Reteta copieReteta = new Reteta();

        copieReteta.valabilitateReteta = this.valabilitateReteta;
        copieReteta.ingrediente.addAll(this.ingrediente);

        return copieReteta;
    }
}