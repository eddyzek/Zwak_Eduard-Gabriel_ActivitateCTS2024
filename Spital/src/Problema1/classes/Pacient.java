package Problema1.classes;

public class Pacient {
    private String nume;
    private int varsta;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuci;
    private boolean areHalat;

    Pacient(String nume, int varsta, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuci, boolean areHalat) {
        this.nume = nume;
        this.varsta = varsta;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
    }

    void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    void setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejunInclus=" + areMicDejunInclus +
                ", arePapuci=" + arePapuci +
                ", areHalat=" + areHalat +
                '}'+"\n";
    }
}