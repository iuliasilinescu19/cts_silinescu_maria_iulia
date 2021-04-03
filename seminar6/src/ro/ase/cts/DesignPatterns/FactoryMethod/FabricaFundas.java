package ro.ase.cts.DesignPatterns.FactoryMethod;

public class FabricaFundas implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Fundas(nume,nrTricou);
    }
}
