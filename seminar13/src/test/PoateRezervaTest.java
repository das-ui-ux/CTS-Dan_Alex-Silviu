package test;

import Persoana.IPersoana;
import Persoana.PachetTuristic;
import categorii.Categorie1;
import categorii.Categorie2;
import dubluri.StubPersoana;
import dubluri.StubPersoanaMinora;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PoateRezervaTest {

    @Tag("tag1")
    @Test
    void poateRezerva() {
        IPersoana persoana = new StubPersoana();
        PachetTuristic pachet = new PachetTuristic(persoana, "Dubai", 1500.0);
        assertTrue(pachet.poateRezerva());
    }


    @Test
    void nuPoateRezervaPachet(){
        IPersoana persoana = new StubPersoanaMinora();
        PachetTuristic pachet = new PachetTuristic(persoana, "Cuba", 2300.0);
        assertFalse(pachet.poateRezerva());
    }
}