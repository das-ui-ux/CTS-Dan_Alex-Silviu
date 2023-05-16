package Decorator.main;

import Decorator.clase.CardBancar;
import Decorator.clase.CardBancarDecorat;
import Decorator.clase.Decorator;
import Decorator.clase.ICardBancar;

public class Main {
    public static void main(String[] args) {
        ICardBancar cardBancar = new CardBancar(12);
        cardBancar.platesteNormal();
        cardBancar.platesteOnline();
        System.out.println();

        Decorator decorator = new CardBancarDecorat(cardBancar);
        decorator.platesteOnline();
        decorator.platesteNormal();
    }
}
