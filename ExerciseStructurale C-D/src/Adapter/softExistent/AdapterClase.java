package Adapter.softExistent;

import Adapter.softNou.SoftNou;

public class AdapterClase extends SoftNou implements ISoftExistent {
    private int nrDorit;
    public AdapterClase(String numeSoft, int numarTotalMedicament, int nrDorit) {
        super(numeSoft, numarTotalMedicament);
        this.nrDorit = nrDorit;
    }

    @Override
    public void setareMedicament(int id) {
       if(super.verificaStocPentruMedicament(id, this.nrDorit) == true){
           System.out.println("Medicamentul cu id-ul " + id + " a fost setat");
       }
    }

    @Override
    public boolean verificareDisponibilitate(int id, int nrMedicamenteDorite) {
        return true;
    }
}
