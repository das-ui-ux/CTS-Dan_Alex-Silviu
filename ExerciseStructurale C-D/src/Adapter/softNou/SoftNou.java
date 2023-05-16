package Adapter.softNou;

public class SoftNou implements ISoftNou{
    private String numeSoft;
    private int numarTotalMedicament;

    public SoftNou(String numeSoft, int numarTotalMedicament) {
        this.numeSoft = numeSoft;
        this.numarTotalMedicament = numarTotalMedicament;
    }

    @Override
    public boolean verificaStocPentruMedicament(int id, int nrDorit) {
        if(nrDorit <= numarTotalMedicament){
            return true;
        }else{
            return false;
        }
    }
}
