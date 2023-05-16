package Composite.main;

import Composite.clase.IMedicament;
import Composite.clase.Sectiune;
import Composite.clase.Subsectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        IMedicament medicament1 = new Subsectiune("Adulti");
        IMedicament medicament2 = new Subsectiune("Copii");

        IMedicament sectiune = new Sectiune("Raceala");
        sectiune.adaugareNod(medicament1);
        sectiune.adaugareNod(medicament2);
        sectiune.afisare();
    }
}
