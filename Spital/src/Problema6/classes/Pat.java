package Problema6.classes;

import Problema6.enums.StarePat;

public class Pat {
    int nrPat;
    Pacient pacient;

    StarePat starePat;


    public Pat(int nrPat) {
        this.nrPat = nrPat;
        this.starePat = starePat.LIBER;
        this.pacient = new Pacient();
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public void setStarePat(StarePat starePat) {
        this.starePat = starePat;
    }

    @Override
    public String toString() {
        return "Pat{" +
                "nrPat=" + nrPat +
                ", pacient=" + pacient +
                ", starePat=" + starePat +
                '}';
    }
}