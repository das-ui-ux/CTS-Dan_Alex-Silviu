package Flyweight.clase;

import java.util.HashMap;

public class FabricaClienti {
    private HashMap<Integer, IClient> clienti;

    public FabricaClienti() {
        this.clienti = new HashMap<>();
    }

    public IClient getClient(int id, String nume, int nrTelefon){
        if(this.clienti.get(id) != null){
            return this.clienti.get(id);
        } else{
            IClient client = new Client(id, nume, nrTelefon);
            this.clienti.put(id, client);
            return client;
        }
    }
}
