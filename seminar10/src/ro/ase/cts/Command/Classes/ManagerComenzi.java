package ro.ase.cts.Command.Classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    //Tine o coada/Colectie de comenzi (invoca/executa)
    private List<ComandaAbstracta> listaComenzi=new ArrayList<>();
    public void adaugaComanda(ComandaAbstracta comanda)
    {
        this.listaComenzi.add(comanda);
    }
    //Lista se va gestiona sub forma unei cozi. (Comenzi de la inceputul listei)
   //FIFO FIrST IN FIRST OUT
    public void executaComanda()
    {
        if(listaComenzi.size()>0)
        {
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
    }
}
