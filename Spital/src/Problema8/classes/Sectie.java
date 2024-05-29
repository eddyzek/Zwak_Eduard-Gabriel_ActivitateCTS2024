package Problema8.classes;

public class Sectie extends Nod {

    private int numarAngajati;
    private String sefSectie;

    public Sectie(String nume, int numarAngajati, String sefSectie) {
        super(nume);
        this.numarAngajati = numarAngajati;
        this.sefSectie = sefSectie;
    }

    @Override
    public void adaugaNod(Nod nod) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Sectiile nu pot contine subsectii");
    }

    @Override
    public void stergeNod(Nod nod) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operatia de stergere nu este permisa pe sectii");
    }

    @Override
    public Nod getNodCopil(int index) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operatia de getNod nu este permisa pe sectii");
    }

    @Override
    public void afisareDescriereNod(String indentare) {
        System.out.println(indentare + "Sectia " + super.getNumeAngajat() + " este condusa de " +
                this.sefSectie + " si are " + this.numarAngajati + " angajati");
    }
}