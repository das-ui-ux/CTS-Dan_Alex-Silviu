package Adapter.bar;

public class SoftBar implements ISoftBar{
    private String denumire;

    public SoftBar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void printeazaNota(double totalNota) {
        System.out.println("Barul " + this.denumire + " a printat nota in valoare de " + totalNota);
    }
}
