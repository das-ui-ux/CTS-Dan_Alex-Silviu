package Command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ICommand> commands = new ArrayList<>();
    public void invocaComanda(ICommand command) {
        commands.add(command);
    }

    public void executaComanda(){
        if(this.commands.size() != 0){
            this.commands.get(0).execute();
            this.commands.remove(this.commands.get(0));
        }
    }
}
