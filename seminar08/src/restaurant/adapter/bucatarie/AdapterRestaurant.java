package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftResturant {

    public AdapterRestaurant(String numeBar) {
        super(numeBar);
    }

    @Override
    public void printeazaNota(double totalSuma) {
        super.printeazaNotaBauturi(totalSuma);
    }
}
