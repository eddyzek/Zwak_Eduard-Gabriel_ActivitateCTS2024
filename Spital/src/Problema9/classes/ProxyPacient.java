package Problema9.classes;

import Problema9.interfaces.Persoana;

public class ProxyPacient implements Persoana {

    private Persoana pacient;

    public ProxyPacient(Persoana pacient) {
        this.pacient = pacient;
    }

    @Override
    public void internare() {
        if (((Pacient) this.pacient).hasAsigurareDeSanatate()) {
            pacient.internare();
        } else {
            System.out.println("Pacientului " + ((Pacient) this.pacient).getNumePacient() +
                    ", care are " + ((Pacient) this.pacient).getVarsta() +
                    " ani, ii este refuzata internarea in spital deoarece nu are asigurare de sanatate");
        }
    }
}