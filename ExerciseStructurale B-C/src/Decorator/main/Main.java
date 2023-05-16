package Decorator.main;

import Decorator.clase.Bon;
import Decorator.clase.BonDecorat;
import Decorator.clase.Decorator;
import Decorator.clase.IBon;

public class Main {
    public static void main(String[] args) {
        IBon bon1 = new Bon(1);
        IBon bon2 = new Bon(2);
        IBon bon3 = new Bon(3);

        bon1.printeazaBon();
        bon2.printeazaBon();
        bon3.printeazaBon();
        System.out.println();

        Decorator decorator1 = new BonDecorat(bon1);
        Decorator decorator2 = new BonDecorat(bon2);
        decorator1.printeazaBon();
        decorator2.printeazaBon();

    }
}
