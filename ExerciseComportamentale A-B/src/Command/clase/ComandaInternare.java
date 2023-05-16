package Command.clase;

public class ComandaInternare implements ICommand{
    private Pacient pacient;

    public ComandaInternare(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void execute() {
        pacient.internarePacient();
    }
}
