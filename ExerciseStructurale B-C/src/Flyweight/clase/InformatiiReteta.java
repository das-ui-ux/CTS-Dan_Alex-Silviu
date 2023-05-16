package Flyweight.clase;

public class InformatiiReteta {
    private int nrRetea;
    private double sumaPlata;
    private int nrMedicamente;

    public InformatiiReteta(int nrRetea, double sumaPlata, int nrMedicamente) {
        this.nrRetea = nrRetea;
        this.sumaPlata = sumaPlata;
        this.nrMedicamente = nrMedicamente;
    }

    @Override
    public String toString() {
        return "InformatiiReteta{" +
                "nrRetea=" + nrRetea +
                ", sumaPlata=" + sumaPlata +
                ", nrMedicamente=" + nrMedicamente +
                '}';
    }
}
