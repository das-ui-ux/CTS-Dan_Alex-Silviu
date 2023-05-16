package Observer.main;

import Observer.clase.Client;
import Observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alex");
        Client client2 = new Client("Silviu");
        Client client3 = new Client("Dan");

        Restaurant restaurant = new Restaurant("LaDAS");
        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);
        restaurant.notificareOfertaNoua();
        restaurant.adaugaObserver(client3);
        restaurant.notificareOfertaNoua();
    }
}
