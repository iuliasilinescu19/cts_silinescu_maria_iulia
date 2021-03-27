package ro.ase.cts.SimpleFactoryClasses;

public class Main {
    public static void main(String[] args) {
       //creez o fabrica si cu ajutorul fabricii creez un medic/asistent
        Factory factory=new Factory();
        PersonalMedical medic=factory.create(TipPersonal.MEDIC,"Silinescu",8000f);
        PersonalMedical brancardier=factory.create(TipPersonal.BRANCARDIER,"Rotaru",3990f);
        System.out.println(medic);
        System.out.println(brancardier);
        //el nu interactioneaza cu clasele concrete.

        //FactorySingleton:
        PersonalMedical medic2=FactorySingleton.getInstance().create(TipPersonal.MEDIC,"ALINA AVRAM",388f);
        System.out.println(medic2);
    }
}
