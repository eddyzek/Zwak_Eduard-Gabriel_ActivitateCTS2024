package Problema3.classes.factory.factories;

import Problema3.classes.Medic;
import Problema3.classes.PersonalSpital;
import Problema3.classes.factory.interfaces.FabricaPersonal;

public class FabricaMedic implements FabricaPersonal {
    @Override
    public PersonalSpital creazaPersonal(String nume, String telefon, float salariu) {
        return new Medic(nume, telefon, salariu);
    }
}