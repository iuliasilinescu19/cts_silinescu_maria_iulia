package ro.ase.cts.Composite.Classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta {
    private String numeSectiune;

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    public Sectiune(String numeSectiune, List<ComponentaAbstracta> listaComponente) {
        this.numeSectiune = numeSectiune;
        this.listaComponente = listaComponente;
    }

    private List<ComponentaAbstracta> listaComponente=new ArrayList<>();
    @Override
    public void printareElement() {
        System.out.println("Sectiunea "+this.numeSectiune);
        for(ComponentaAbstracta componentaAbstracta:listaComponente)
        {
            componentaAbstracta.printareElement();
        }
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta!=null)
        {
            listaComponente.add(componentaAbstracta);
        }
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta!=null)
        {
            listaComponente.remove(componentaAbstracta);
        }
        listaComponente.remove(componentaAbstracta);
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        if(pozitie>=0 && pozitie<listaComponente.size())
        {
            return listaComponente.get(pozitie);
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
    }
}
