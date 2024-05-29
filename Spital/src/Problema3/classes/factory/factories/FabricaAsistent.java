package Problema3.classes.factory.factories;

import Problema3.classes.Asistent;
import Problema3.classes.PersonalSpital;
import Problema3.classes.factory.interfaces.FabricaPersonal;

public class FabricaAsistent implements FabricaPersonal {
    @Override
    public PersonalSpital creazaPersonal(String nume, String telefon, float salariu) {
        return new Asistent(nume, telefon, salariu);
    }
}