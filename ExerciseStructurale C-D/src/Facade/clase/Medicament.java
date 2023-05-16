package Facade.clase;

public class Medicament {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void verificareReteta(){
        System.out.println("Reteta verificata");
    }
    public void verificareDisponibilitateMedicament(){
        System.out.println("Medicament in stoc");
    }
    public void verificareCardSanatate(){
        System.out.println("Card de sanatate verificat");
    }
}
