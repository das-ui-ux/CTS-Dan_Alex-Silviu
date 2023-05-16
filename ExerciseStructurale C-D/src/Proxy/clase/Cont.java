package Proxy.clase;

public class Cont implements ICont{

    private int nrCont;

    public Cont(int nrCont) {
        this.nrCont = nrCont;
    }

    @Override
    public void creareCont(String valuta) {
        System.out.println("S-a creat contul cu numarul " + this.nrCont + " in valuta " + valuta);
    }
}
