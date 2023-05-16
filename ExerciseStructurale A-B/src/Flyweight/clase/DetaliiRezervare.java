package Flyweight.clase;

public class DetaliiRezervare {
    private Integer nrMasaRezervata;
    private Integer nrPersoane;

    public DetaliiRezervare(Integer nrMasaRezervata, Integer nrPersoane) {
        this.nrMasaRezervata = nrMasaRezervata;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        return "DetaliiRezervare{" +
                "nrMasaRezervata=" + nrMasaRezervata +
                ", nrPersoane=" + nrPersoane +
                '}';
    }
}
