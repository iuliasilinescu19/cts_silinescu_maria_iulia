package ro.ase.cts.Command.Classes;

public abstract class ComandaAbstracta {
    //Comanda va fi ca un dosar: vine clientul la operator si
    //vrea sa faca ceva->trebuie sa contina toate info necesare
    private Executant executant;
    private Float suma;

    public ComandaAbstracta(Executant executant, Float suma) {
        this.executant = executant;
        this.suma = suma;
    }

    public Executant getExecutant() {
        return executant;
    }

    public void setExecutant(Executant executant) {
        this.executant = executant;
    }

    public Float getSuma() {
        return suma;
    }

    public void setSuma(Float suma) {
        this.suma = suma;
    }

    public abstract void executa();
}
