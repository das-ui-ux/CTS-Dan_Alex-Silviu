package Command.clase;

public class AjutorFarmacist implements IAjutorFarmacist{
    private String numeAjutorFarmacist;

    public AjutorFarmacist(String numeAjutorFarmacist) {
        this.numeAjutorFarmacist = numeAjutorFarmacist;
    }

    @Override
    public void aducereMedicament() {
        System.out.println("Ajutorul de farmacist " + numeAjutorFarmacist + " a adus medicamentul.");
    }
}
