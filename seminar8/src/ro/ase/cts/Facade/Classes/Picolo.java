package ro.ase.cts.Facade.Classes;

    class Picolo {
    //o masa a fost deja debaranjata?aranjata
    private String nume;

    public Picolo(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Boolean esteDebarasata(int nrMasa)
    {
        return nrMasa%3==0;
    }

    public Boolean esteAranjata(int nrMasa)
    {
        return nrMasa%5==0;
    }
}
