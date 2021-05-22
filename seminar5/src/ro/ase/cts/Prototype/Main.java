package ro.ase.cts.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> solutii=new ArrayList<>();
        solutii.add("apa");
        List<Integer> cantitati=new ArrayList<>();
        cantitati.add(10);
        Reteta reteta1=new Reteta(solutii,cantitati);
        Reteta reteta2=(Reteta)reteta1.copiaza();
        System.out.println(reteta1.toString());
        System.out.println(reteta2.toString());
        //pentru supraverificare putem face un if pe referinte
        //Ne putem folosi si de CLoneable (care reprezinta de afapt, clasa Abstracta propriu zisa)

    }
}
