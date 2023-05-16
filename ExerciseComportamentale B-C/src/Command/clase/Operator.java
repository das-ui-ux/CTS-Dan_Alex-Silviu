package Command.clase;

public class Operator implements IOperator{
    public String nume;

    public Operator(String nume) {
        this.nume = nume;
    }

    @Override
    public void ocupaMasa() {
        System.out.println("Operatorul " + this.nume + " a generat ocuparea mesei!");
    }

    @Override
    public void rezervaMasa() {
        System.out.println("Operatorul " + this.nume + " a rezervat masa!");
    }
}
