package Observer.main;

import Observer.clase.Agentie;
import Observer.clase.ClientFidel;

public class Main {
    public static void main(String[] args) {
        ClientFidel client2 = new ClientFidel("Costel");
        ClientFidel client1 = new ClientFidel("Florin");
        ClientFidel client3 = new ClientFidel("Maria");

        Agentie agentie = new Agentie("AgeTur");

        agentie.adaugaObserver(client1);
        agentie.adaugaObserver(client2);
        agentie.notificareOfertaNoua();
        agentie.adaugaObserver(client3);
        agentie.notificareReducerePret();
    }
}