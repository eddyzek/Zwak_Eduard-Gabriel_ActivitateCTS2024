package Problema10.classes;

import Problema10.interfaces.FlyweightPacient;

import java.util.HashMap;
import java.util.Map;

public class CentralizatorInternari {
    private Map<String, FlyweightPacient> pacienti;

    public CentralizatorInternari() {
        this.pacienti = new HashMap<>();
    }

    public FlyweightPacient getPacient(int varsta, String cnp, String nume, String telefon, String adresa) {
        return pacienti.computeIfAbsent(cnp, key -> new Pacient(varsta, cnp, nume, telefon, adresa));
    }
}