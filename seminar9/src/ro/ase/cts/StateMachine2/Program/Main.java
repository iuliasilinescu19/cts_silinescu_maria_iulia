package ro.ase.cts.StateMachine2.Program;

import ro.ase.cts.StateMachine2.Classes.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa1=new Masa(12);
        masa1.elibereazaMasa();
        masa1.ocupaMasa();
        masa1.rezervaMasa();
        masa1.elibereazaMasa();
    }
}
