package Adapter.softFarmacie;

public class SoftFarmacie implements ISoftFarmacie{
    private String denumireMedicament;

    public SoftFarmacie(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    @Override
    public void cumparaMedicament(double pret) {
        System.out.println("Medicamentul " + this.denumireMedicament + " s-a cumparat cu " + pret + " lei.");
    }
}
