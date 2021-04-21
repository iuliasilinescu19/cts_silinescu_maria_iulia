package ro.ase.cts.Strategy.Classes;

public class PlataCard implements Payable {
    @Override
    public void pay(float suma) {
        System.out.print("A fost realizata o plata cu cardul in valoare de "+suma+" lei.");
    }
}
