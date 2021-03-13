package ro.ase.cts.Program;

import ro.ase.cts.Clase.Angajat;
import ro.ase.cts.Clase.Aplicant;
import ro.ase.cts.Clase.Elev;
import ro.ase.cts.Clase.readers.AngajatiReader;
import ro.ase.cts.Clase.readers.EleviReader;
import ro.ase.cts.Clase.readers.StudentiReader;
import ro.ase.cts.Clase.readers.Readable;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(Readable reader) throws FileNotFoundException {
		return reader.readAplicanti();
	}
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			//vrem ca cei doi parametri sa fie primiti dintr-un singur loc
			//Fisierul sa coincida cu reader-ul.
			listaAplicanti = citesteAplicanti(new EleviReader("seminar2/elevi.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}