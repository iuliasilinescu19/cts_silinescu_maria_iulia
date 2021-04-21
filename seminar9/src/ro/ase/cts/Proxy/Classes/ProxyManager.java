package ro.ase.cts.Proxy.Classes;

public class ProxyManager implements Rezervabil {
    private ManagerRezervari managerRezervari;
    private int nrMinimPersoane;

    public ProxyManager(ManagerRezervari managerRezervari,int nrMinimPersoane) {
        this.managerRezervari = managerRezervari;
        this.nrMinimPersoane=nrMinimPersoane;
    }

    @Override
    public void rezerva(int nrPersoane) {
        if(nrPersoane>=this.nrMinimPersoane)
        {
           this.managerRezervari.rezerva(nrPersoane);
        }
        else
        {
            System.out.println("Rezervarea nu se poate realiza. Puteti veni fara rezervare deoarece exista locuri.");
        }
    }
}
