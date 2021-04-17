package ro.ase.cts.Composite.Program;

import ro.ase.cts.Composite.Classes.Produs;
import ro.ase.cts.Composite.Classes.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune bauturi=new Sectiune("bauturi");
        Sectiune desert=new Sectiune("desert");
        Produs cola=new Produs("Cola");
        Produs tiramisu=new Produs("Tiramisu");
        Produs frappe=new Produs("Frappe");

        Sectiune meniu=new Sectiune("Meniu");
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);

        bauturi.adaugaNod(cola);
        bauturi.adaugaNod(frappe);
        bauturi.adaugaNod(tiramisu);

        meniu.printareElement();
    }
}
