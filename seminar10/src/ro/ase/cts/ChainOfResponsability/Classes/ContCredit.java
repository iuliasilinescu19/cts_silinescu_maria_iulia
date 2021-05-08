package ro.ase.cts.ChainOfResponsability.Classes;

public class ContCredit extends Cont {

    public ContCredit(Float sold) {
        super(sold);
    }

    //Oricare cont poate fi si primul si ultimul si la mijloc
    //Clientul poate realiza lantul cum vrea el
    @Override
    public void realizeazaPlata(Float suma) {
        if(super.getSold()>=suma)
        {
            System.out.println("Se realizeaza plata din contul de credit in valoare de "+suma);
            super.setSold(super.getSold()-suma);
        }
        else
        {
            if(super.getSuccesorCont()!=null)
            {
                super.getSuccesorCont().realizeazaPlata(suma);
            }
            else
            {
                System.out.println("Nu se poate realiza plata");
            }
        }
    }
}
