package decorator;

public class LemonWater extends FlavourDecorator{
    public LemonWater(Beverage beverage) {
        this.bevarage = beverage;
    }
    @Override
    public int cost() {
        return 14 + bevarage.cost();
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + ",Lemon";
    }
}
