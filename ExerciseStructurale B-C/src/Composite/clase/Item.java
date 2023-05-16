package Composite.clase;

public class Item implements OptiuneMeniu{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugareNod(OptiuneMeniu optiuneMeniu) throws Exception {
        throw new Exception("Not implemented yet!");
    }

    @Override
    public void stergereNod(OptiuneMeniu optiuneMeniu) throws Exception {
        throw new Exception("Not implemented yet!");
    }

    @Override
    public OptiuneMeniu getNod(int index) throws Exception {
        throw new Exception("Not implemented yet!");
    }

    @Override
    public void descriere() {
        System.out.println("Item " + this.nume);
    }
}
