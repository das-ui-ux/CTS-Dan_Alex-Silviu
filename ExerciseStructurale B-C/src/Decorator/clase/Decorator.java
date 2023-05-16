package Decorator.clase;

public abstract class Decorator implements IBon{
    private IBon bon;

    public Decorator(IBon bon) {
        this.bon = bon;
    }

    public IBon getBon() {
        return bon;
    }

    @Override
    public void printeazaBon() {
        this.bon.printeazaBon();
        printeazaMesaj();
    }

    public abstract void printeazaMesaj();

}
