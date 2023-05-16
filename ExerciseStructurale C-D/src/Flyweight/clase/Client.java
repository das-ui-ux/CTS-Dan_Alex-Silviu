package Flyweight.clase;

public class Client implements IClient{
    private String numeClient;
    private int id;

    public Client(String numeClient, int id) {
        this.numeClient = numeClient;
        this.id = id;
    }

    @Override
    public void realizareClient(FacereCont cont) {
        System.out.println("Clientul " + numeClient + cont.toString());
    }
}
