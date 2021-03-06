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

	public static List<Aplicant> citesteAplicanti(String numeFisier, Readable reader) throws FileNotFoundException {
		return reader.readAplicanti(numeFisier);
	}
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti("seminar2/elevi.txt",new EleviReader());
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
