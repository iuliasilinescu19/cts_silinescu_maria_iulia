package ro.ase.cts.Strategy.Program;

import ro.ase.cts.Strategy.Classes.Client;
import ro.ase.cts.Strategy.Classes.PlataBonuriMasa;
import ro.ase.cts.Strategy.Classes.PlataCard;
import ro.ase.cts.Strategy.Classes.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Maria-Iulia",new PlataCash());
        client.platesteNota(200);
        client.setPlata(new PlataCard());
        client.platesteNota(100.2f);
        //Cand avem de testat Strategy sa incercam macar sa testam toate strategiile.
        client.setPlata(new PlataBonuriMasa());
        client.platesteNota(3888f);
    }
}
