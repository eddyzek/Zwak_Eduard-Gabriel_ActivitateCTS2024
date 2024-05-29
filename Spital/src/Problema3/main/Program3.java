package Problema3.main;

import Problema3.classes.PersonalSpital;
import Problema3.classes.factory.factories.FabricaAsistent;
import Problema3.classes.factory.factories.FabricaBrancardier;
import Problema3.classes.factory.factories.FabricaInfirmier;
import Problema3.classes.factory.factories.FabricaMedic;
import Problema3.classes.factory.interfaces.FabricaPersonal;

public class Program3 {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal;
        PersonalSpital personalSpital;

        fabricaPersonal = new FabricaAsistent();
        personalSpital = fabricaPersonal.creazaPersonal("Andrei", "073451247", 5000);
        personalSpital.afisareDetalii();
        System.out.println("\n");

        fabricaPersonal = new FabricaBrancardier();
        personalSpital = fabricaPersonal.creazaPersonal("Alexandru", "0735583183", 3700);
        personalSpital.afisareDetalii();
        System.out.println("\n");

        fabricaPersonal = new FabricaMedic();
        personalSpital = fabricaPersonal.creazaPersonal("Gheorghe", "07384256382", 12000);
        personalSpital.afisareDetalii();
        System.out.println("\n");

        fabricaPersonal = new FabricaInfirmier();
        personalSpital = fabricaPersonal.creazaPersonal("Ionut", "072487315284", 4500);
        personalSpital.afisareDetalii();
        System.out.println("\n");
    }
}
