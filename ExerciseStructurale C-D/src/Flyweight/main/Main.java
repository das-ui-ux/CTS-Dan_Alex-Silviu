package Flyweight.main;

import Flyweight.clase.FabricaClienti;
import Flyweight.clase.FacereCont;

public class Main {
    public static void main(String[] args) {
        FabricaClienti fabricaClienti = new FabricaClienti();

        FacereCont cont1 = new FacereCont(10, 1000);
        FacereCont cont2 = new FacereCont(11, 100);
        FacereCont cont3 = new FacereCont(12, 3500);

        fabricaClienti.getClient("Alex", 1).realizareClient(cont1);
        fabricaClienti.getClient("Costel", 2).realizareClient(cont2);
        fabricaClienti.getClient("Alex", 1).realizareClient(cont3);
    }
}
