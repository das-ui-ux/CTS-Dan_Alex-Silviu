package Strategy.clase;

public class Pacient {
    private String numePacient;
    private TipPlata tipPlata;

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
        this.tipPlata = new PlataCash();
    }

    public TipPlata getTipPlata() {
        return tipPlata;
    }

    public void setTipPlata(TipPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void plateste(double suma){
        this.tipPlata.plateste(suma);
    }
}
