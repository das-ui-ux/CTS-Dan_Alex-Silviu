package Strategy.clase;

public class Calator {
    private String nume;
    private TipPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.metodaPlata = new PlataCardCalatorii();
    }

    //la strategy avem posibilitatea sa schimbam din main iar la state nu putem, acestia trb sa fie protected
    public TipPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(TipPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(double tarifBilet){
        this.metodaPlata.plateste(tarifBilet);
    }

}
