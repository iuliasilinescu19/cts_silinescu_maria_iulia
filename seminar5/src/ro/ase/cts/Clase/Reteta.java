package ro.ase.cts.Clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements AbstractPrototype{
    //ar trebui sa fie mai multe solutii si mai multe cantitati
    private List<String> denumireSolutii;
    private List<Integer> cantitati;

    private Reteta() {
        //nu consuma foarte multe resurse->seteaza cu default
    }

    public Reteta(List<String> denumireSolutii, List<Integer> cantitati) {
        //Aici trebuie realizate validari pentru cantitatile solutiilor noastre.
        //Sunt importante aceste validari->consuma resurse.
        this.denumireSolutii = denumireSolutii;
        this.cantitati = cantitati;
    }

    public List<String> getDenumireSolutii() {
        return denumireSolutii;
    }

    public void setDenumireSolutii(List<String> denumireSolutii) {
        this.denumireSolutii = denumireSolutii;
    }

    public List<Integer> getCantitati() {
        return cantitati;
    }

    public void setCantitati(List<Integer> cantitati) {
        this.cantitati = cantitati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutii=").append(denumireSolutii);
        sb.append(", cantitati=").append(cantitati);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
       //incerc sa evit constructorul cu parametri
        //pot face acest lucru fara validari->nu consuma resurse pentru validari
        Reteta copie=new Reteta();
        copie.cantitati=new ArrayList<>();
        copie.cantitati.addAll(this.cantitati);
        copie.denumireSolutii=new ArrayList<>();
        copie.denumireSolutii.addAll(this.denumireSolutii);
        return copie;
    }

}
