package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {
    public String fileName;
    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public ReaderAplicant(String file){
        this.fileName = file;
    }

    public String getFileName() {
        return fileName;
    }
    public void citesteAplicant(Scanner scanner, Aplicant aplicant){
        aplicant.setNume(scanner.next());
        aplicant.setPrenume(scanner.next());
        aplicant.setVarsta(scanner.nextInt());
        aplicant.setPunctaj(scanner.nextInt());
        aplicant.setNr_proiecte(scanner.nextInt());
        String[] denumiriProiecte = new String[aplicant.getNr_proiecte()];
        for (int i = 0; i < aplicant.getNr_proiecte(); i++)
            denumiriProiecte[i] = scanner.next();
        aplicant.setDenumiriProiect(denumiriProiecte);
    }
}
