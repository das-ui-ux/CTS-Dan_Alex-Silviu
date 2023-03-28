package builder.model;

public class Pacient {
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halat;

    public Pacient() {
    }

    public Pacient(String numePacient, boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halat) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halat = halat;
    }


    protected void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    protected void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    protected void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        return "model.Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halat=" + halat +
                '}';
    }
}
