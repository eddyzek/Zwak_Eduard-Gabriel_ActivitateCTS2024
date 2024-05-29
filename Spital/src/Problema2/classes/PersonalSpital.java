package Problema2.classes;

public abstract class PersonalSpital {
    private String nume;
    private String telefon;
    private float salariu;

    public PersonalSpital(String nume, String telefon, float salariu) {
        this.nume = nume;
        this.telefon = telefon;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public float getSalariu() {
        return salariu;
    }

    public abstract void afisareDetalii();
}