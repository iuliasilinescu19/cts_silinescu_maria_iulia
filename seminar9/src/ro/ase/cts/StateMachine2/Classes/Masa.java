package ro.ase.cts.StateMachine2.Classes;

import ro.ase.cts.StateMachine.Classes.State;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new StareLibera();
    }
    void setStare(Stare stare)
    {
        this.stare=stare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public Stare getStare() {
        return stare;
    }
    public void ocupaMasa()
    {
        StareOcupata stareOcupata=new StareOcupata();
        stareOcupata.modificaStare(this);
    }
    public void elibereazaMasa()
    {
        StareLibera stareLibera=new StareLibera();
        stareLibera.modificaStare(this);
    }
    public void rezervaMasa()
    {
        StareRezervata stareRezervata=new StareRezervata();
        stareRezervata.modificaStare(this);
    }
}
