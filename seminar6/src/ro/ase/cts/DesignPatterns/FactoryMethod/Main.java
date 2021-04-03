package ro.ase.cts.DesignPatterns.FactoryMethod;

public class Main {
    public static void afiseazaInformatiiJucator(FabricaJucator fabrica, String nume, int nrTricou)
    {
        //E un fel de modul din cadrul aplicatiei mele (ceva mai complex)
        //Nu se stie ce fel de fabrica va primi?
        Jucator jucator=fabrica.creeazaJucator(nume,nrTricou);
        //stiu doar ca mi a creat un jucator.
        System.out.println(jucator.toString());
    }
    public static void main(String[] args) {
        //Simulam ca si cum am avea un alt modul//o alta functie
        afiseazaInformatiiJucator(new FabricaAtacant(),"Popescu",15);
        afiseazaInformatiiJucator(new FabricaPortar(),"Silinescu",7);
        //daca vreau sa adaug un nou tip de jucator=mijlocas.
        afiseazaInformatiiJucator(new FabricaMijlocas(),"Andreescu",2);
    }
}
