package ro.ase.cts.Command.Classes;

public class ComandaRetragere extends ComandaAbstracta {

    public ComandaRetragere(Executant executant, Float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().retragere(super.getSuma());
    }
}
