package ro.ase.cts.SimpleFactoryClasses;

public class FactorySingleton {
    private static FactorySingleton factorySingleton=null;
    public static synchronized FactorySingleton getInstance()
    {
        if(factorySingleton==null)
        {
            factorySingleton=new FactorySingleton();
        }
        return factorySingleton;
    }

    private FactorySingleton() {
    }

    public PersonalMedical create(TipPersonal tip, String nume, Float salariu) {
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
