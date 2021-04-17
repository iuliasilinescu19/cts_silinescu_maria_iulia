package ro.ase.cts.Flyweight;

public class Rezervare {
    private int nrRezervare;
    private int nrMasa;

    public Rezervare(int nrRezervare, int nrMasa) {
        this.nrRezervare = nrRezervare;
        this.nrMasa = nrMasa;
    }


    public int getNrRezervare() {
        return nrRezervare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrRezervare=").append(nrRezervare);
        sb.append(", nrMasa=").append(nrMasa);
        sb.append('}');
        return sb.toString();
    }
}
