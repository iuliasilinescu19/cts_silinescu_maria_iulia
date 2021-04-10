package ro.ase.cts.Decorator;

public class Main {
    public static void main(String[] args) {
        Card card=new Card("Popescu Alina");
        card.platestePOS();
        card.platesteOnline();
        System.out.println("--------------------");
        DecoratorContactlessCard decoratorContactless=new DecoratorContactlessCard(card);
        decoratorContactless.plateseContacless();
        decoratorContactless.platesteOnline();
        DecoratorContactlessMobile decoratorContactlessMobile=new DecoratorContactlessMobile(card);
        decoratorContactlessMobile.plateseContacless();
    }
}
