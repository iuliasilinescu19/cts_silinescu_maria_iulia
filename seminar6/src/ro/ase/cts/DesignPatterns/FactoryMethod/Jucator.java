package ro.ase.cts.DesignPatterns.FactoryMethod;

public abstract class Jucator {
    private String nume;
    private int nrTricou;

    public Jucator(String nume, int nrTricou) {
        this.nume = nume;
        this.nrTricou = nrTricou;
    }

    public String getNume() {
        return nume;
    }

    public int getNrTricou() {
        return nrTricou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTricou=").append(nrTricou);
        sb.append('}');
        return sb.toString();
    }
}
