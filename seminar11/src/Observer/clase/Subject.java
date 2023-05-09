package Observer.clase;

import Observer.clase.Observer;

public interface Subject {
    public void adaugaObserver(Observer observer);
    public void stergeObservator(Observer observer);
    public void trimiteNotificare(String mesaj);
}

