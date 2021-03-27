package ro.ase.cts.SimpleFactoryClasses;

public class Medic extends PersonalMedical {
    public Medic(String nume, Float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
