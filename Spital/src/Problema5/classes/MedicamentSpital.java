package Problema5.classes;

import java.util.List;

public class MedicamentSpital {

    private String numeMedicament;
    private List<String> continutReteta;

    public MedicamentSpital(String numeMedicament, List<String> continutReteta) {
        this.numeMedicament = numeMedicament;
        this.continutReteta = continutReteta;
    }
    protected boolean prezintaReteta() {
        if (this.continutReteta.contains(this.numeMedicament)) {
            return true;
        }

        return false;
    }
    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("Ati cumparat produsul numit " + numeMedicament + " pe baza de reteta");
        } else {
            System.out.println("Ati cumparat produsul numit " + numeMedicament + " fara reteta");
        }
    }


}