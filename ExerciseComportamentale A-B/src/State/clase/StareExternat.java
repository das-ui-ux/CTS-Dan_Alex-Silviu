package State.clase;

public class StareExternat implements IPacientStare{
    @Override
    public void modificaStare(Pacient pacient) {
        if(pacient.getStare() instanceof StareInternat || pacient.getStare() instanceof StareSubObservatie){
            pacient.setStare(this);
            System.out.println("Pacientul a fost externat!");
        }
    }
}
