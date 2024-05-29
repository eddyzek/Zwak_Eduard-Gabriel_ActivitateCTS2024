package Problema3.classes.factory.interfaces;

import Problema3.classes.PersonalSpital;

public interface FabricaPersonal {
    PersonalSpital creazaPersonal(String nume, String telefon, float salariu);
}