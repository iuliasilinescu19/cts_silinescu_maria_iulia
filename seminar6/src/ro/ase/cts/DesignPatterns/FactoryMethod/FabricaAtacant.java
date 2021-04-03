package ro.ase.cts.DesignPatterns.FactoryMethod;

public class FabricaAtacant implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Atacant(nume,nrTricou);
    }
}
