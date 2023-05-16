package Flyweight.main;

import Flyweight.clase.Client;
import Flyweight.clase.FabricaClienti;
import Flyweight.clase.IClient;
import Flyweight.clase.InformatiiReteta;

public class Main {
    public static void main(String[] args) {
        FabricaClienti fabricaClienti = new FabricaClienti();

        InformatiiReteta informatiiReteta1 = new InformatiiReteta(1, 120, 4);
        InformatiiReteta informatiiReteta2 = new InformatiiReteta(2, 50, 2);
        InformatiiReteta informatiiReteta3 = new InformatiiReteta(3, 300, 6);

        fabricaClienti.getClient(1, "Matei").retineClient(informatiiReteta1);
        fabricaClienti.getClient(2, "Costel").retineClient(informatiiReteta2);
        fabricaClienti.getClient(1, "Matei").retineClient(informatiiReteta3);
    }
}
