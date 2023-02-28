package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class ReaderAplicant {
    public String fileName;
    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public ReaderAplicant(String file){
        this.fileName = file;
    }

    public String getFileName() {
        return fileName;
    }
}
