package Problema8.main;

import Problema8.classes.*;

public class Problema8 {
    public static void main(String[] args) throws UnsupportedOperationException, IndexOutOfBoundsException {
        Nod cardiologie = new Departament("Departament1", "Andrei");
        Nod oftalmologie = new Departament("Departament2", "Alexandru");

        Nod terapieIntensiva = new Sectie("Sectie1", 3, "Liviu");
        Nod donare = new Sectie("Sectie2", 7, "Ion");
        Nod optometrie = new Sectie("Sectie3", 4, "Simona");

        cardiologie.adaugaNod(terapieIntensiva);
        cardiologie.adaugaNod(donare);

        oftalmologie.adaugaNod(optometrie);

        Nod spital = new Departament("Departament3", "Mihai");
        spital.adaugaNod(oftalmologie);
        spital.adaugaNod(cardiologie);

        spital.afisareDescriereNod("   ");

        System.out.println("\n");

        cardiologie.stergeNod(terapieIntensiva);
        spital.afisareDescriereNod("   ");

        System.out.println();
        cardiologie.getNodCopil(0).afisareDescriereNod("");
    }
}