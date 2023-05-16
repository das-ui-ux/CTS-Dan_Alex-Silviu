package Composite.clase;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element{
    private List<Element> elemente;
    private String denumireGrup;

    public Grup(String denumireGrup) {
        this.denumireGrup = denumireGrup;
        this.elemente = new ArrayList<>();
    }

    @Override
    public void adaugaGrup(Element element) throws ExecutionControl.NotImplementedException {
        this.elemente.add(element);
    }

    @Override
    public void stergeGrup(Element element) throws ExecutionControl.NotImplementedException {
        this.elemente.remove(element);
    }

    @Override
    public Element getGrup(int pozitieGrup) throws ExecutionControl.NotImplementedException {
        return this.elemente.get(pozitieGrup);
    }

    @Override
    public void afiseazaNumeSectie(String numeSectie) {
        for(Element element: elemente){
            System.out.println("Nume sectie " + numeSectie);
        }

    }
}
