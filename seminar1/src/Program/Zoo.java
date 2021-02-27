package Program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zookeper zookeper;
    private List<Animal> animals;

    public Zoo(Zookeper zookeper, List<Animal> animals) {
        this.zookeper = zookeper;
        this.animals = animals;
    }
    public Zoo()
    {
        this.animals=new ArrayList<>();
        this.zookeper=new Zookeper("GIGEL");
    }
    //metoda de adaugare un animal in colectie
    public void add(Animal animal)
    {
        this.animals.add(animal);
    }

    //Am lista de animale, ingrijitorul care stie sa hraneasca un animal
    //feed all animals;
    public void feedAllAnimals()
    {
        for(Animal animal:animals)
        {
            zookeper.feed(animal);
        }
    }
}
