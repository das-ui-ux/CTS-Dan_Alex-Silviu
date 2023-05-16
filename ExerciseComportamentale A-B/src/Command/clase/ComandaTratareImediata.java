package Command.clase;

public class ComandaTratareImediata implements ICommand{
    private int nrSalon;
    private Pacient pacient;

    public ComandaTratareImediata(int nrSalon, Pacient pacient) {
        this.nrSalon = nrSalon;
        this.pacient = pacient;
    }

    @Override
    public void execute() {
        pacient.tratareImediataPacient(this.nrSalon);
    }
}
