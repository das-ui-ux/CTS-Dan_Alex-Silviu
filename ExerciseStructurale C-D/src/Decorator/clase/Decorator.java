package Decorator.clase;

public abstract class Decorator implements ICardBancar{
    private ICardBancar cardBancar;

    public Decorator(ICardBancar cardBancar) {
        this.cardBancar = cardBancar;
    }

    @Override
    public void platesteOnline() {
        cardBancar.platesteOnline();
    }

    @Override
    public void platesteNormal() {
        cardBancar.platesteNormal();
        platesteContactLess();
    }

    public abstract void platesteContactLess();
}
