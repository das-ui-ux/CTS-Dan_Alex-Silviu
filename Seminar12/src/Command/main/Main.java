package Command.main;

import Command.clase.Autobuz;
import Command.clase.Automobil;
import Command.clase.CommandPlecareInCursa;
import Command.clase.ManagerComenzi;

// STB - problema 16 command
public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Automobil autobuz = new Autobuz(13);

        //practic astea sunt executate dimineata
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));

        //si astea sunt executate in timpul zilei, pe tot parcursul zilei
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(23)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}