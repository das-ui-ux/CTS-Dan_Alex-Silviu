package Decorator.clase;

public class CardBancar implements ICardBancar{
    private int idCard;

    public CardBancar(int idCard) {
        this.idCard = idCard;
    }

    @Override
    public void platesteOnline() {
        System.out.println("Plata online cu cardul cu id-ul " + idCard);
    }

    @Override
    public void platesteNormal() {
        System.out.println("Plata normala cu cardul cu id-ul " + idCard);
    }
}
