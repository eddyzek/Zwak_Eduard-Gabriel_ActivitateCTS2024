package Problema6.classes;

import Problema6.enums.StarePat;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Pat> paturiLibere;
    private List<Pat> paturiOcupate;

    public Salon(int capacitateSalon) {
        this.paturiLibere = new ArrayList<>();
        this.paturiOcupate = new ArrayList<>();

        for (int i = 0; i < capacitateSalon; i++) {
            this.paturiLibere.add(new Pat(i + 1));
        }
    }

    public void ocuparePat(Pacient pacient) {
        Pat patDisponibil = paturiLibere.get(0);

        patDisponibil.setPacient(pacient);
        patDisponibil.setStarePat(StarePat.OCUPAT);

        paturiOcupate.add(patDisponibil);
        paturiLibere.remove(patDisponibil);
    }

    public boolean existaPaturiDisponibile() {
        return !this.paturiLibere.isEmpty();
    }

    public void afisarePaturiDisponibile() {
        if (this.paturiLibere.isEmpty()) {
            System.out.println("Nu exista paturi disponibile.");
            return;
        }

        System.out.println("Sunt disponibile urmatoarele paturi:");

        for (Pat pat : this.paturiLibere) {
            System.out.println(pat);
        }
    }

    public void afisarePaturiOcupate() {
        if (this.paturiOcupate.isEmpty()) {
            System.out.println("Toate paturile sunt libere");
            return;
        }

        System.out.println("Paturile ocupate sunt urmatoarele: ");

        for (Pat pat : this.paturiOcupate) {
            System.out.println(pat);
        }
    }
}