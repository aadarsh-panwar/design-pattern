package decorator;

public class SoyFlavour extends FlavourDecorator{

    public SoyFlavour(Beverage beverage) {
        this.bevarage = beverage;
    }
    @Override
    public int cost() {
        return this.bevarage.cost() + 5;
    }

    @Override
    public String getDescription() {
        return this.bevarage.getDescription() + ",Soy";
    }
}
