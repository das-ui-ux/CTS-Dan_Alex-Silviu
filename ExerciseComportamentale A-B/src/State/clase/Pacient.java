package State.clase;

public class Pacient {
    private IPacientStare stare;
    private String numePacient;

    public Pacient(String numePacient) {
        this.stare = new StareExternat();
        this.numePacient = numePacient;
    }

    public IPacientStare getStare() {
        return stare;
    }

    public void setStare(IPacientStare stare) {
        this.stare = stare;
    }

    public void interneazaPacient(){
        IPacientStare stare = new StareInternat();
        stare.modificaStare(this);
    }

    public void observaPacient(){
        IPacientStare stare = new StareSubObservatie();
        stare.modificaStare(this);
    }

    public void externeazaPacientul(){
        IPacientStare stare = new StareExternat();
        stare.modificaStare(this);
    }

}
