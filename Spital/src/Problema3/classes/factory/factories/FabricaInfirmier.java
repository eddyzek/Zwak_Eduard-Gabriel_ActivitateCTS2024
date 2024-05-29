package Problema3.classes.factory.factories;

import Problema3.classes.Infirmier;
import Problema3.classes.PersonalSpital;
import Problema3.classes.factory.interfaces.FabricaPersonal;

public class FabricaInfirmier implements FabricaPersonal {
    @Override
    public PersonalSpital creazaPersonal(String nume, String telefon, float salariu) {
        return new Infirmier(nume, telefon, salariu);
    }
}