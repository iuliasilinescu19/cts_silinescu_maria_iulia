package ro.ase.cts.Facade.Program;

import ro.ase.cts.Facade.Classes.Facade;
import ro.ase.cts.Facade.Classes.Masa;
import ro.ase.cts.Facade.Classes.OperatorMese;
import ro.ase.cts.Facade.Classes.Picolo;

public class Main {
    public static void main(String[] args) {
        Masa masa1=new Masa(1,10);
        if(OperatorMese.esteLibera(masa1.getNrMasa()))
        {
            Picolo picolo1=new Picolo("Gigel");
            if(picolo1.esteDebarasata(masa1.getNrMasa()))
            {
                if(picolo1.esteAranjata(masa1.getNrMasa()))
                {
                    System.out.println("Poftiti, va rog, la masa!");
                }
                else
                {
                    System.out.println("Masa nu este aranjata inca. Mai asteptati putin!");
                }
            }
            else
            {
                System.out.println("Masa nu este debarasata! Mai asteptati!");
            }
        }
        else
        {
            System.out.println("Masa nu este libera. Mai asteptati putin!");
        }

        if(Facade.esteMasaPregatita(new Masa(30,4)))
        {
            System.out.println("Poftiti, va rog, la masa!");
        }
        else
        {
            System.out.println("Masa nu este libera. Mai asteptati putin!");
        }
    }
}
