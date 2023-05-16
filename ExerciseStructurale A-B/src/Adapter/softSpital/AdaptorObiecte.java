package Adapter.softSpital;

import Adapter.softFarmacie.ISoftFarmacie;

public class AdaptorObiecte implements ISoftSpital{
    private ISoftFarmacie softFarmacie;

    public AdaptorObiecte(ISoftFarmacie farmacie) {
        this.softFarmacie = farmacie;
    }

    @Override
    public void achizitioneazaMedicament(double pretMedicament) {
        this.softFarmacie.cumparaMedicament(pretMedicament);
    }

    @Override
    public void prezintaReteta() {

    }
}
