package Facade.clase;

public class Masa {
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void verificareMasaLibera(){
        System.out.println("Masa cu numarul " + this.nrMasa + " este libera!");
    }

    public void verificareMasaDebarasata(){
        System.out.println("Masa cu numarul " + this.nrMasa + " a fost debarasata de ultimul client!");
    }

    public void verificareMasaCuserveteleNoi(){
        System.out.println("Masa cu numarul " + this.nrMasa + " are servetele noi!");
    }

}
