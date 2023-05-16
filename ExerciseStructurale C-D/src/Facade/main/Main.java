package Facade.main;

import Facade.clase.Facade;
import Facade.clase.Medicament;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new Medicament("Paracetamol"));
        facade.verificareCumparareMedicament();
    }
}
