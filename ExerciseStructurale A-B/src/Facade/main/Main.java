package Facade.main;

import Facade.clase.Facade;
import Facade.clase.Medic;
import Facade.clase.Pacient;
import Facade.clase.Salon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaPaturiLibere = new ArrayList<>();
        listaPaturiLibere.add(1);
        listaPaturiLibere.add(2);
        listaPaturiLibere.add(3);
        Salon salon = new Salon(listaPaturiLibere, 1);
        Medic medic = new Medic("Costel");
        Pacient pacient = new Pacient("Ion Pacientul");

        Facade facade = new Facade(medic, pacient, salon);
        facade.interneazaPacient(2);
    }
}
