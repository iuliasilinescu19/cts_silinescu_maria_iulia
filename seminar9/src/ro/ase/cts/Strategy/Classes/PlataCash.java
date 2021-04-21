package ro.ase.cts.Strategy.Classes;

public class PlataCash implements Payable {
    @Override
    public void pay(float suma) {
        System.out.print("A fost realizata o plata cash in valoare de "+suma+" lei.");
    }
}
