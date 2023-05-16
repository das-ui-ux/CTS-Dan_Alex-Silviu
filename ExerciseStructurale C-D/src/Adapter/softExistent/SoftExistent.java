package Adapter.softExistent;

public class SoftExistent implements ISoftExistent{
    private String numeSoft;
    private int nrMedicamenteDorite;

    public SoftExistent(String numeSoft, int nrMedicamenteDorite) {
        this.numeSoft = numeSoft;
        this.nrMedicamenteDorite = nrMedicamenteDorite;
    }

    @Override
    public void setareMedicament(int id) {
        System.out.println("A fost setat medicamentul cu id-ul " + id);
        verificareDisponibilitate(id, this.nrMedicamenteDorite);
    }

    @Override
    public boolean verificareDisponibilitate(int id, int nrMedicamenteDorite) {
        if(nrMedicamenteDorite <= this.nrMedicamenteDorite){
            return true;
        } else{
            return false;
        }
    }
}
