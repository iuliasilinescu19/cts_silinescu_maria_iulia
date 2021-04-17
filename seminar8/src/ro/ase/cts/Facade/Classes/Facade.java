package ro.ase.cts.Facade.Classes;

public class Facade {
    public static Boolean esteMasaPregatita(Masa masa)
    {
        if(OperatorMese.esteLibera(masa.getNrMasa()))
        {
            Picolo picolo1=new Picolo("Gigel");
            if(picolo1.esteDebarasata(masa.getNrMasa()))
            {
                if(picolo1.esteAranjata(masa.getNrMasa()))
                {
                   return true;
                }
            }
        }
        return false;
    }

}
