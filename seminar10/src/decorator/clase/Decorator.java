package decorator.clase;

public abstract class Decorator implements IBilet{

    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printareBilet() {
        this.bilet.printareBilet();
        printareMesajSustinere();
    }

    public IBilet getBilet() {
        return bilet;
    }

    @Override
    public String getNumeEchipe1() {
        return bilet.getNumeEchipe1();
    }

    public abstract void printareMesajSustinere();
}
