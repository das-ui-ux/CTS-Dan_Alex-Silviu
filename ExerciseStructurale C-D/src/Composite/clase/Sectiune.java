package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IMedicament{
    private List<IMedicament> medicaments;
    private String denumireSectiune;

    public Sectiune(String denumireSectiune) {
        this.denumireSectiune = denumireSectiune;
        this.medicaments = new ArrayList<>();
    }

    @Override
    public void adaugareNod(IMedicament medicament) {
        this.medicaments.add(medicament);
    }

    @Override
    public void stergereNod(IMedicament medicament) {
        this.medicaments.remove(medicament);
    }

    @Override
    public IMedicament getNod(int idNod) {
        return this.medicaments.get(idNod);
    }

    @Override
    public void afisare() {
        System.out.println("Sectiunea " + denumireSectiune);
        for(IMedicament medicament: medicaments){
            System.out.println("Medicamentul " + medicament);
        }
    }
}
