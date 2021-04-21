package ro.ase.cts.Strategy.Classes;

public class PlataBonuriMasa implements Payable {
    @Override
    public void pay(float suma) {
        System.out.print("A fost realizata o plata cu bonuri de masa in valoare de "+suma+" lei.");
    }
}
