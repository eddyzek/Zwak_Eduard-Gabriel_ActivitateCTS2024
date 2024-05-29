package Problema3.classes;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, String telefon, float salariu) {
        super(nume, telefon, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Asistentul " + getNume() + " are salariul de " + getSalariu() +
                " lei si poate fi contactat la numarul de telefon: " + getTelefon());
    }
}