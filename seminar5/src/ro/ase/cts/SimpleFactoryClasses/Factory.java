package ro.ase.cts.SimpleFactoryClasses;

public class Factory {
    public PersonalMedical create(TipPersonal tip,String nume, Float salariu) {
        //ne creeaza personal medical->de asta se da si nume si salariu
        switch (tip)
        {
            case MEDIC: {
                return new Medic(nume,salariu);
            }
            case ASISTENT: {
                return new Asistent(nume,salariu);
            }
            case BRANCARDIER: {
                return new Brancardier(nume,salariu);
            }
            default:throw new IllegalArgumentException("Tipul nu este corect");
        }
    }
}
