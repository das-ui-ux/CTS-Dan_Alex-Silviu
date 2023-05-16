package Decorator.clase;

public abstract class Decorator implements INota{
    private INota nota;

    public Decorator(INota nota) {
        this.nota = nota;
    }

    public INota getNota() {
        return nota;
    }

    @Override
    public void printeazaNota() {
        this.nota.printeazaNota();
        printeazaMesajClient();
    }

    public abstract void printeazaMesajClient();
}
