package Adapter.bucatarie;

import Adapter.bar.ISoftBar;

public class AdapterObiecte implements ISoftBucatarie{
    private ISoftBar softBar;

    public AdapterObiecte(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalNota) {
        this.softBar.printeazaNota(totalNota);
    }
}
