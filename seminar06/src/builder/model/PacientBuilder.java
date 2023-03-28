package builder.model;

public class PacientBuilder implements IBuilder {
    private Pacient pacient;

    public PacientBuilder() {
        this.pacient = pacient;
    }

    @Override
    public IBuilder setNumePacient(String numePacient) {
        return null;
    }

    public PacientBuilder setPatRabatabil(Boolean patRabatabil) {
        pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejunInclus(Boolean micDejunInclus) {
        pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(Boolean papuciDeCamera) {
        pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public PacientBuilder setHalat(Boolean halat) {
        pacient.setHalat(halat);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
};
