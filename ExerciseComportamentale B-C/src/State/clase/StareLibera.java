package State.clase;

public class StareLibera implements IStare{
    @Override
    public void modificaStare(Client client) {
        if(client.getStare() instanceof StareRezervata || client.getStare() instanceof StareOcupata){
            client.setStare(this);
            System.out.println("Masa este libera!");
        }
    }
}
