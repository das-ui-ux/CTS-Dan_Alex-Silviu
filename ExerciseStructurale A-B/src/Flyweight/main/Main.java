package Flyweight.main;

import Flyweight.clase.DetaliiRezervare;
import Flyweight.clase.FabricaClienti;

public class Main {
    public static void main(String[] args) {
        FabricaClienti fabricaClienti = new FabricaClienti();
        DetaliiRezervare detaliiRezervare1 = new DetaliiRezervare(12, 4);
        DetaliiRezervare detaliiRezervare2 = new DetaliiRezervare(13, 2);
        DetaliiRezervare detaliiRezervare3 = new DetaliiRezervare(14, 6);
        fabricaClienti.getClient(1, "Alex", 07665673).retineClient(detaliiRezervare1);
        fabricaClienti.getClient(2, "Marius", 0773).retineClient(detaliiRezervare2);
        fabricaClienti.getClient(1, "Alex", 07665673).retineClient(detaliiRezervare3);
    }
}
