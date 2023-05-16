package Command.main;

import Command.clase.*;

public class Main {
    public static void main(String[] args) {

        ManagerComenzi managerComenzi = new ManagerComenzi();
        IPacient pacient = new Pacient("Costel");

        managerComenzi.invocaComanda(new ComandaInternare( new Pacient("Mitica")));
        managerComenzi.invocaComanda(new ComandaTratareImediata(1, new Pacient("Florin")));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}