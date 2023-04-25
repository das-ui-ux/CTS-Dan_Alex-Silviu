package facade.clase;

public class FacadeAutobuz {
    Autobuz autobuz;

    public FacadeAutobuz(String nrInmatriculare) {
        this.autobuz = new Autobuz(nrInmatriculare);
    }

    public void deschideUsi(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void ramaneLibera(){
        autobuz.remaneLiberaUsaFata();
        autobuz.remaneLiberaUsaMijloc();
        autobuz.remaneLiberaUsaSpate();
    }

}
