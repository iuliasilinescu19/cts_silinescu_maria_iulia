package ro.ase.cts.Adapter;


public class Main {
    public static void printeazaInformatiiCredit(Creditable credit)
    {
        credit.crediteaza();
    }
    public static void main(String[] args) {

        //Am achizitionat un now framework
        Leasing leasing=new Leasing("Silinescu Iulia",
                20000);
        //Mi-am creat acest obiect dar nu pot sa il folosesc
        //in cadrul aplicatiei mele. Clasa lucreaza doar cu
        //Creditable ->Clasele noastre nu sunt compatibile
        AdapterLeasing adapterLeasing=new AdapterLeasing(leasing);
        adapterLeasing.crediteaza();
        //POt sa folosesc si functia de printare->nu erau compatibile
        System.out.println("----------------------------");
        printeazaInformatiiCredit(adapterLeasing);
        System.out.println("----------------------------");
        AdapterLeasingClase adapterLeasingClase=new AdapterLeasingClase("Silinescu Adriana",20003);
        adapterLeasingClase.crediteaza();
    }
}
