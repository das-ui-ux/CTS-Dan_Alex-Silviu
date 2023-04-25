package facade.main;//problema 5 - Companie de transport in comun STB

import facade.clase.Autobuz;
import facade.clase.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("B111STB");

//        autobuz.deschideUsaFata();
//        autobuz.deschideUsaMijloc();
//        autobuz.deschideUsaSpate();
//
//        System.out.println();

        FacadeAutobuz facadeAutobuz = new FacadeAutobuz("B111STB");
        facadeAutobuz.ramaneLibera();
        System.out.println();
        facadeAutobuz.deschideUsi();
    }
}