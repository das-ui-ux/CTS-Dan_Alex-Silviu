package factory_method;

public class Asistent implements PersonalSpital{
    private String nume;

    Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Asistentul " + this.nume);
    }
}
