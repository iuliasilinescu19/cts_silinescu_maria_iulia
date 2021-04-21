package ro.ase.cts.Proxy.Program;

import ro.ase.cts.Proxy.Classes.ManagerRezervari;
import ro.ase.cts.Proxy.Classes.ProxyManager;

public class Main {
    public static void main(String[] args) {
        ManagerRezervari managerRezervari=new ManagerRezervari("Andromeda");
        managerRezervari.rezerva(2);
        ProxyManager proxyManager=new ProxyManager(managerRezervari,4);
        proxyManager.rezerva(2);
        proxyManager.rezerva(4);
    }
}
