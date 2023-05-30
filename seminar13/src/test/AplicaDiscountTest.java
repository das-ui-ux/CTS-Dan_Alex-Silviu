package test;

import Persoana.PachetTuristic;
import categorii.Categorie1;
import categorii.Categorie2;
import dubluri.FakePersoana;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {

    @Tag("tag2")
    @Test
    void aplicaDiscountVarstnici() {
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(65);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Baile Herculane", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(800, pachetTuristic.getPret());
    }

    @Tag("tag1")
    @Test
    void nuAplicaDiscountVarstnici(){
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(25);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Baile Herculane", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(1000, pachetTuristic.getPret());
    }
}