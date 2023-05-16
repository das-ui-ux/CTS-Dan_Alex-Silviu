package Proxy.clase;

public class Proxy implements IMedicament{
    private IMedicament medicament;

    public Proxy(IMedicament medicament) {
        this.medicament = medicament;
    }

    @Override
    public void achizitionareMedicament(boolean retetaClient) {
        if(retetaClient == true){
            this.medicament.achizitionareMedicament(retetaClient);
        } else{
            System.out.println("Clientul nu are retea!");
        }
    }
}
