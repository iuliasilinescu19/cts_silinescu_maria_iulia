package ro.ase.cts.StateMachine.Program;

import ro.ase.cts.StateMachine.Classes.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa1=new Masa(1);
        masa1.cerereEliberare();
        masa1.cerereRezervare();
        masa1.cerereOcupare();
        masa1.cerereRezervare();
        masa1.cerereEliberare();
    }
}
