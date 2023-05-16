package Observer.clase;

public class Client implements Observer{
    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void notificaClient(String mesaj) {
        System.out.println(this.numeClient + " ai primit urmatorul mesaj: " + mesaj);
    }
}
