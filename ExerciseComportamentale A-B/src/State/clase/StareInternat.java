package State.clase;

public class StareInternat implements IPacientStare{
    @Override
    public void modificaStare(Pacient pacient) {
        if(pacient.getStare() instanceof StareExternat){
            pacient.setStare(this);
            System.out.println("Pacientul a fost internat!");
        } else{
            System.out.println("Pacientul este deja internat!");
        }
    }
}
