package classes;

public class Administrator {
    private String nume;
    private int varsta;

    // eager initialization - instanta este creata cand este incarcata clasa
    private static Administrator instanta = new Administrator("Gigel", 30);

    private Administrator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public static synchronized Administrator getInstance() {
        return instanta;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
