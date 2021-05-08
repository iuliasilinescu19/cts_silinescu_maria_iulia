package ro.ase.cts.ChainOfResponsability.Program;

import ro.ase.cts.ChainOfResponsability.Classes.Cont;
import ro.ase.cts.ChainOfResponsability.Classes.ContCredit;
import ro.ase.cts.ChainOfResponsability.Classes.ContCurent;
import ro.ase.cts.ChainOfResponsability.Classes.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent=new ContCurent(200f);
        Cont contCredit=new ContCredit(150f);
        Cont contEconomii=new ContEconomii(300f);
        contCurent.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);
        contCurent.realizeazaPlata(100f);
        contCurent.realizeazaPlata(150f);
        contCurent.realizeazaPlata(100f);
        contCurent.realizeazaPlata(200f);

    }
}
