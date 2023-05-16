package Adapter.softExistent;

import Adapter.softNou.ISoftNou;

public class AdapterObiecte implements ISoftExistent{
    private ISoftNou softNou;
    private int nrDorit;

    @Override
    public void setareMedicament(int id) {
//        if(softNou.verificaStocPentruMedicament(id, this.nrDorit)){
            System.out.println("Medicamentul este setat " + id);
//        }
        softNou.verificaStocPentruMedicament(id, nrDorit);
    }

    @Override
    public boolean verificareDisponibilitate(int id, int nrMedicamenteDorite) {
        return false;
    }
}
