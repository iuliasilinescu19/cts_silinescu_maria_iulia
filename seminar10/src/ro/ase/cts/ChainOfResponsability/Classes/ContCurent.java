package ro.ase.cts.ChainOfResponsability.Classes;

public class ContCurent extends Cont {

    public ContCurent(Float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(Float suma) {
        if(super.getSold()>suma)
        {
            System.out.println("Se realizeaza plata din contul curent in valoare de "+suma);
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
