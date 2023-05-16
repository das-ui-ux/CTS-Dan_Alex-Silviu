package Observer.main;


import Observer.clase.Pacient;
import Observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ion");
        Pacient pacient2 = new Pacient("Ionut");
        Pacient pacient3 = new Pacient("Ionel");

        Spital spital = new Spital("Regina Maria");

        spital.adaugaObserver(pacient1);
        spital.adaugaObserver(pacient2);
        spital.notificareOfertaNoua();
        spital.adaugaObserver(pacient3);
        spital.notificareOfertaNoua();
    }
}
