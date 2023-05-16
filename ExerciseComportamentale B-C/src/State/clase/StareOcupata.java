package State.clase;

public class StareOcupata implements IStare{
    @Override
    public void modificaStare(Client client) {
        if(client.getStare() instanceof StareRezervata){
            client.setStare(this);
            System.out.println("Masa este ocupata!");
        } else{
            System.out.println("Masa nu poate fi ocupata!");
        }
    }
}
