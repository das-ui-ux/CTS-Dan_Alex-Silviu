package Flyweight.clase;

public class Client implements IClient{
    private int idClient;
    private String numeClient;

    public Client(int idClient, String numeClient) {
        this.idClient = idClient;
        this.numeClient = numeClient;
    }

    @Override
    public void retineClient(InformatiiReteta informatiiReteta) {
        System.out.println("Clientul " + this.numeClient + informatiiReteta.toString());
    }
}
