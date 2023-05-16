package Composite.clase;

public class Subsectiune implements IMedicament{
    private String numeSubsectiune;

    public Subsectiune(String numeSubsectiune) {
        this.numeSubsectiune = numeSubsectiune;
    }

    @Override
    public void adaugareNod(IMedicament medicament) throws Exception {
        throw new Exception("Not implemented yet");
    }

    @Override
    public void stergereNod(IMedicament medicament) throws Exception {
        throw new Exception("Not implemented yet");
    }

    @Override
    public IMedicament getNod(int idNod) throws Exception {
        throw new Exception("Not implemented yet");
    }

    @Override
    public void afisare() {
        System.out.println("Nume subsectiune " + numeSubsectiune);
    }
}
