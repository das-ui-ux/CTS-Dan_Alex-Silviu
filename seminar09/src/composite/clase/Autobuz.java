package composite.clase;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements Element {
    private String producator;
    private int capacitateCilindrica;
    private int numarLocuri;

    public Autobuz(String producator, int capacitateCilindrica, int numarLocuri) {
        this.producator = producator;
        this.capacitateCilindrica = capacitateCilindrica;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public float calculeazaSumaAsigurare() {
        float suma = 1.5F * this.capacitateCilindrica;
        return suma;
    }

    @Override
    public void adaugaGrup(Element element) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Operatia nu este implementata!");
        // sau throw new IllegalArgumentException("....")
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
    public void afisareSumaAsigurare() {
        System.out.println("Suma de asigurare pt autobuzul" + this.producator +  " este " + this.calculeazaSumaAsigurare());
    }
}
