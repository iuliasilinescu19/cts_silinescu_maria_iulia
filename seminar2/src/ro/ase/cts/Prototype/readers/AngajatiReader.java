package ro.ase.cts.Prototype.readers;

import ro.ase.cts.Prototype.Angajat;
import ro.ase.cts.Prototype.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends Readable {

    public AngajatiReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.fileName));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat angajat=new Angajat();
            super.readAplicant(input2, angajat);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            //Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
