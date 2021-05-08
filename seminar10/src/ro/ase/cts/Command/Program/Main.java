package ro.ase.cts.Command.Program;

import ro.ase.cts.Command.Classes.*;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi=new ManagerComenzi();
        Executant cont=new Executant("Silinescu Maria-Iulia");
        ComandaConstituire comandaConstituire=new ComandaConstituire(cont,1000);
        managerComenzi.adaugaComanda(comandaConstituire);
        managerComenzi.adaugaComanda(new ComandaRetragere(cont,123f));
        managerComenzi.executaComanda();
        managerComenzi.adaugaComanda(new ComandaDepunere(cont,1234f));
        managerComenzi.adaugaComanda(new ComandaRetragere(cont,2800f));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
