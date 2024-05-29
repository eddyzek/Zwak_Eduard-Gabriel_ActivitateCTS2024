package Problema9.main;

import Problema9.classes.Pacient;
import Problema9.classes.ProxyPacient;
import Problema9.interfaces.Persoana;

public class Problema9 {
    public static void main(String[] args) {
        Persoana pacient1 = new Pacient("Alexandru", 31, true);
        Persoana pacient2 = new Pacient("Andrei", 72, true);
        Persoana pacient3 = new Pacient("Ion", 24, false);

        pacient1.internare();
        pacient2.internare();
        pacient3.internare();

        System.out.println("\n<-----Internare prin Proxy----->\n");

        Persoana proxyPacient1 = new ProxyPacient(pacient1);
        Persoana proxyPacient2 = new ProxyPacient(pacient2);
        Persoana proxyPacient3 = new ProxyPacient(pacient3);

        proxyPacient1.internare();
        proxyPacient2.internare();
        proxyPacient3.internare();
    }
}