package dubluri;

import Persoana.IPersoana;

public class StubPersoana implements IPersoana {


    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 21;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
