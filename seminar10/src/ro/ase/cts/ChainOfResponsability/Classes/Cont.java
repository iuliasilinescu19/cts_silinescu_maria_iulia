package ro.ase.cts.ChainOfResponsability.Classes;

public abstract class Cont {
    private Float sold;
    private Cont succesorCont;

    public Cont(Float sold) {
        this.sold = sold;
        this.succesorCont=null;
    }

    public Float getSold() {
        return sold;
    }

    public void setSold(Float sold) {
        this.sold = sold;
    }

    public Cont getSuccesorCont() {
        return succesorCont;
    }

    public void setSuccesorCont(Cont succesorCont) {
        this.succesorCont = succesorCont;
    }

    public abstract void realizeazaPlata(Float suma);
}
