package Proxy.main;

import Proxy.clase.IMedicament;
import Proxy.clase.Medicament;
import Proxy.clase.Proxy;

public class Main {
    public static void main(String[] args) {
        IMedicament medicament = new Medicament("Paracetamol");
        medicament.cumparaMedicament(false);
        medicament.cumparaMedicament(true);
        System.out.println();
        IMedicament proxy = new Proxy(medicament);
        proxy.cumparaMedicament(true);
        proxy.cumparaMedicament(false);
    }
}
