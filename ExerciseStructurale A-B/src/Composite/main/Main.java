package Composite.main;

import Composite.clase.Element;
import Composite.clase.Grup;
import Composite.clase.Sectie;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Element sectie1 = new Sectie("Neurologie");
        Element sectie2 = new Sectie("Boli infectioase");

        Element grup = new Grup("Medical");
        grup.adaugaGrup(sectie1);
        grup.adaugaGrup(sectie2);
        grup.afiseazaNumeSectie("Sectia 1");
    }
}
