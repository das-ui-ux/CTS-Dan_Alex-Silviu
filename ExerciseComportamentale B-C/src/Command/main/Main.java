package Command.main;

import Command.clase.*;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        IOperator operator = new Operator("Alex");

        managerComenzi.invocaComanda(new ComandaRezervareMasa(operator));
        managerComenzi.invocaComanda(new ComandaOcupareMasa(new Operator("Costel")));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

    }
}