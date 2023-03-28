package builder.model;

public class PacientBuilderV2 implements IBuilder{
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halat;

    public PacientBuilderV2(String numePacient) {
        this.numePacient = numePacient;
    }

    public IBuilder setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    @Override
    public IBuilder setPatRabatabil(Boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public IBuilder setMicDejunInclus(Boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    @Override
    public IBuilder setPapuciDeCamera(Boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
        return this;
    }

    @Override
    public IBuilder setHalat(Boolean halat) {
        this.halat = halat;
        return this;
    }
    @Override
    public Pacient build() {
        Pacient pacient = new Pacient(numePacient, patRabatabil, micDejunInclus, papuciDeCamera, halat);
        return pacient;
    }


}
