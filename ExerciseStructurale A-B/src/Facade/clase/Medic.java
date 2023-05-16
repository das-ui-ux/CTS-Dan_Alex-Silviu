package Facade.clase;

public class Medic {
    private String numeMedic;

    public Medic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public void verificareConfirmareMedic(){
        System.out.println("Medicul " + this.numeMedic + " a confirmat ca pacientul poate fi internat!");
    }
}
