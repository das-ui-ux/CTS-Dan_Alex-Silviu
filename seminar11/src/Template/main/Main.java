package Template.main;

import Template.clase.Bancomat;
import Template.clase.BancomatAbstract;
import Template.clase.BancomatBitcoin;

// Banca problema 14 - Template
public class Main {
    public static void main(String[] args){
        BancomatAbstract bancomat = new Bancomat("Romana");
        bancomat.scoateBaniDeLaBancomat(400);

        System.out.println();

        BancomatBitcoin bancomatBitcoin = new BancomatBitcoin("Universitatet");
        bancomatBitcoin.scoateBaniDeLaBancomat(1);
    }

}
