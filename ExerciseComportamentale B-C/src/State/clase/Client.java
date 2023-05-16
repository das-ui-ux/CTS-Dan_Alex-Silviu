package State.clase;

public class Client {
    private String numeClient;
    private IStare stare;

    public Client(String numeClient) {
        this.numeClient = numeClient;
        this.stare = new StareLibera();
    }

    public IStare getStare() {
        return stare;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }

    public void rezervareMasa(){
        IStare stare = new StareRezervata();
        stare.modificaStare(this);
    }

    public void ocupareMasa(){
        IStare stare = new StareOcupata();
        stare.modificaStare(this);
    }

    public void eliberareMasa(){
        IStare stare = new StareLibera();
        stare.modificaStare(this);
    }
}
