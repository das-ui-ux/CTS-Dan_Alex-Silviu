package flyweight.main;

import flyweight.clase.FabricaSpectatori;
import flyweight.clase.PozitieDesenare;

// Sportiv: problema 10 - flyweight
public class Main {
    public static void main(String[] args) {
        FabricaSpectatori fabrica = new FabricaSpectatori();
        PozitieDesenare pozitie1 = new PozitieDesenare(20, 10, "Rosu");
        PozitieDesenare pozitie2 = new PozitieDesenare(10, 30, "Galben");
        PozitieDesenare pozitie3 = new PozitieDesenare(20, 12, "Albastru");

       fabrica.getSpectator(1, 180, 50).deseneazaSpectator(pozitie3);
       fabrica.getSpectator(2, 130, 10.2F).deseneazaSpectator(pozitie1);
       fabrica.getSpectator(1, 180, 50).deseneazaSpectator(pozitie2);
    }
}