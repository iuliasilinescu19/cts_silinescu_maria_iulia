package ro.ase.cts.DesignPatterns.Builder;

import javafx.util.Builder;

import java.io.BufferedOutputStream;

public class BuilderRezervare implements AbstractBuilder{
    Rezervare rezervare=null;
    @Override
    public Rezervare build() {
        return rezervare;
    }
    //conform cerintei toate sunt false by default.
    //pot avea mai mult buildere concrete
    public BuilderRezervare() {
        this.rezervare=new Rezervare(0,false,false,false,false,"");
    }

    public BuilderRezervare(int codRezervare) {
        this.rezervare=new Rezervare(codRezervare,false,false,false,false,"");
    }

    public BuilderRezervare setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public BuilderRezervare setAreMancareInclusa(Boolean areMancareInclusa) {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }

    public BuilderRezervare setAreScaunErgonomic(Boolean areScaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public BuilderRezervare setAreBauturaRacoritoareInclusa(Boolean areBauturaRacoritoareInclusa) {
        this.rezervare.setAreBauturaRacoritoareInclusa(areBauturaRacoritoareInclusa);
        return this;
    }

    public BuilderRezervare setAreMuzicaAmbientalaPersonalizata(Boolean areMuzicaAmbientalaPersonalizata) {
        this.rezervare.setAreMuzicaAmbientalaPersonalizata(areMuzicaAmbientalaPersonalizata);
        return this;
    }

    public BuilderRezervare setGenMuzical(String genMuzical) {
        this.rezervare.setGenMuzical(genMuzical);
        return this;
    }

}
