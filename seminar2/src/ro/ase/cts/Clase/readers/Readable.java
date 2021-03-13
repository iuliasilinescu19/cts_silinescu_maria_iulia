package ro.ase.cts.Clase.readers;

import ro.ase.cts.Clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class Readable {
    protected String fileName;
    public abstract List<Aplicant> readAplicanti()throws FileNotFoundException;

    public Readable(String fileName) {
        this.fileName = fileName;
    }

    public void readAplicant(Scanner scanner,Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        //Am putea avea un set-er compus care sa primeasca
        //valori atat pt nr cat si vpentru vector
        aplicant.setDenumireProiect(vect,nr);
        //return aplicant;->nu il mai returnam
    }
}
