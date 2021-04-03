package ro.ase.cts.DesignPatterns.FactoryMethod;

public class FabricaPortar implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Portar(nume,nrTricou);
    }
}
