package State.clase;

public class StareRezervata implements IStare{
    @Override
    public void modificaStare(Client client) {
        if(client.getStare() instanceof StareLibera){
            client.setStare(this);
            System.out.println("Masa a fost rezervata!");
        } else{
            System.out.println("Masa nu este libera astfel nu poate fi rezervata!");
        }
    }
}
