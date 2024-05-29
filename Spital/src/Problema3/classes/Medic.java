package Problema3.classes;

public class Medic extends PersonalSpital {
    public Medic(String nume, String telefon, float salariu) {
        super(nume, telefon, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicul " + getNume() + " are salariul de " + getSalariu() +
                " lei si poate fi contactat la numarul de telefon: " + getTelefon());
    }
}