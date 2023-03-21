package prototype.main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {
    public static void main(String args[]){
        //aici folosim dependency inversion -- ce e asta?
        MijlocTransport autobuz = new Autobuz("CT 66 DAS", 20);
        MijlocTransport autobuz1 = new Autobuz("B 23 BIG", 40);
        Autobuz autobuz2 = (Autobuz) autobuz1.clone();
        Autobuz autobuz3 = (Autobuz) autobuz1.clone();
        //aici incalcam dependency inversion
        autobuz2.setNrInmatriculare("SV 11 34");
        autobuz3.setNrInmatriculare("IS34 243");

        System.out.println(autobuz.toString());
        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
        System.out.println(autobuz3.toString());
    }
}
