package ro.ase.cts.Adapter;

public class AdapterLeasingClase extends Leasing implements Creditable{

    public AdapterLeasingClase(String numeClient, int suma) {
        super(numeClient, suma);
    }

    @Override
    public void crediteaza() {
        super.oferaLeasing();
    }
}
