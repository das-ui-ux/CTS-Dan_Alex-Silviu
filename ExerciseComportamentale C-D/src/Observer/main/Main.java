package Observer.main;

import Observer.clase.Client;
import Observer.clase.Farmacie;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alex");
        Client client2 = new Client("Dan");
        Client client3 = new Client("Silviu");

        Farmacie farmacie = new Farmacie("Dona");
        farmacie.adaugaObserver(client1);
        farmacie.adaugaObserver(client2);
        farmacie.trimiteNotificare("Salutare! A aparut o oferta noua!");
        farmacie.adaugaObserver(client3);
        farmacie.trimiteNotificare("Salutare! A aparut o oferta noua!");
    }
}
