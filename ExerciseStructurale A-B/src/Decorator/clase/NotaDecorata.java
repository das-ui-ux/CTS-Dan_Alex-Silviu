package Decorator.clase;

public class NotaDecorata extends Decorator{
    public NotaDecorata(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaMesajClient() {
        System.out.println("La multi ani!");
    }
}
