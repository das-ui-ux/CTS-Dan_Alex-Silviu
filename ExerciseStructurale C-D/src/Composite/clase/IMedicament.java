package Composite.clase;

public interface IMedicament {
    void adaugareNod(IMedicament medicament) throws Exception;
    void stergereNod(IMedicament medicament) throws Exception;
    IMedicament getNod(int idNod) throws Exception;

    void afisare();
}
