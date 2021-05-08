package ro.ase.cts.Command.Classes;

public class ComandaConstituire extends ComandaAbstracta {

    public ComandaConstituire(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().creeazaCont(super.getSuma());
    }
}
