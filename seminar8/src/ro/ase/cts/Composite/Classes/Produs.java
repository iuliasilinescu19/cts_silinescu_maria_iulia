package ro.ase.cts.Composite.Classes;

public class Produs implements ComponentaAbstracta {
    private String numeProdus;
    @Override
    public void printareElement() {
        System.out.print("Produsul "+this.numeProdus);
    }

    public Produs(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        throw new UnsupportedOperationException();
    }
}
