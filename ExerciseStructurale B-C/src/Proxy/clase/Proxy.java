package Proxy.clase;

public class Proxy implements IMedicament{
    private IMedicament medicament;

    public Proxy(IMedicament medicament) {
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament(boolean retetaClient) {
        if(retetaClient == true){
            this.medicament.cumparaMedicament(retetaClient);
        } else{
            System.out.println("Clientul nu are reteta si nu poate achizitiona medicamentul!");
        }

    }
}
