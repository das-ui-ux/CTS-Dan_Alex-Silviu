package Strategy.main;

import Strategy.clase.Pacient;
import Strategy.clase.PlataCard;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Costel");
        pacient.plateste(200);
        System.out.println();
        pacient.setTipPlata(new PlataCard());
        pacient.plateste(100);

    }
}
