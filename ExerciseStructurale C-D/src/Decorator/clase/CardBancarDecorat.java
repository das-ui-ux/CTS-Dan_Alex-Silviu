package Decorator.clase;

public class CardBancarDecorat extends Decorator{
    public CardBancarDecorat(ICardBancar cardBancar) {
        super(cardBancar);
    }

    @Override
    public void platesteContactLess() {
        System.out.println("Plata contactLess cu cardul!");
    }
}
