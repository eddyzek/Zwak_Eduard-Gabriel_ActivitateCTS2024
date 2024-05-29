package Problema8.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament extends Nod {

    private List<Nod> listaNoduri;
    private String directorDepartament;

    public Departament(String nume, String directorDepartament) {
        super(nume);
        this.directorDepartament = directorDepartament;
        this.listaNoduri = new ArrayList<>();
    }

    @Override
    public void adaugaNod(Nod nod) {
        this.listaNoduri.add(nod);
    }

    @Override
    public void stergeNod(Nod nod) {
        this.listaNoduri.remove(nod);
    }

    @Override
    public Nod getNodCopil(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < this.listaNoduri.size()) {
            return this.listaNoduri.get(index);
        }

        throw new IndexOutOfBoundsException("Index-ul specificat nu exista");
    }

    @Override
    public void afisareDescriereNod(String indentare) {
        System.out.println(indentare + "Departamentul " + super.getNumeAngajat() + " este condus de "
                + this.directorDepartament + " si are urmatoarea componenta: ");

        for (Nod nod : listaNoduri) {
            nod.afisareDescriereNod(indentare + "   ");
        }
    }
}