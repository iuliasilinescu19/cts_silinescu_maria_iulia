package ro.ase.cts.Flyweight;

import ro.ase.cts.Flyweight.Client;
import ro.ase.cts.Flyweight.FlyweightAbstract;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private Map<String, FlyweightAbstract> clienti;


    public FlyWeightFactory() {
        clienti=new HashMap<>();
    }

    public FlyweightAbstract getClient(String nrTelefon)
    {
        FlyweightAbstract client=this.clienti.get(nrTelefon);
        if(client==null)
        {
            client=new Client("Andrescu",nrTelefon,"andreescu@gmail.com");
            clienti.put(nrTelefon,client);
        }
        return client;
    }
}
