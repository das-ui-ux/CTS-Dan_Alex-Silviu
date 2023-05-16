package Facade.clase;

public class Facade {
    private Medicament medicament;

    public Facade(Medicament medicament) {
        this.medicament = medicament;
    }

    public void verificareCumparareMedicament(){
        medicament.verificareDisponibilitateMedicament();
        medicament.verificareCardSanatate();
        medicament.verificareReteta();
    }
}
