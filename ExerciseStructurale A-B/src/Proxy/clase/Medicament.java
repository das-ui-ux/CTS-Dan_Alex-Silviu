package Proxy.clase;

public class Medicament implements IMedicament{
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }


    @Override
    public void achizitionareMedicament(boolean retetaClient) {
        System.out.println("Medicamentul " + this.numeMedicament + " a fost achizitionat pt ca statusul retetei clientului este: " + retetaClient);
    }
}
