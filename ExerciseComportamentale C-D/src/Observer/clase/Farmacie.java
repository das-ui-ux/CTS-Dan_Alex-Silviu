package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements Subject{
    private List<Observer> clienti;
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.clienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.clienti.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        System.out.println("Farmacia " + numeFarmacie);
        for(Observer observer: clienti){
            observer.notificaClient(mesaj);
        }
    }
}
