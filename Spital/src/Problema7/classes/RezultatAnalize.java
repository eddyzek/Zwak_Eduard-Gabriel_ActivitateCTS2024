package Problema7.classes;

import java.util.List;

public class RezultatAnalize implements ProviderRezultatAnalize {

    private String denumireDiagnostic;
    private List<String> listaSimptome;
    private boolean necesitaSpitalizare;

    public RezultatAnalize(String denumireDiagnostic, List<String> listaSimptome, boolean necesitaSpitalizare) {
        this.denumireDiagnostic = denumireDiagnostic;
        this.listaSimptome = listaSimptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    public void printeazaRezultatAnaliza() {
        System.out.println("Rezultatul analizelor este:\n" +
                "Diagnostic: " + this.denumireDiagnostic +
                "\nSimptome: " + this.listaSimptome +
                "\nNecesita spitalizare: " +
                (this.necesitaSpitalizare ? "da." : "nu."));
    }
}