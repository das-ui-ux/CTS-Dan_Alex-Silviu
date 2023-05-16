package Command.clase;

public class ComandaRezervareMasa implements IComanda{
    private IOperator operator;

    public ComandaRezervareMasa(IOperator operator) {
        this.operator = operator;
    }

    @Override
    public void execute() {
        operator.rezervaMasa();
    }
}
