package Adapter.softSpital;

public class SoftSpital implements ISoftSpital{
    private String numeVanzator;

    public SoftSpital(String numeVanzator) {
        this.numeVanzator = numeVanzator;
    }

    @Override
    public void achizitioneazaMedicament(double pretMedicament) {
        System.out.println("Vanzator: " + numeVanzator);
        prezintaReteta();
        System.out.println("Pretul medicamentului achizitionat este de " + pretMedicament + " lei.");
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Prezinta reteta vanzatorului " + this.numeVanzator);
    }
}
