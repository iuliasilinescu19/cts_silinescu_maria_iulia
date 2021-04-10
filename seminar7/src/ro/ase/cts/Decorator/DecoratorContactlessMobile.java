package ro.ase.cts.Decorator;

public class DecoratorContactlessMobile extends DecoratorAbstract {

    public DecoratorContactlessMobile(CardBancar card) {
        super(card);
    }

    @Override
    public void plateseContacless() {
        System.out.println(((Card)super.getCard()).getTitular()+" a realizat o plata contactless cu telefonul.");
    }
}
