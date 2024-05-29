package Problema2.main;

import Problema2.classes.PersonalSpital;
import Problema2.classes.factory.FabricaPersonal;
import Problema2.classes.factory.TipPersonal;

public class Program2 {
    public static void main(String[] args) throws Exception {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();

            PersonalSpital asistent = fabricaPersonal.creazaPersonal(TipPersonal.ASISTENT, "Andrei", "073451247", 5000);
            PersonalSpital brancardier = fabricaPersonal.creazaPersonal(TipPersonal.BRACARDIER, "Alexandru", "0735583183", 3700);
            PersonalSpital medic = fabricaPersonal.creazaPersonal(TipPersonal.MEDIC, "Gheorghe", "07384256382", 12000);


        asistent.afisareDetalii();
            brancardier.afisareDetalii();
            medic.afisareDetalii();
    }
}