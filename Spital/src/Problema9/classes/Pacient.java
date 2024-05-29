package Problema9.classes;

import Problema9.interfaces.Persoana;

public class Pacient implements Persoana {

    private String numePacient;
    private int varsta;
    private boolean areAsigurare;

    public Pacient(String numePacient, int varsta, boolean areAsigurare) {
        this.numePacient = numePacient;
        this.varsta = varsta;
        this.areAsigurare = areAsigurare;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean hasAsigurareDeSanatate() {
        return this.areAsigurare;
    }

    @Override
    public void internare() {
        System.out.println("Pacientul " + this.numePacient + ", care are " + this.varsta + " de ani, se interneaza in spital si " + (this.areAsigurare ? "are" : "nu are") + " asigurare de sanatate");
    }
}