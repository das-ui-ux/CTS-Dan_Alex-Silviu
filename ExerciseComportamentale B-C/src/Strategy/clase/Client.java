package Strategy.clase;

public class Client {
    private String numeClient;

    private IPlata plata;

    public Client(String numeClient) {
        this.numeClient = numeClient;
        this.plata = new PlataCash();
    }

    public IPlata getPlata() {
        return plata;
    }

    public void setMetodaPlata(IPlata plata){
        this.plata = plata;
    }

    public void platesteNota(){
        this.plata.platesteNota();
    }

}
