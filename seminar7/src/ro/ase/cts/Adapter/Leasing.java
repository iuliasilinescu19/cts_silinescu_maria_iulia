package ro.ase.cts.Adapter;

public class Leasing {
    private String numeClient;
    private int suma;

    public Leasing(String numeClient, int suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Leasing{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }

    public void oferaLeasing()
    {
        System.out.println("Pentru clientul "+this.numeClient+" i-a fost oferita suma de "+this.suma+" euro.");
    }
}
