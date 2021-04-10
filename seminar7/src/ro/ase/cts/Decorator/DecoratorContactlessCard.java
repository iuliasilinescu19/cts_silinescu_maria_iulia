package ro.ase.cts.Decorator;

public class DecoratorContactlessCard extends DecoratorAbstract {
    public DecoratorContactlessCard(CardBancar card) {
        super(card);
    }

    @Override
    public void plateseContacless() {
        System.out.println(((Card)super.getCard()).getTitular()+" a realizat o plata contactless.");
    }
}
