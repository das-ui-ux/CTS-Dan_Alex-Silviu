package State.main;


import State.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Costel");
        pacient.interneazaPacient();
        pacient.observaPacient();
        pacient.externeazaPacientul();
        pacient.observaPacient();
    }
}
