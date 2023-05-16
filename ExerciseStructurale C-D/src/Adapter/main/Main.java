package Adapter.main;

import Adapter.softExistent.AdapterObiecte;
import Adapter.softExistent.ISoftExistent;
import Adapter.softExistent.SoftExistent;
import Adapter.softNou.ISoftNou;
import Adapter.softNou.SoftNou;

public class Main {
    public static void main(String[] args) {
        ISoftNou softNou = new SoftNou("SoftX", 12);
        ISoftExistent softExistent = new SoftExistent("ASoft", 10);
        softExistent.setareMedicament(2);
        softExistent.verificareDisponibilitate(2, 5);

        AdapterObiecte adapterObiecte = new AdapterObiecte();
        adapterObiecte.setareMedicament(1);
        adapterObiecte.verificareDisponibilitate(1, 2);
    }
}