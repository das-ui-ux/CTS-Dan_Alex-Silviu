package Command.main;

import Command.clase.AjutorFarmacist;
import Command.clase.ComamandAducereMedicament;
import Command.clase.IAjutorFarmacist;
import Command.clase.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        IAjutorFarmacist ajutorFarmacist = new AjutorFarmacist("Costel");

        managerComenzi.invocaComanda(new ComamandAducereMedicament(new AjutorFarmacist("MITICA")));
        managerComenzi.invocaComanda(new ComamandAducereMedicament(ajutorFarmacist));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}