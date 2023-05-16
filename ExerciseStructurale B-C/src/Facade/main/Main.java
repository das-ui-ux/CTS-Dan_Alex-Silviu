package Facade.main;

import Facade.clase.FacadeMasa;
import Facade.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(12);
        FacadeMasa facadeMasa = new FacadeMasa(masa);
        facadeMasa.verificareMasa();
    }
}
