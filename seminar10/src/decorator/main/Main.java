package decorator.main;

import decorator.clase.Bilet;
import decorator.clase.BiletDecorat;
import decorator.clase.Decorator;
import decorator.clase.IBilet;

// Sportiv: problema 7 - decorator
public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet("Costel", "Romania", "Spania");
        IBilet bilet1 = new Bilet("Costel", "Romania", "Germania");
        IBilet bilet2 = new Bilet("Costel", "Qatar", "Spania");

        bilet.printareBilet();
        bilet1.printareBilet();
        bilet2.printareBilet();

        System.out.println();

        Decorator decoratorBilet = new BiletDecorat(bilet);
        Decorator decoratorBilet1 = new BiletDecorat(bilet1);

        decoratorBilet.printareBilet();
        decoratorBilet1.printareBilet();
    }
}