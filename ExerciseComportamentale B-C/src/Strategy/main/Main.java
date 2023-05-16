package Strategy.main;

import Strategy.clase.Client;
import Strategy.clase.PlataCard;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Costel");
        client.setMetodaPlata(new PlataCard());
        client.platesteNota();
    }
}
