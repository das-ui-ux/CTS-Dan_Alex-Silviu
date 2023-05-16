package Proxy.clase;

public class Proxy implements ICont{
    private ICont cont;

    public Proxy(ICont cont) {
        this.cont = cont;
    }

    @Override
    public void creareCont(String valuta) {
        if(valuta == "RON"){
            cont.creareCont(valuta);
        } else{
            System.out.println("Nu se poate crea conturi in alta valuta! Doar in lei.");
        }

    }
}
