package ro.ase.cts.Program;

import ro.ase.cts.Prototype.Aplicant;
import ro.ase.cts.Prototype.Proiect;
import ro.ase.cts.Prototype.readers.EleviReader;
import ro.ase.cts.Prototype.readers.Readable;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(Readable reader) throws FileNotFoundException {
		return reader.readAplicanti();
	}
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		Proiect proiect=new Proiect(80);
		try {
			//vrem ca cei doi parametri sa fie primiti dintr-un singur loc
			//Fisierul sa coincida cu reader-ul.
			listaAplicanti = citesteAplicanti(new EleviReader("seminar2/elevi.txt"));
			for(Aplicant aplicant:listaAplicanti){
				System.out.println(aplicant.toString());
			    System.out.println(aplicant.getFinantare());
			    aplicant.displayStateInProject(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
