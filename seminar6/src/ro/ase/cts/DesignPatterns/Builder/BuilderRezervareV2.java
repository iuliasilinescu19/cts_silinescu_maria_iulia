package ro.ase.cts.DesignPatterns.Builder;

public class BuilderRezervareV2 implements AbstractBuilder {
    private int codRezervare;
    private Boolean areMancareInclusa;
    private Boolean areScaunErgonomic;
    private Boolean areBauturaRacoritoareInclusa;
    private Boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzical;
    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,areMancareInclusa,areScaunErgonomic,areBauturaRacoritoareInclusa,areMuzicaAmbientalaPersonalizata,genMuzical);
    }

    public BuilderRezervareV2() {
        codRezervare=1000;
        genMuzical="Rock";
    }

    public BuilderRezervareV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public BuilderRezervareV2 setAreMancareInclusa(Boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreScaunErgonomic(Boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervareV2 setAreBauturaRacoritoareInclusa(Boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreMuzicaAmbientalaPersonalizata(Boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        return this;
    }

    public BuilderRezervareV2 setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }
}
