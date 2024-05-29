package Problema3.classes.factory.factories;

import Problema3.classes.Brancardier;
import Problema3.classes.PersonalSpital;
import Problema3.classes.factory.interfaces.FabricaPersonal;

public class FabricaBrancardier implements FabricaPersonal {
    @Override
    public PersonalSpital creazaPersonal(String nume, String telefon, float salariu) {
        return new Brancardier(nume, telefon, salariu);
    }
}