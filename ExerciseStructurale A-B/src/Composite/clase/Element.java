package Composite.clase;

import jdk.jshell.spi.ExecutionControl;

public interface Element {
    public void adaugaGrup(Element element) throws ExecutionControl.NotImplementedException;
    public void stergeGrup(Element element) throws ExecutionControl.NotImplementedException;
    public Element getGrup(int pozitieGrup) throws ExecutionControl.NotImplementedException;
    public void afiseazaNumeSectie(String numeSectie);
}
