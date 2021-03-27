package ro.ase.cts.SimpleFactoryClasses;

public abstract class PersonalMedical {
    private String nume;
    private Float salariu;

    public PersonalMedical(String nume, Float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
