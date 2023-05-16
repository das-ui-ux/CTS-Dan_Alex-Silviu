package Composite.clase;

public interface OptiuneMeniu {
    public void adaugareNod(OptiuneMeniu optiuneMeniu) throws Exception;
    public void stergereNod(OptiuneMeniu optiuneMeniu) throws Exception;
    public OptiuneMeniu getNod(int index) throws Exception;
    public void descriere();
}
