package Problema8.classes;

public abstract class Nod {

    private String numeAngajat;

    public Nod(String numeAngajat) {
        this.numeAngajat = numeAngajat;
    }

    public String getNumeAngajat() {
        return numeAngajat;
    }

    public abstract void adaugaNod(Nod nod);

    public abstract void stergeNod(Nod nod);

    public abstract Nod getNodCopil(int index);

    public abstract void afisareDescriereNod(String indentare);
}