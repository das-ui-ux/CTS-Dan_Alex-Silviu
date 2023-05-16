package Command.clase;

public class ComamandAducereMedicament implements ICommand{
    private IAjutorFarmacist ajutorFarmacist;

    public ComamandAducereMedicament(IAjutorFarmacist ajutorFarmacist) {
        this.ajutorFarmacist = ajutorFarmacist;
    }

    @Override
    public void execute() {
        ajutorFarmacist.aducereMedicament();
    }
}
