package Flyweight.clase;

import java.util.HashMap;

public class FabricaClienti {
    private HashMap<Integer, IClient> clienti;

    public FabricaClienti() {
        this.clienti = new HashMap<>();
    }

    public IClient getClient(int idClient, String numeClient){
        if(this.clienti.get(idClient) != null){
            return this.clienti.get(idClient);
        } else{
            IClient client = new Client(idClient, numeClient);
            this.clienti.put(idClient, client);
            return client;
        }
    }
}
