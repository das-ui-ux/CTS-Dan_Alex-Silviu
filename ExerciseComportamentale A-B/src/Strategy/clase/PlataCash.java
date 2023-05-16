package Strategy.clase;

public class PlataCash implements TipPlata{
    @Override
    public void plateste(double pret) {
        System.out.println("S-a realizat plata in valoare de " + pret + " cash");
    }
}
