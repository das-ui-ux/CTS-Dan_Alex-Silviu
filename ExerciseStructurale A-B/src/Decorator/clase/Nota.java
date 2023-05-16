package Decorator.clase;

public class Nota implements INota{

    private String numeCumparator;

    public Nota(String numeCumparator) {
        this.numeCumparator = numeCumparator;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "numeCumparator='" + numeCumparator + '\'' +
                '}';
    }

    @Override
    public void printeazaNota() {
        System.out.println(this.toString());
    }

}
