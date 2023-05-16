package Strategy.clase;

public class PlataCash implements IPlata{
    @Override
    public void platesteNota() {
        System.out.println("Clientul a platit cash!");
    }
}
