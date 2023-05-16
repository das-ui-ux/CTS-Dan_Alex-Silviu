package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements OptiuneMeniu{
    private List<OptiuneMeniu> optiuni;
    private String nume;

    public Categorie(String nume) {
        this.nume = nume;
        this.optiuni = new ArrayList<>();
    }

    @Override
    public void adaugareNod(OptiuneMeniu optiuneMeniu) {
        this.optiuni.add(optiuneMeniu);
    }

    @Override
    public void stergereNod(OptiuneMeniu optiuneMeniu) {
        this.optiuni.remove(optiuneMeniu);
    }

    @Override
    public OptiuneMeniu getNod(int index) {
        return this.optiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categorie " + this.nume);
        for(OptiuneMeniu optiuneMeniu: optiuni){
            optiuneMeniu.descriere();
        }
    }
}
