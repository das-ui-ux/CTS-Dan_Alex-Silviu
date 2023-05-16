package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject{
    private List<Observer> observari;
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
        this.observari = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.observari.add(observer);
    }

    @Override
    public void stergereObserver(Observer observer) {
        this.observari.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer: observari){
            observer.receptionareMesaj(mesaj);
        }
    }

    public void notificareOfertaNoua(){
        trimiteNotificare("A aparut o oferta noua. Check it out!");
    }
}
