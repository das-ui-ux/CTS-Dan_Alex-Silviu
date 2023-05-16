package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject{
    private List<Observer> observers;
    private String numeRestaurant;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.observers = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer: observers){
            observer.notificaClient(numeRestaurant + ": " + mesaj);
        }
    }

    public void notificareOfertaNoua(){
        trimiteNotificare("A aparut o oferta noua check it out!");
    }
}
