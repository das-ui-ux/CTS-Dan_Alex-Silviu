package Facade.clase;

public class FacadeMasa {
    private Masa masa;

    public FacadeMasa(Masa masa) {
        this.masa = masa;
    }

    public void verificareMasa(){
        masa.verificareMasaLibera();
        masa.verificareMasaDebarasata();
        masa.verificareMasaCuserveteleNoi();
    }
}
