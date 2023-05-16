package Adapter.bucatarie;

import Adapter.bar.SoftBar;

public class AdapterClase extends SoftBar implements ISoftBucatarie{
    public AdapterClase(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalNota) {
        super.printeazaNota(totalNota);
    }
}
