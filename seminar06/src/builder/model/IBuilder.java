package builder.model;

public interface IBuilder {
    Pacient build();
    public IBuilder setNumePacient(String numePacient);

    public IBuilder setPatRabatabil(Boolean patRabatabil);

    public IBuilder setMicDejunInclus(Boolean micDejunInclus);

    public IBuilder setPapuciDeCamera(Boolean papuciDeCamera);

    public IBuilder setHalat(Boolean halat);
}
