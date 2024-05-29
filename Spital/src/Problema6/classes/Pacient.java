package Problema6.classes;

public class Pacient {

    private String numePacient;
    private int gravitateStare;

    public Pacient() {
        numePacient = "N/A";
        gravitateStare = -1;
    }

    public Pacient(String numePacient, int gravitateStare) {
        this.numePacient = numePacient;
        this.gravitateStare = gravitateStare;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public int getGravitateStare() {
        return gravitateStare;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", gravitateStare=" + gravitateStare +
                '}';
    }
}