package Proxy.main;

import Proxy.clase.Cont;
import Proxy.clase.ICont;
import Proxy.clase.Proxy;

public class Main {
    public static void main(String[] args) {
        ICont cont = new Cont(12);

        ICont proxy = new Proxy(cont);
        proxy.creareCont("EURO");
        proxy.creareCont("RON");
    }
}
