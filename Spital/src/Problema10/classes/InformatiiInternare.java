package Problema10.classes;

public class InformatiiInternare {

    private int numarPat;
    private int numarSalon;
    private int numarZileSpitalizare;

    public InformatiiInternare(int numarPat, int numarSalon, int numarZileSpitalizare) {
        this.numarPat = numarPat;
        this.numarSalon = numarSalon;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        return "InformatiiInternare{" +
                "numarPat=" + numarPat +
                ", numarSalon=" + numarSalon +
                ", numarZileSpitalizare=" + numarZileSpitalizare +
                '}';
    }
}