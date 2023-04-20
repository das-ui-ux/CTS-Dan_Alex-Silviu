package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftResturant;

public class Main {
    public static void imprimare(ISoftResturant resturant, double totalNota){
        resturant.printeazaNota(totalNota);
    }
    public static void main(String[] args) {

        ISoftBar bar = new SoftBar("Alcatinel");
//        bar.printeazaNotaBauturi(240);

        ISoftResturant bucatarie = new Bucatarie("Marcel");
//        bucatarie.printeazaNota(300);

//        Main.imprimare(bar, 300); // nu pot sa fac asa iar pt asta folosesc adapterul
        Main.imprimare(bucatarie, 500);
        System.out.println();

        AdapterRestaurant adapter = new AdapterRestaurant("Alcadibo");
        Main.imprimare(adapter, 450);


        AdapterObiecteRestaurant adapterObiecteRestaurant = new AdapterObiecteRestaurant(bar);
        Main.imprimare(adapterObiecteRestaurant, 800);
    }
}