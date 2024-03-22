package March16.Singleton.Multiplu;

public class Preparat {
    private String denumirePreparat;
    private int nrMinuteGatire;
    private int gradeGatire;

    public Preparat(String denumirePreparat, int nrMinuteGatire, int gradeGatire) {
        this.denumirePreparat = denumirePreparat;
        this.nrMinuteGatire = nrMinuteGatire;
        this.gradeGatire = gradeGatire;
    }

    public String getDenumirePreparat() {
        return denumirePreparat;
    }

    public int getNrMinuteGatire() {
        return nrMinuteGatire;
    }

    public int getGradeGatire() {
        return gradeGatire;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "denumirePreparat='" + denumirePreparat + '\'' +
                ", nrMinuteGatire=" + nrMinuteGatire +
                ", gradeGatire=" + gradeGatire +
                '}';
    }
}
