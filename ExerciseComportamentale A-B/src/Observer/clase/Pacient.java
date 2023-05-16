package Observer.clase;

public class Pacient implements Observer{
    private String numePacient;

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(this.numePacient + " ai primit urmatorul mesaj: " + mesaj);
    }
}
