package ro.ase.cts.Command.Classes;

public class Executant {
    //Este un cont bancar->face mai multe operatiuni
    private Float sold;
    private String detinator;

    public Executant(String detinator) {
        this.detinator = detinator;
    }

    public Float getSold() {
        return sold;
    }

    public void setSold(Float sold) {
        this.sold = sold;
    }

    public String getDetinator() {
        return detinator;
    }

    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }

    //Avem nevoie de cele trei actiuni pe care le realizeaza
    public void creeazaCont(Float sold){
        this.sold=sold;
        System.out.println("S-a constituit contul cu suma" +
                "de "+this.sold+" lei.");
    }
    public void retragere(Float suma)
    {
        if(this.sold>=suma)
        {
            this.sold-=suma;
            System.out.print("S-a retras suma de "+suma+" lei.");
        }
        else
        {
            System.out.println("Fonduri insuficiente");
        }
    }
    public void depunere(Float suma)
    {
        this.sold+=suma;
        System.out.println("S-a depus suma de "+suma+" lei.");
    }
}
