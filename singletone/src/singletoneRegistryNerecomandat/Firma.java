package singletoneRegistryNerecomandat;

public class Firma {
    private String denumire;
    private int cifraAfaceri;

    public Firma(String denumire, int cifraAfaceri) {
        this.denumire = denumire;
        this.cifraAfaceri = cifraAfaceri;
    }

    public void incheiereContract(int sumaContract){
        this.cifraAfaceri += sumaContract;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "denumire='" + denumire + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                '}';
    }
}
