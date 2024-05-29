package Problema5.classes;

import Problema5.interfaces.Medicament;

public class MedicamentFarmacie implements Medicament {

    private String numeMedicament;

    public MedicamentFarmacie(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Ati cumparat produsul numit " + numeMedicament + " fara reteta.");
    }
}