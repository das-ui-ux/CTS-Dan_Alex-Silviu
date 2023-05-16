package Decorator.main;

import Decorator.clase.Decorator;
import Decorator.clase.INota;
import Decorator.clase.Nota;
import Decorator.clase.NotaDecorata;

public class Main {
    public static void main(String[] args) {
        INota nota1 = new Nota("Marcu");
        INota nota2 = new Nota("Luca");
        INota nota3 = new Nota("Ioan");

        nota1.printeazaNota();
        nota2.printeazaNota();
        nota3.printeazaNota();

        System.out.println();

        Decorator decorator1 = new NotaDecorata(nota1);
        Decorator decorator2 = new NotaDecorata(nota2);
        decorator1.printeazaNota();
        decorator2.printeazaNota();
    }
}
