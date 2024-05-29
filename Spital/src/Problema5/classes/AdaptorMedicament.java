package Problema5.classes;

import Problema5.interfaces.Medicament;

public class AdaptorMedicament implements Medicament {

    private MedicamentSpital medicamentSpital;

    public AdaptorMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}