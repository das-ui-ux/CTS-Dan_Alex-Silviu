package Flyweight.clase;

public class Client implements IClient{
    private Integer id;
    private String nume;
    private Integer nrTelefon;

    public Client(Integer id, String nume, Integer nrTelefon) {
        this.id = id;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrTelefon=" + nrTelefon +
                '}';
    }

    @Override
    public void retineClient(DetaliiRezervare detaliiRezervare) {
        System.out.println(this.toString() + detaliiRezervare.toString());
    }
}
