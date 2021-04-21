package ro.ase.cts.Strategy.Classes;

public class Client {
    private String numeClient;
    private Payable plata;

    public Client(String numeClient, Payable plata) {
        this.numeClient = numeClient;
        this.plata = plata;
    }

    public Payable getPlata() {
        return plata;
    }

    public void setPlata(Payable plata) {
        this.plata = plata;
    }

    public void platesteNota(float suma)
    {
        System.out.println(this.numeClient+" are de realizat o plata.");
        this.plata.pay(suma);
    }
}
