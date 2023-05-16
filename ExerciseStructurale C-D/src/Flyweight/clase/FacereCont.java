package Flyweight.clase;

public class FacereCont {
    private int nrCont;
    private double suma;

    public FacereCont(int nrCont, double suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "FacereCont{" +
                "nrCont=" + nrCont +
                ", suma=" + suma +
                '}';
    }
}
