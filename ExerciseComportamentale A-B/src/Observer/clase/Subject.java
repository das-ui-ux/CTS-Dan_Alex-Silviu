package Observer.clase;

public interface Subject {
    public void adaugaObserver(Observer observer);
    public void stergereObserver(Observer observer);
    public void trimiteNotificare(String mesaj);
}
