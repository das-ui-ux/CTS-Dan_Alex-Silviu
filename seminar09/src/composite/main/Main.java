package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.Grup;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Element autobuz1 = new Autobuz("Mercedes", 3000, 9);
        Element autobuz2 = new Autobuz("BMW", 3000, 7);

        Element grupAutobuzeMici = new Grup("Autobuze mici");
        grupAutobuzeMici.adaugaGrup(autobuz1);
        grupAutobuzeMici.adaugaGrup(autobuz2);
        grupAutobuzeMici.afisareSumaAsigurare();

        Element autobuz3 = new Autobuz("Audi", 5000, 15);
        Element autobuz4 = new Autobuz("Caruta", 3000, 20);

        Element grupAutobuzeMijlocii = new Grup("Autobuze mijlocii");
        grupAutobuzeMijlocii.adaugaGrup(autobuz3);
        grupAutobuzeMijlocii.adaugaGrup(autobuz4);
        grupAutobuzeMijlocii.afisareSumaAsigurare();

        Element flota = new Grup("Autobuze Flota");
        flota.adaugaGrup(grupAutobuzeMici);
        flota.adaugaGrup(grupAutobuzeMijlocii);
        flota.afisareSumaAsigurare();

        Element autobuzVip = new Autobuz("Bentley", 9000, 35);
        flota.adaugaGrup(autobuzVip);
        flota.afisareSumaAsigurare();

    }
}
