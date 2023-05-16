package Decorator.clase;

public class BonDecorat extends Decorator{
    public BonDecorat(IBon bon) {
        super(bon);
    }

    @Override
    public void printeazaMesaj() {
    System.out.println("La multi ani " + super.getBon());
    }
}
