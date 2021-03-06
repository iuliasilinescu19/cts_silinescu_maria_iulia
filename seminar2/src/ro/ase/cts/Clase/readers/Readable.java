package ro.ase.cts.Clase.readers;

import ro.ase.cts.Clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface Readable {
    List<Aplicant> readAplicanti(String file)throws FileNotFoundException;
}
