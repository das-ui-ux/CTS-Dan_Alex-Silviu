package Adapter.bucatarie;

public class SoftBucatarie implements ISoftBucatarie{
    private String numeBucatarie;

    public SoftBucatarie(String numeBucatarie) {
        this.numeBucatarie = numeBucatarie;
    }

    @Override
    public void printeazaNota(double totalNota) {
        System.out.println("Bucataria "+ this.numeBucatarie);
        System.out.println("Nota este in valoare de: " + totalNota);
    }
}
