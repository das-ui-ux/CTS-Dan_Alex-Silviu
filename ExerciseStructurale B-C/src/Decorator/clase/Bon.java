package Decorator.clase;

public class Bon implements IBon{
    private int nrBon;

    public Bon(int nrBon) {
        this.nrBon = nrBon;
    }

    @Override
    public void printeazaBon() {
        System.out.println("Bonul cu numarul " + this.nrBon + " a fost printat");
    }
}
