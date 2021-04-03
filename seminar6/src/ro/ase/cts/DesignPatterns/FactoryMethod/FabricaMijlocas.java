package ro.ase.cts.DesignPatterns.FactoryMethod;

public class FabricaMijlocas implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume,nrTricou);
    }
}
