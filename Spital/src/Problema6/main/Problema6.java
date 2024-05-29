package Problema6.main;

import Problema6.classes.Facade;
import Problema6.classes.Pacient;
import Problema6.classes.Salon;

public class Problema6 {

    public static void prelucrareInternare(Pacient pacient, Salon salon) {
        if (Facade.necesitaInternare(pacient, salon)) {
            salon.ocuparePat(pacient);
            System.out.println("Pacientul " + pacient.getNumePacient() + " a fost internat.");
        } else if (!salon.existaPaturiDisponibile()) {
            System.out.println("Pacientul " + pacient.getNumePacient()
                    + " nu poate fi internat deoarece nu sunt paturi disponibile");
        } else {
            System.out.println("Pacientul " + pacient.getNumePacient() + " nu are nevoie de internare.");
        }
    }

    public static void main(String[] args) {

        Pacient pacient1 = new Pacient("Alexandru", 6);
        Pacient pacient2 = new Pacient("Andrei", 8);
        Pacient pacient3 = new Pacient("Ion", 2);
        Pacient pacient4 = new Pacient("Gheorghe", 3);

        Salon salon = new Salon(3);

        salon.afisarePaturiDisponibile();
        salon.afisarePaturiOcupate();

        prelucrareInternare(pacient1, salon);
        prelucrareInternare(pacient2, salon);
        prelucrareInternare(pacient3, salon);
        prelucrareInternare(pacient4, salon);

        salon.afisarePaturiDisponibile();
        salon.afisarePaturiOcupate();
    }
}