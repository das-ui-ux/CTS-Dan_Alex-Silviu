package Adapter.main;

import Adapter.softFarmacie.ISoftFarmacie;
import Adapter.softFarmacie.SoftFarmacie;
import Adapter.softSpital.AdaptorObiecte;
import Adapter.softSpital.ISoftSpital;
import Adapter.softSpital.SoftSpital;

public class Main {
    public static void imprimare(ISoftSpital softSpital, double totalPret){
        softSpital.achizitioneazaMedicament(totalPret);
    }
    public static void main(String[] args) {
        ISoftFarmacie softFarmacie = new SoftFarmacie("Paracetamol");
        ISoftSpital softSpital = new SoftSpital("Costel");

        imprimare(softSpital, 200);
        System.out.println();

        AdaptorObiecte adaptorObiecte = new AdaptorObiecte(softFarmacie);
        imprimare(adaptorObiecte, 300);

    }
}