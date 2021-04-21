package ro.ase.cts.StateMachine.Classes;

public class Masa {
    private int nrMasa;
    private State stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new Libera();
    }

    public void cerereRezervare()
    {
        if(this.stare instanceof Libera)
        {
            System.out.println("Masa cu id-ul "+this.nrMasa+" a fost rezervata");
            this.stare=new Rezervata();
        }
        else
        {
            System.out.println("Masa cu id-ul "+this.nrMasa+" nu poate fi rezervata");
        }
    }

    public void cerereOcupare()
    {
        if(!(this.stare instanceof Ocupata))
        {
            System.out.println("Masa cu id-ul "+this.nrMasa+" a fost ocupata");
            this.stare=new Ocupata();
        }
        else
        {
            System.out.println("Masa cu id-ul "+this.nrMasa+" nu poate fi ocupata");
        }
    }

    public void cerereEliberare()
    {
        if(!(this.stare instanceof Libera))
        {
            System.out.println("Masa cu id-ul "+this.nrMasa+" a fost eliberata");
            this.stare=new Libera();
        }
        else
        {
            System.out.println("Masa cu id-ul "+this.nrMasa+" nu poate fi eliberata");
        }
    }

}
