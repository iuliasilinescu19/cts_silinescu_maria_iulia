package ro.ase.cts.DesignPatterns.Builder;

public class Rezervare {
    private int codRezervare;
    private Boolean areMancareInclusa;
    private Boolean areScaunErgonomic;
    private Boolean areBauturaRacoritoareInclusa;
    private Boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzical;

    //Clasa este deja folosita in cazul aplictaiei, iar constructorul
    //are prea multi parametri->ma incurca
    public Rezervare(int codRezervare, Boolean areMancareInclusa, Boolean areScaunErgonomic, Boolean areBauturaRacoritoareInclusa, Boolean areMuzicaAmbientalaPersonalizata, String genMuzical) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        this.genMuzical = genMuzical;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancareInclusa(Boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreScaunErgonomic(Boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBauturaRacoritoareInclusa(Boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
    }

    public void setAreMuzicaAmbientalaPersonalizata(Boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturaRacoritoareInclusa=").append(areBauturaRacoritoareInclusa);
        sb.append(", areMuzicaAmbientalaPersonalizata=").append(areMuzicaAmbientalaPersonalizata);
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
