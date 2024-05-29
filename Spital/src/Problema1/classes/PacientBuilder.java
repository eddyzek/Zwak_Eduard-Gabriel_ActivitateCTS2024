package Problema1.classes;

import Problema1.interfaces.Builder;

public class PacientBuilder implements Builder {
    private Pacient pacient;

    public PacientBuilder(String nume, int varsta) {
        pacient = new Pacient(nume, varsta, false, false, false, false);
    }

    public PacientBuilder setArePatRabatabil(final boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreMicDejunInclus(final boolean areMicDejunInclus) {
        this.pacient.setAreMicDejunInclus(areMicDejunInclus);
        return this;
    }

    public PacientBuilder setArePapuci(final boolean arePapuci) {
        this.pacient.setArePapuci(arePapuci);
        return this;
    }

    public PacientBuilder setAreHalat(final boolean areHalat) {
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}