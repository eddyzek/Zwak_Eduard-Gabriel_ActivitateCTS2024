package Problema2.classes.factory;

import Problema2.classes.Asistent;
import Problema2.classes.Brancardier;
import Problema2.classes.Medic;
import Problema2.classes.PersonalSpital;

public class FabricaPersonal {
    public PersonalSpital creazaPersonal(TipPersonal tipPersonal, String nume, String telefon, float salariu) throws Exception {
        switch (tipPersonal) {
            case ASISTENT -> {
                return new Asistent(nume, telefon, salariu);
            }

            case BRACARDIER -> {
                return new Brancardier(nume, telefon, salariu);
            }

            case MEDIC -> {
                return new Medic(nume, telefon, salariu);
            }

            default -> throw new Exception("Spitalu nu detine acest tip de personal\n");
        }
    }
}