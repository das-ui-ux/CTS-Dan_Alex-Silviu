package Command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ICommand> comenzi = new ArrayList<>();
    //asteapta pana sa fie executat - folosim coada
    //daca nu e nevoie sa asteptam - folosim stack
    public void invocaComanda(ICommand command){
        comenzi.add(command);
    }

    public void executaComanda(){
        if(this.comenzi.size() !=0){
            this.comenzi.get(0).execute();
            this.comenzi.remove(this.comenzi.get(0));
        }

    }

}
