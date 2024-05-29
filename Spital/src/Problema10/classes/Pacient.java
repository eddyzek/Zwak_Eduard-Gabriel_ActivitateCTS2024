package Problema10.classes;

import Problema10.interfaces.FlyweightPacient;

public class Pacient implements FlyweightPacient {

    private int varsta;
    private String cnp;
    private String numePacient;
    private String telefon;
    private String adresa;

    public Pacient(int varsta, String cnp, String numePacient, String telefon, String adresa) {
        this.varsta = varsta;
        this.cnp = cnp;
        this.numePacient = numePacient;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Pacientul{" +
                "varsta=" + varsta +
                ", cnp='" + cnp + '\'' +
                ", numePacient='" + numePacient + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void getInformatiiInternare(InformatiiInternare informatiiInternare) {
        System.out.println(this + " are urmatoarele informatii de internare: " + informatiiInternare);
    }
}