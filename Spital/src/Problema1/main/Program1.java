package Problema1.main;

import Problema1.classes.Pacient;
import Problema1.classes.PacientBuilder;

public class Program1 {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder1 = new PacientBuilder("Alexandru", 25);

        Pacient pacient1 = pacientBuilder1.setArePatRabatabil(true).setAreHalat(true)
                .setAreMicDejunInclus(true).build();

        System.out.println(pacient1);


        PacientBuilder pacientBuilder2 = new PacientBuilder("Andrei", 56);
        Pacient pacient2 = pacientBuilder2.build();

        System.out.println(pacient2);
    }
}