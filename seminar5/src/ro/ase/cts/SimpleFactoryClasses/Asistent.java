package ro.ase.cts.SimpleFactoryClasses;

public class Asistent extends PersonalMedical {
    private int durataLucru;

    public Asistent(String nume, Float salariu, int durataLucru) {
        super(nume, salariu);
        this.durataLucru = durataLucru;
    }

    public void setDurataLucru(int durataLucru) {
        this.durataLucru = durataLucru;
    }

    public Asistent(String nume, Float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
