package Problema5.main;

import Problema5.classes.AdaptorMedicament;
import Problema5.classes.MedicamentFarmacie;
import Problema5.classes.MedicamentSpital;
import Problema5.interfaces.Medicament;

import java.util.ArrayList;
import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        Medicament medicamentFarmacie = new MedicamentFarmacie("Olint");
        medicamentFarmacie.cumparaMedicament();

        MedicamentSpital medicamentSpital = new MedicamentSpital("Nurofen",new ArrayList<>(Arrays.asList("Coldrex", "Nurofen")));

        medicamentSpital.achizitioneazaMedicament();

        Medicament adaptorMedicament = new AdaptorMedicament(medicamentSpital);
        adaptorMedicament.cumparaMedicament();
    }
}