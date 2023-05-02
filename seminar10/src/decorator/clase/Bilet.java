package decorator.clase;

public class Bilet implements IBilet{
    private String numeCumparator;
    private String numeEchipe1;
    private String numeEchipe2;

    public Bilet(String numeCumparator, String numeEchipe1, String numeEchipe2) {
        this.numeCumparator = numeCumparator;
        this.numeEchipe1 = numeEchipe1;
        this.numeEchipe2 = numeEchipe2;
    }


    @Override
    public void printareBilet() {
        System.out.println(this.toString());
    }

    public String getNumeEchipe1() {
        return numeEchipe1;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "numeCumparator='" + numeCumparator + '\'' +
                ", numeEchipe1='" + numeEchipe1 + '\'' +
                ", numeEchipe2='" + numeEchipe2 + '\'' +
                '}';
    }
}
