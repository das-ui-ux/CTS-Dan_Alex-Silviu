package Composite.main;

import Composite.clase.Categorie;
import Composite.clase.Item;
import Composite.clase.OptiuneMeniu;

public class Main {
    public static void main(String[] args) throws Exception {
        OptiuneMeniu optiune1 = new Item("Apa Plata");
        OptiuneMeniu optiune2 = new Item("Apa Minerala");

        OptiuneMeniu bauturi = new Categorie("Bauturi");
        bauturi.adaugareNod(optiune1);
        bauturi.adaugareNod(optiune2);
        bauturi.descriere();

    }
}
