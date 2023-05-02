package strategy.clase;

public class Jandarm {
    private Strategy modVerificare;
    private String nume;

    public Jandarm(String nume) {
        this.modVerificare = new VerificarePeluza();
        this.nume = nume;
    }

    public void setModVerificare(Strategy modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaSpectator(Spectator s){
        this.modVerificare.modVerificareSpectator(s);
    }
}
