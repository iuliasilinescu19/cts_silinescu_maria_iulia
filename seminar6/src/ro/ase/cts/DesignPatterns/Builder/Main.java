package ro.ase.cts.DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare(1,true,true,false,true,"rock");
        //Acum ce bine ar fi daca as face un builder->nu o sa pot face cu inner class

        BuilderRezervare builderRezervare=new BuilderRezervare()
                .setCodRezervare(2)
                .setAreBauturaRacoritoareInclusa(true)
                .setAreScaunErgonomic(true).setGenMuzical("Indie");
        Rezervare rezervare2=builderRezervare.build();
        System.out.println(rezervare2.toString());

        //Mai eficient:
        Rezervare rezervare3=new BuilderRezervare()
                .setCodRezervare(3)
                .setGenMuzical("Pop")
                .setAreScaunErgonomic(true)
                .build();
        System.out.println(rezervare3.toString());

        Rezervare rezervare4=builderRezervare.setCodRezervare(4).build();

        BuilderRezervareV2 builderV2=new BuilderRezervareV2().setAreMancareInclusa(true)
                .setAreScaunErgonomic(true)
                .setAreBauturaRacoritoareInclusa(true);
        Rezervare rez1=builderV2.setCodRezervare(10).build();
        Rezervare rez2=builderV2.setCodRezervare(11).build();
        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
