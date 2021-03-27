package ro.ase.cts.PrototypeClasses;

public class Parlament {
    private String tara;
    private int nrParlamentari;
    private int durataMandat;
    private String denumireSediu;
    //Eager initialization (la momentul declararii instantei->se va face initializarea)
    //Exista si later Initialization (amana momentul cat mai mult)
    private static Parlament parlament=new Parlament();

    public static Parlament getInstance() {
        return parlament;
    }

    private Parlament() {
        this.tara="";
        this.nrParlamentari=0;
        this.durataMandat=0;
        this.denumireSediu="";
    }

    private Parlament(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
        this.tara = tara;
        this.nrParlamentari = nrParlamentari;
        this.durataMandat = durataMandat;
        this.denumireSediu = denumireSediu;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public int getNrParlamentari() {
        return nrParlamentari;
    }

    public void setNrParlamentari(int nrParlamentari) {
        this.nrParlamentari = nrParlamentari;
    }

    public int getDurataMandat() {
        return durataMandat;
    }

    public void setDurataMandat(int durataMandat) {
        this.durataMandat = durataMandat;
    }

    public String getDenumireSediu() {
        return denumireSediu;
    }

    public void setDenumireSediu(String denumireSediu) {
        this.denumireSediu = denumireSediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parlament{");
        sb.append("tara='").append(tara).append('\'');
        sb.append(", nrParlamentari=").append(nrParlamentari);
        sb.append(", durataMandat=").append(durataMandat);
        sb.append(", denumireSediu='").append(denumireSediu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
