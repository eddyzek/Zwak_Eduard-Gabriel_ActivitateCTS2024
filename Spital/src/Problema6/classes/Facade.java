package Problema6.classes;

public class Facade {
    public static boolean necesitaInternare(Pacient pacient, Salon salon) {
        if (Medic.decizieInternarePacient(pacient)) {
            return salon.existaPaturiDisponibile();
        }

        return false;
    }
}