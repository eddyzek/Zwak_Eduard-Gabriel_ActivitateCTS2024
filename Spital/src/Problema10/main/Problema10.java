package Problema10.main;

import Problema10.classes.*;
import Problema10.classes.InformatiiInternare;

public class Problema10 {
    public static void main(String[] args) {
        CentralizatorInternari centralizatorInternari = new CentralizatorInternari();

        InformatiiInternare informatiiInternare1 = new InformatiiInternare(2, 1, 22);
        InformatiiInternare informatiiInternare2 = new InformatiiInternare(3, 2, 14);
        InformatiiInternare informatiiInternare3 = new InformatiiInternare(8, 3, 2);
        InformatiiInternare informatiiInternare4 = new InformatiiInternare(6, 4, 10);

        centralizatorInternari.getPacient(24, "195438604", "Alexandru",
                "0715973321", "Strada1").getInformatiiInternare(informatiiInternare1);

        centralizatorInternari.getPacient(31, "1934838614", "Andrei",
                "0748629754", "Strada2").getInformatiiInternare(informatiiInternare2);

        centralizatorInternari.getPacient(35, "1978038804", "Gheorghe",
                "0749257610", "Strada3").getInformatiiInternare(informatiiInternare3);

        centralizatorInternari.getPacient(46, "1965238823", "Mihai",
                "0753487217", "Strada4").getInformatiiInternare(informatiiInternare4);

        centralizatorInternari.getPacient(18, "1930216043", "Andreea",
                "0752248300", "Strada5").getInformatiiInternare(informatiiInternare3);
    }
}