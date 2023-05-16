package Flyweight.clase;

import java.util.HashMap;
import java.util.List;

public class FabricaClienti {
    private HashMap<Integer, IClient> clienti;

    public FabricaClienti() {
        this.clienti = new HashMap<>();
    }

    public IClient getClient(String numeClient, int id){
        if(this.clienti.get(id) != null){
            return this.clienti.get(id);
        }else{
            IClient client = new Client(numeClient, id);
            this.clienti.put(id, client);
            return client;
        }
    }
}
