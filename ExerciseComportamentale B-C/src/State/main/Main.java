package State.main;


import State.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Alex");
        client.rezervareMasa();
        client.ocupareMasa();
        client.eliberareMasa();
        client.ocupareMasa();
    }
}
