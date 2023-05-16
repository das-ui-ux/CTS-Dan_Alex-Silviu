package Strategy.clase;

public class PlataCard implements TipPlata{
    @Override
    public void plateste(double pret) {
        System.out.println("S-a realizat plata in valoare de " + pret + " cu cardul");
    }
}
