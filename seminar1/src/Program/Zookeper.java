package Program;

public class Zookeper {
    private String name;

    public Zookeper(String name) {
        this.name = name;
    }

    public void feed(Animal animal)
    {
        System.out.println(this.name+" feeds "+animal.getName());
    }
}
