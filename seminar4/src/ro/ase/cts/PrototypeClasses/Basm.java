package ro.ase.cts.PrototypeClasses;

public class Basm {
    private String titlu;
    private int nrAutori;
    private Boolean estePopular;
    private static Basm basm=null;

    public static synchronized Basm getInstance(String titlu, int nrAutori,Boolean estePopular){
        if(basm==null)
        {
            basm=new Basm(titlu,nrAutori,estePopular);
        }
        return basm;
    }

    private Basm() {
        this.titlu="";
        this.nrAutori=0;
        this.estePopular=null;
    }

    private Basm(String titlu, int nrAutori, Boolean estePopular) {
        this.titlu = titlu;
        this.nrAutori = nrAutori;
        this.estePopular = estePopular;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getNrAutori() {
        return nrAutori;
    }

    public void setNrAutori(int nrAutori) {
        this.nrAutori = nrAutori;
    }

    public Boolean getEstePopular() {
        return estePopular;
    }

    public void setEstePopular(Boolean estePopular) {
        this.estePopular = estePopular;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basm{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", nrAutori=").append(nrAutori);
        sb.append(", estePopular=").append(estePopular);
        sb.append('}');
        return sb.toString();
    }
}
