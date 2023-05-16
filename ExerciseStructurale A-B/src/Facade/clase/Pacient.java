package Facade.clase;

public class Pacient {
    private String numePacient;

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void verificareGravitateStarePacienta(){
        System.out.println("Pacientul " + this.numePacient + " a fost verificat!");
    }
}
