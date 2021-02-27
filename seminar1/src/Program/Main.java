package Program;

public class Main {
    public static void main(String[] args)
    {
        Zoo zoo=new Zoo();
        //Am clasa animal abstracta si nu o pot initializa
        //Insa creez clasele concrete.
        Giraffe girafa1=new Giraffe("Girafa1");
        Giraffe girafa2=new Giraffe("Girafa2");
        zoo.add(girafa1);
        zoo.add(girafa2);
        zoo.feedAllAnimals();
    }
}
