package Strategy.main;

import Strategy.clase.Calator;
import Strategy.clase.PlataCardBancar;
import Strategy.clase.PlataCardCalatorii;
import Strategy.clase.PlataPrinSms;

public class Main {
    public static void main(String[] args){
        Calator calator = new Calator("Alex Das");
        calator.platesteBilet(3);

        calator.setMetodaPlata(new PlataPrinSms());
        calator.platesteBilet(4);

        calator.setMetodaPlata(new PlataCardBancar());
        calator.platesteBilet(5);

        calator.setMetodaPlata(new PlataCardCalatorii());
        calator.platesteBilet(3);


    }
}
