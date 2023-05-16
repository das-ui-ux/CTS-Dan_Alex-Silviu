package Command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<IComanda> comenzi = new ArrayList<>();

    public void invocaComanda(IComanda comanda){
        comenzi.add(comanda);
    }

    public void executaComanda(){
        if(this.comenzi.size() != 0){
            this.comenzi.get(0).execute();
            this.comenzi.remove(this.comenzi.get(0));
        }
    }
}
