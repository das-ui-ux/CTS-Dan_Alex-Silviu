package Adapter.main;

import Adapter.bar.ISoftBar;
import Adapter.bar.SoftBar;
import Adapter.bucatarie.AdapterClase;
import Adapter.bucatarie.AdapterObiecte;
import Adapter.bucatarie.ISoftBucatarie;
import Adapter.bucatarie.SoftBucatarie;

public class Main {
    public static void printare(ISoftBucatarie bucatarie, double totalPlata) {
        bucatarie.printeazaNota(totalPlata);
    }
    public static void main(String[] args) {
        ISoftBar softBar = new SoftBar("BarulLuiOaie");
        ISoftBucatarie softBucatarie = new SoftBucatarie("LaCostel");

        printare(softBucatarie, 200);

        AdapterClase adapterClase = new AdapterClase("AmestecComapny");
        printare(adapterClase, 500);

        AdapterObiecte adapterObiecte = new AdapterObiecte(softBar);
        printare(adapterObiecte, 600);

        adapterClase.printeazaNota(900);

    }
}