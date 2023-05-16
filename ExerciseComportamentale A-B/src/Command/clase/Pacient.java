package Command.clase;

public class Pacient implements IPacient{
    private String numePacient;

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void internarePacient() {
        System.out.println("Pacientul " + this.numePacient + " a fost iternat!");
    }

    @Override
    public void tratareImediataPacient(int nrCabinet) {
        System.out.println("Pacientul " + this.numePacient + " este tratat imediat!");
    }
}
