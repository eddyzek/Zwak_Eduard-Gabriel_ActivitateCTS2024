package Problema3.classes;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, String telefon, float salariu) {
        super(nume, telefon, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Infirmierul " + getNume() + " are salariul de " + getSalariu() +
                " lei si poate fi contactat la numarul de telefon: " + getTelefon());
    }
}