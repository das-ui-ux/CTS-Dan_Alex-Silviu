package State.main;

import State.clase.Bancomat;

//Problema 13 din sectiunea Banca -- design patern: State
public class Main {
    public static void main(String[] args) {

        Bancomat bancomat = new Bancomat(1000);
        bancomat.introducePIN();
        bancomat.retrageCard();
        bancomat.introducePIN();
        bancomat.retrageBani(200);
        bancomat.introduceCard();
        bancomat.retrageBani(500);
        bancomat.introducePIN();
        bancomat.retrageBani(1000);
        bancomat.retrageCard();
    }
}