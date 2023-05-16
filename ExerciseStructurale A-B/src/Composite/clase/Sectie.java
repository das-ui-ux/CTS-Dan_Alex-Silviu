package Composite.clase;

import jdk.jshell.spi.ExecutionControl;

public class Sectie implements Element{
    private String numeSectie;

    public Sectie(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void adaugaGrup(Element element) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Operatia nu este implementata!");
    }

    @Override
    public void stergeGrup(Element element) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Operatia nu este implementata!");

    }

    @Override
    public Element getGrup(int pozitieGrup) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Operatia nu este implementata!");
    }

    @Override
    public void afiseazaNumeSectie(String numeSectie) {
        System.out.println("Numele sectiei este " + this.numeSectie);
    }
}
