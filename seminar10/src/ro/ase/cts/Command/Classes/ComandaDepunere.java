package ro.ase.cts.Command.Classes;

public class ComandaDepunere extends ComandaAbstracta {
    public ComandaDepunere(Executant executant, Float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().depunere(super.getSuma());
    }
}
