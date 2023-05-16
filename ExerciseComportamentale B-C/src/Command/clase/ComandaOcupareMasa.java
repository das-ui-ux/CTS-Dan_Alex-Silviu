package Command.clase;

public class ComandaOcupareMasa implements IComanda{
    private IOperator operator;

    public ComandaOcupareMasa(IOperator operator) {
        this.operator = operator;
    }

    @Override
    public void execute() {
        operator.ocupaMasa();
    }
}
