package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element {
    private List<Element> elemente;
    private String denumireGrup;

    public Grup(String denumireGrup) {
        this.elemente = new ArrayList<>();
        this.denumireGrup = denumireGrup;
    }

    @Override
    public float calculeazaSumaAsigurare() {
        float suma =0;
        for (Element element : elemente) {
            suma += element.calculeazaSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void adaugaGrup(Element element) {
        this.elemente.add(element);
    }

    @Override
    public void stergeGrup(Element element) {
        this.elemente.remove(element);
    }

    @Override
    public Element getGrup(int pozitieGrup) {
        return this.elemente.get(pozitieGrup);
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Suma de plata pt asigurare este de: " + this.calculeazaSumaAsigurare());
    }
}
