package ro.ase.cts.Adapter;
//adapter de obiecte
public class AdapterLeasing implements Creditable {
    private Leasing leasing;

    public AdapterLeasing(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void crediteaza() {
        this.leasing.oferaLeasing();
    }
}
