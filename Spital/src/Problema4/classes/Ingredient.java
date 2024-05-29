package Problema4.classes;

public class Ingredient {
    private String denumire;
    private int cantitate;

    public Ingredient(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "denumire='" + denumire + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}