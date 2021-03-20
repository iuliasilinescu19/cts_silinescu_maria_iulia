package ro.ase.cts.Clase;

public class Main {
    public static void main(String[] args) {
        //Parlament parlament1=new Parlament("Romania",123,4,"Undeva");
        //Parlament parlament2=new Parlament("Bulgaria",456,14,"In Bulgaria");
        Parlament parlament1=Parlament.getInstance();
        Parlament parlament2=Parlament.getInstance();
        //De fiecare data cand incerc sa creez o noua instanta
        //avem shallowcopy->si de fapt se apeleaza aceeasi instanta
        //Se modifica instanta respectiva
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("------------------");
        parlament1.setTara("Belgia");
        parlament2.setNrParlamentari(300);
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("------------------");
        ParlamentLazy parlamentLazy=ParlamentLazy.getInstance("Serbia",400,8,"Sediul Serbiei");
        ParlamentLazy parlamentLazy2=ParlamentLazy.getInstance("UK",500,2,"Sediul UK");
        System.out.println(parlamentLazy.toString());
        System.out.println(parlamentLazy2.toString());

    }
}
