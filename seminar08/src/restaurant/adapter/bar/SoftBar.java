package restaurant.adapter.bar;

public class SoftBar implements  ISoftBar{

    private String denumire;
    private double totalPlataNota;

    public SoftBar(String numeBar) {
        this.denumire = numeBar;
    }

    @Override
        public void printeazaNotaBauturi(double totalPlataNota) {
            System.out.println("Barul " + this.denumire +
                    " a emis nota aferentta bauturilor consumate in valoare de " + totalPlataNota);
        }
}
