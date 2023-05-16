package State.clase;

public class StareSubObservatie implements IPacientStare{
    @Override
    public void modificaStare(Pacient pacient) {
        if(pacient.getStare() instanceof StareInternat){
            pacient.setStare(this);
            System.out.println("PAcientul este sub observatie");
        } else{
            System.out.println("Pacientul nu este sub observatie!");
        }
    }
}
